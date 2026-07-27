class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        String s = "";
        int len = Math.min(arr1.length , arr2.length);
        int rem = Math.abs(len - Math.max(word1.length() , word2.length()));
        for(int i = 0 ; i < len ; i ++ ){
            s += arr1[i];
            s += arr2[i];
        }
        if(arr1.length > arr2.length){
            for(int i = arr2.length ; i < arr1.length ; i ++){
                s += arr1[i];
            }
        }else{
            for(int i = arr1.length ; i < arr2.length ; i ++){
                s += arr2[i];
            }
        }
        return s;
        
    }
}