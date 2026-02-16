/*
 * Problem: 240. Search a 2D Matrix II
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 * Language: java
 * Date: 2026-02-16
 */

class Solution {
    public boolean searchMatrix(int[][] arr, int target) { //ik,
        int m = arr.length;
        int n = arr[0].length;
        int i=0 , j = n-1;
        while(i<m && j>=0){
            if(arr[i][j]==target) return true;
            else if (arr[i][j]>target) j--;
            else i++;
        }
        return false;
        
    }
}
