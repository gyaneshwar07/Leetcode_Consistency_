/*
 * Problem: 1886. Determine Whether Matrix Can Be Obtained By Rotation
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
 * Language: java
 * Date: 2026-02-12
 */

class Solution {
    boolean same(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j])
                    return false;
            }
        }
        return true;
    }
    public void rotate(int[][] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int x = 0, y = n - 1;
            while (x <= y) {
                int temp = array[i][x];
                array[i][x] = array[i][y];
                array[i][y] = temp;
                x++;
                y--;
            }
        }
    } 
    public boolean findRotation(int[][] arr, int[][] target) {
        for(int r = 0; r < 4; r++){
            if(same(arr, target)) return true;
            rotate(arr);   
        }
        return false;
    }
}
