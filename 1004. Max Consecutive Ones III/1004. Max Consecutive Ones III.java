/*
 * Problem: 1004. Max Consecutive Ones III
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/max-consecutive-ones-iii/description/
 * Language: java
 * Date: 2026-02-24
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0 , r = 0;
        int count = 0;
        int maxlen = 0;
        while(r<n){
            if (nums[r] == 0) {
                count++;
            }

            // If count of zeros exceeds k, shrink the window from the left
            while (count > k) {
                if (nums[l] == 0) {
                    count--;
                }
                l++;
            }

            // Calculate the window size: (right index - left index + 1)
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}
