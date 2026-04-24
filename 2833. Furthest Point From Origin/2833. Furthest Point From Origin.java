/*
 * Problem: 2833. Furthest Point From Origin
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/furthest-point-from-origin/description/?envType=daily-question&envId=2026-04-24
 * Language: java
 * Date: 2026-04-24
 */

class Solution {
    public int furthestDistanceFromOrigin(String str) {
        int n = str.length();
        int LCount = 0;
        int RCount = 0;
        int dash = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='L') LCount++;
            else if(str.charAt(i)=='R') RCount++;
            else dash++;
        }
        return Math.abs(LCount-RCount) + dash;

    }
}
