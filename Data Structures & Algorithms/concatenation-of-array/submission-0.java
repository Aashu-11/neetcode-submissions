class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for(int i = 0 ;  i < nums.length ; i ++){
            arr[i] = nums[i];
        }
        int idx= 0;
        for(int i = nums.length ; i < 2 * nums.length ; i ++){
            arr[i] = nums[idx ++];
        }
        return arr;
    }
}