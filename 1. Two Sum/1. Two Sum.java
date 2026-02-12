/*
 * Problem: 1. Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/description/
 * Language: java
 * Date: 2026-02-12
 */

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int  i=0;
        int j=n-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target) return new int[] {i,j};
            else if(sum < target) i++;
            else j--;
        }
        return new int[] {};
    }
}
