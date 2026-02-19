/*
 * Problem: 151. Reverse Words in a String
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/reverse-words-in-a-string/submissions/1924441688/
 * Language: java
 * Date: 2026-02-19
 */

class Solution {
    public String reverseWords(String s) {
        String str = s.trim().replaceAll("\\s+"," ");
        String[] arr = str.split(" ");
        int i = 0 , j = arr.length-1;
        while(i<=j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        return String.join(" ", arr);
    }
}
