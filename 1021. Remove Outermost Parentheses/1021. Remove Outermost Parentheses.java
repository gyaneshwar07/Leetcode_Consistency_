/*
 * Problem: 1021. Remove Outermost Parentheses
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-outermost-parentheses/description/
 * Language: java
 * Date: 2026-03-31
 */

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
             if(count>0) sb.append('(');
             count++;
           }
           else{
            count--;
            if(count>0) sb.append(')');
           }
        }
        return sb.toString();
    }
}
