/*
 * Problem: 73. Set Matrix Zeroes
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/set-matrix-zeroes/submissions/1921015173/
 * Language: java
 * Date: 2026-02-16
 */

class Solution {
    public void setZeroes(int[][] arr) {
        int m =arr.length;
        int n = arr[0].length;
        boolean Zerorow = false;
        boolean Zerocol = false;
        //set 0th row
        for(int i=0;i<m;i++){
            if(arr[i][0]==0) {
                Zerocol=true;
                break;
            }
       }
        //set 0th col
        for(int j=0;j<n;j++){
            if(arr[0][j]==0) {
                Zerorow=true;
                break;
            }
        }
        //traverse from 1
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        for(int i=1;i<m;i++){
            if(arr[i][0]==0){
                for(int j=1;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }
        for(int j=1;j<n;j++){
            if(arr[0][j]==0){
                for(int i=1;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }

        if(Zerocol){
            for(int i=0;i<m;i++){
                arr[i][0]=0;
            }
        }
        if(Zerorow){
            for(int j=0;j<n;j++){
                arr[0][j]=0;
            }
        }
    }
}
