/*
 * Problem: 485. Max Consecutive Ones
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/max-consecutive-ones/description/
 * Language: java
 * Date: 2026-03-17
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0 , j = 0;
        int len = 0;
        while(j<n){
           while(j<n && nums[j]==1) j++;
           len = Math.max(len,(j-i));
           j++;
           i=j;
        }
        return len;
    }
}
