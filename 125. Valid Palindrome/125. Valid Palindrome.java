/*
 * Problem: 125. Valid Palindrome
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-palindrome/description/
 * Language: java
 * Date: 2026-02-19
 */

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]" , "");
        int n = str.length();
        int i=0 , j=n-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            else i++;j--;
        }
        return true;
    }
}
