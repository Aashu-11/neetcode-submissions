class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int mask = 0 ; mask < (1 << nums.length) ; mask ++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0 ;  j < nums.length ; j ++){
                if((mask & (1 << j)) != 0){
                    l.add(nums[j]);
                }
            }
             if(!list.contains(l)){
                list.add(l);
           }
        }
        return list;
    }
}
