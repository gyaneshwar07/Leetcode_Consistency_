/*
 * Problem: 2108. Find First Palindromic String in the Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
 * Language: java
 * Date: 2026-02-19
 */

class Solution {
    private boolean isPalindromic(String str){
        int len = str.length();
        int i = 0 , j = len-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i = 0;i<n;i++){
            if(isPalindromic(words[i])){
                return words[i];
            }
        }
        return "";
    }
}
