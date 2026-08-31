class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> set =  new HashSet<>();
        int left = 0 ;
        int answer = 0 ;
        for(int right = 0 ; right < s.length(); right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                char L = s.charAt(left);
                set.remove(L);
                left++;
            }
                set.add(ch);
                answer = Math.max(answer , right - left + 1);
        }
        return answer ; 
    }
}