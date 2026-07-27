class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();
        int limit = nums.length / 3;

        for (int key : map.keySet()) {
            if (map.get(key) > limit) {
                ans.add(key);
            }
        }

        return ans;
    }
}