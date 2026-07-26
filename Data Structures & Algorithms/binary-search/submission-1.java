class Solution {
    public int search(int[] nums, int target) {
        int low = 0 , high = nums.length-1;
        int mid = 0;
        int ans = -1;
        Arrays.sort(nums);
        while(low <= high){
            mid = low + ((high - low) / 2);
            if(nums[mid] > target){
                high = mid -1;
            }
            if(nums[mid] < target){
                low = mid + 1;
            }
            if(nums[mid] == target){
                return mid;
            }
        }
        return ans;
    }
}
