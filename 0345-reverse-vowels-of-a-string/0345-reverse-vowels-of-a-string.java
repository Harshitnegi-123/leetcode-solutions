class Solution {
    public String reverseVowels(String s) {
        int left = 0 ;
        int right = s.length() - 1 ;
        StringBuilder sb = new StringBuilder(s) ; 
        while(left < right){
            char L = sb.charAt(left);
            char R = sb.charAt(right);
            if("aeiouAEIOU".indexOf(L) == -1){
                left++;
            }
            else if("aeiouAEIOU".indexOf(R) == -1){
                right--;
            }
            else{
                char temp = sb.charAt(right);
                sb.setCharAt(right , L);
                sb.setCharAt(left , temp);
                left++;
                right--;
            }
        }
        String ans = sb.toString();
        return ans ;
    }
}