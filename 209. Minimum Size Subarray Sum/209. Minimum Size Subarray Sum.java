/*
 * Problem: 209. Minimum Size Subarray Sum
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/minimum-size-subarray-sum/
 * Language: java
 * Date: 2026-02-20
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int len = n+1;
        int sum = 0;
        int i = 0;
        for(int j=0;j<n;j++){
            sum += nums[j];
            while(sum>=target){
                len = Math.min(len,j-i+1);
                sum -= nums[i];
                i++;
            }
        }
        return (len==n+1) ? 0 : len;
    }
}
