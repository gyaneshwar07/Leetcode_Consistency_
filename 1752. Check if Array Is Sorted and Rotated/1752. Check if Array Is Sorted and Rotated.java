/*
 * Problem: 1752. Check if Array Is Sorted and Rotated
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
 * Language: java
 * Date: 2026-05-04
 */

class Solution {
    public boolean Sorted(int[] nums){
        int n = nums.length;
        boolean flag = true;
        for(int i=1;i<n;i++){
           if(nums[i]<nums[i-1]) flag = false;
        }
        if(flag==true) return true;
        flag = true;
        for(int i=n-2;i>=0;i--){
           if(nums[i]<nums[i+1]) flag = false;
        }
        if(flag==true) return true;
        return false;
    }
    public void reverse(int[] nums , int i , int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        int j = 0;
        boolean flag = true;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
               j=i;
               flag = false;
               break;
            }
        }
        if(flag) return true;
        reverse(nums,0,j-1);
        reverse(nums,j,n-1);
        reverse(nums,0,n-1);

        return Sorted(nums);
    }
}
