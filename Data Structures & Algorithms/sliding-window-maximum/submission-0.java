class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length - k + 1];
        int idx = 0;
        for(int i = 0 ; i <= nums.length - k ; i ++){
            int max  = -111;
            for(int j = i ; j < i + k ; j ++ ){
                if(nums[j] > max)
                    max = nums[j];
            }
            ans[idx ++ ] = max;
        }
    return ans;
    }
}
