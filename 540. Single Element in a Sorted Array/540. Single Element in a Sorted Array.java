/*
 * Problem: 540. Single Element in a Sorted Array
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/single-element-in-a-sorted-array/description/
 * Language: java
 * Date: 2026-02-26
 */

class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid < n-1 && arr[mid+1] == arr[mid]){
              if((mid)%2==0) lo = mid + 2 ;
              else hi = mid - 1;
            }
            else if(mid > 0 && arr[mid-1]==arr[mid]){
              if((mid-1)%2==0) lo=mid+1; 
              else hi = mid - 2; 

            }
            else return arr[mid];


        }
        return -1;

    }
}
