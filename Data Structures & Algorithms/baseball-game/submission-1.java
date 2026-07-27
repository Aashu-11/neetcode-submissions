class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = operations.length - 1; i >= 0; i--) {
            stack.push(operations[i]);
        }

        for (int i = 0; i < operations.length; i++) {
            String popped = stack.pop();
            if (Character.isDigit(popped.charAt(0)) || popped.charAt(0) == '-') {
                list.add(Integer.parseInt(popped));
            } else if (popped.equals("+")) {
                int n = list.size();
                list.add(list.get(n - 1) + list.get(n - 2));
            } else if (popped.equals("C")) {
                list.remove(list.size() - 1);
            } else { 
                list.add(list.get(list.size() - 1) * 2);
            }
        }

        int ans = 0;

        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i);
        }

        return ans;
    }
}