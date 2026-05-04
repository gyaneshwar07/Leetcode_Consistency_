/*
 * Problem: 1752. Check if Array Is Sorted and Rotated
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
 * Language: java
 * Date: 2026-05-04
 */

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=1;i<n;i++){
           if(nums[i]<nums[i-1]) count++;
        }
        if(nums[0]<nums[n-1]) count++;
        if(count<=1) return true;
        return false;
    }
}
