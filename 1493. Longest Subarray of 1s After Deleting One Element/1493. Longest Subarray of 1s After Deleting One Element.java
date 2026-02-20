/*
 * Problem: 1493. Longest Subarray of 1's After Deleting One Element
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
 * Language: java
 * Date: 2026-02-20
 */

class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int numZero = 0;
        int count = 0;
        int len = Integer.MIN_VALUE;

        for(int ele : nums){
            if(ele==0) numZero++;
        }
        if(numZero==0) return n-1;

        int i=0;
        while(i<n && nums[i]==0){
            i++;
        }
        if(i==n) return 0;
        int j = i;
        while(j<n){
            if(nums[j]==1) j++;
            else{
                if(count==0){
                    count++;
                    j++;
                }
                else{
                    len = Math.max(len,j-i-1);
                    j++;
                    while(nums[i]==1) i++;
                    i++;
                }
            }
        }
        //0 1 1 
        if(count==0) return n-i;
        len = Math.max(len,j-i-1);
        return len;
    }
}
