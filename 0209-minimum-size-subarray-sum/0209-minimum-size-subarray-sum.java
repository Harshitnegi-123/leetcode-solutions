class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 ;
        int currentsum = 0 ; 
        int answer = Integer.MAX_VALUE ;
        
        for(int right = 0 ; right < nums.length ; right++){
            currentsum += nums[right] ; 
            while(currentsum >= target){
                answer = Math.min(answer , right - left + 1) ;
                currentsum -= nums[left] ;
                left++ ;
            }
        }
        if(answer == Integer.MAX_VALUE){
            return 0 ;
        }
        return answer ;
    }
}