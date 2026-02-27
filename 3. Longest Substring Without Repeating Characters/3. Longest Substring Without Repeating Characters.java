/*
 * Problem: 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * Language: java
 * Date: 2026-02-27
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==1) return 1;
        int i = 0 , j = 0;
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0; 
        int len = 0;
        while(j<n && i<=j){
            if(set.contains(s.charAt(j))){
                len = j-i;
                maxLen = Math.max(len,maxLen);
                while(s.charAt(i)!=s.charAt(j)){
                   set.remove(s.charAt(i));
                   i++;
                }
                set.remove(s.charAt(i));  //remove equal character
                i++; 
            }
            else{
                set.add(s.charAt(j));
                j++;
                if(j==n-1 && !set.contains(s.charAt(j))){
                    len = j-i+1;
                    maxLen = Math.max(len,maxLen);
                }
            }
        }
        return maxLen;
    }
}
