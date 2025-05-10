class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum = 0, maxSum = 0;

        for(int i=0;i<k;i++) {
            windowsum += nums[i];
        }
        maxSum = windowsum;

        for(int i=k;i<nums.length;i++) {
            windowsum += nums[i] - nums[i - k]; 
            maxSum = Math.max(maxSum, windowsum);
        }
        return (double) maxSum/k;
    }
}