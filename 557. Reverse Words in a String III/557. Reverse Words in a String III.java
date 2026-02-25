/*
 * Problem: 557. Reverse Words in a String III
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/1930454593/
 * Language: java
 * Date: 2026-02-25
 */

class Solution {
    public String reverse(String str){
        char[] chArr = str.toCharArray();
        int i = 0 , j = chArr.length-1;
        while(i<=j){
            char temp = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = temp;
            i++; j--;
        }
        return new String(chArr);
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i] = reverse(arr[i]);
        }
        return String.join(" ", arr);
    }

}
