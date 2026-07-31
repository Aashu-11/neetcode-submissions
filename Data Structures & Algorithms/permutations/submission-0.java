class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        permute(nums , nums.length , list , 0);
        return list;
    }
    public void permute(int[] nums , int n  , List<List<Integer>> mega  , int index){
        if(index == n){
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }
            if(!mega.contains(list)){
                mega.add(list);
            }
            return;
        }
        for(int i = 0  ; i < nums.length ; i ++){
            swap(nums , index , i);
            permute(nums , n , mega , index+1);
            swap(nums , index , i);
        }
        permute(nums , n , mega , index+1);

    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
