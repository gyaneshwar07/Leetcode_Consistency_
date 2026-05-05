/*
 * Problem: 704. Binary Search
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/binary-search/
 * Language: java
 * Date: 2026-05-05
 */

class Solution {
    public int Solve(int[] nums , int lo , int hi , int k){
        if(lo>hi){
            return -1;
        }
        int mid = lo + (hi-lo)/2;
        if(nums[mid]==k) return mid;
        else if(nums[mid]>k)  return Solve(nums,lo,mid-1,k);
        else return Solve(nums,mid+1,hi,k);
        
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return Solve(nums,0,n-1,target);
    }
}
