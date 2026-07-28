class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0 ; 
        int j = 0 ;
        while(j < t.length()){
            char T = t.charAt(j);
            if(i == s.length()){
                return true ;
            }
            char S = s.charAt(i);
            if(S == T){
                i++;
            }
            j++;
        }
        if(i != s.length()){
                return false ;
            }
    return true ;
    }
}