/*
 * Problem: 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/submissions/1924971991/
 * Language: java
 * Date: 2026-02-20
 */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int i=0,j=k-1;
        int sum = 0;
        for(int a=i;a<=j;a++){
            sum += arr[a];
        }
        if((sum/k)>=threshold) count++;
        i++;j++;
        while(j<n){
            sum = sum-arr[i-1]+arr[j];
            if((sum/k)>=threshold) count++;
            i++;j++;
        }
        return count;
        
    }
}
