class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0 ;
        int maxsum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
            maxsum = sum;
        for(int i = k ; i<nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            if(maxsum<sum){
                maxsum = sum ;
            }
        }
        double avg = (double) maxsum / k ;
        return avg;
    }
}