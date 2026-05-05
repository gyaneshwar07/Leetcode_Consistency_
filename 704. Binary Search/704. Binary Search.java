/*
 * Problem: 704. Binary Search
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/binary-search/description/
 * Language: java
 * Date: 2026-05-05
 */

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) hi=mid-1;
            else lo = mid+1;
        }
        return -1;
    }
}
