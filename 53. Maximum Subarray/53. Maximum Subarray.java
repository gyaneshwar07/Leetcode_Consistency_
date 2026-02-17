/*
 * Problem: 53. Maximum Subarray
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/maximum-subarray/
 * Language: java
 * Date: 2026-02-17
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
           sum += nums[i];
           mx = Math.max(mx,sum);
           if(sum<0) sum=0;
        }
        return mx;
    }
}

