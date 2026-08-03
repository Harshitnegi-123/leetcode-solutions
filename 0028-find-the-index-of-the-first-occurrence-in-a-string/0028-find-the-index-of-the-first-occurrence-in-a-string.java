class Solution {
    public int strStr(String haystack, String needle) {
        int FinalIndex = haystack.length() - needle.length() ;
        int k ;
        for(int i = 0 ; i <= FinalIndex ; i++){
            for(k = 0 ; k < needle.length() ; k++){
                char H = haystack.charAt(i + k);
                char N = needle.charAt(k);
                if(H != N){
                    break ;
                }
            }
            if(k == needle.length()) return i ;
        }
        return -1 ; 
    }
}