class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = nums.length - 1 ;  j> i ; j --){
                if(nums[i] + nums[j] == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] arr = new int[2];
        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
