/*
 * Problem: 75. Sort Colors
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/sort-colors/description/
 * Language: java
 * Date: 2026-02-12
 */

class Solution {
    public void swap(int a , int b , int[] arr ){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0 , mid = 0 , hi = n-1;
        while(mid<=hi){
            if(nums[mid]==0){
                swap(lo,mid,nums);
                lo++; mid++;
            }
            else if(nums[mid]==2){
                swap(mid,hi,nums);
                hi--;
            }
            else{
                mid++;
            }

        }

    }
}
