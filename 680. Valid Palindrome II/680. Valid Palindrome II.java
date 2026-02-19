/*
 * Problem: 680. Valid Palindrome II
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-palindrome-ii/description/
 * Language: java
 * Date: 2026-02-19
 */

class Solution {
    public boolean isPallindrome(String str , int a , int b){
        int i = a, j = b;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;

    }
    public boolean validPalindrome(String s) {
        int left = 0 , right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return isPallindrome(s,left+1,right) || isPallindrome(s,left,right-1);
            }
            right--;
            left++;
        }
        return true;
    }
}
