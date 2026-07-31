class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int min_length = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }

        if (sum2 < target) {
            return 0;
        }

        while (end != nums.length) {
            sum += nums[end];
            list.add(nums[end]);
            end++;

            while (sum >= target) {
                min_length = Math.min(min_length, list.size());

                sum -= list.get(0);
                list.remove(0);
                start++;
            }
        }

        return min_length;
    }
}