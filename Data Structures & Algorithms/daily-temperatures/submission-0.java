class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < temperatures.length; i++) {
            boolean found = false;

            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    list.add(j - i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                list.add(0);
            }
        }

        int[] arr = new int[temperatures.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}