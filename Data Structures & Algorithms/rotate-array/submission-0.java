class Solution {
    public void rotate(int[] nums, int k) {
        int[] rot = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int idx = (i + k) % nums.length;
            rot[idx] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rot[i];
        }
    }
}