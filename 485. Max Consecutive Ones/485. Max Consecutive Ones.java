/*
 * Problem: 485. Max Consecutive Ones
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/max-consecutive-ones/description/
 * Language: java
 * Date: 2026-02-18
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int n = a.length;
        int mx = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                sum += a[i];
            if (a[i] == 0) {
                if (mx < sum)
                    mx = sum;
                sum = 0;
            }
            if(i==n-1){
                 if (mx < sum)
                    mx = sum;
            }
        }
        return mx;
    }
}
