class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0 ; 
        int end = 0; 
        int max_length = 0;
        List<Character> list= new ArrayList<>();

        while(end != s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end += 1;
                 max_length = Math.max(max_length, list.size());

            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start ++ ;
            }
        }
        System.out.println(list);
        return max_length;
    }
}
