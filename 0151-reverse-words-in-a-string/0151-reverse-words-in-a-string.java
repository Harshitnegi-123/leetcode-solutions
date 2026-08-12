class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        int left = 0 ;
        int right = word.length - 1 ;
        while(left < right){
            String swap = word[right];
            word[right] = word[left];
            word[left] = swap;
            left++;
            right--;
        } 
        String Ans = String.join(" " , word);
        return Ans;
    }
}