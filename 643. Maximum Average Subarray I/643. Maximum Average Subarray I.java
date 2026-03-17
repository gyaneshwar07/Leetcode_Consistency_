/*
 * Problem: 643. Maximum Average Subarray I
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/maximum-average-subarray-i/description/
 * Language: java
 * Date: 2026-03-17
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double ans = Double.NEGATIVE_INFINITY;
        double avg = 0.00000;
        int sum = 0;
        int i = 0 , j = k-1;
        for(int a=0;a<=j;a++){
           sum += nums[a];
        }
        avg = (double)sum/k;
        ans = Math.max(ans,avg);

        while(j<n-1){
            i++; j++;
            sum = (sum - nums[i-1]) + nums[j];
            avg = (double)sum/k;
            ans = Math.max(ans,avg);
        }
        return ans;
    }
}
