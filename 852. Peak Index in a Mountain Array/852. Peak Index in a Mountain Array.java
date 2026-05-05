/*
 * Problem: 852. Peak Index in a Mountain Array
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 * Language: java
 * Date: 2026-05-05
 */

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 1 , hi = n-2;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid+1]) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }
}
