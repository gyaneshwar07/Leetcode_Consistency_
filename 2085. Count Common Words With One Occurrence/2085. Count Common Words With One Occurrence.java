/*
 * Problem: 2085. Count Common Words With One Occurrence
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/count-common-words-with-one-occurrence/description/
 * Language: java
 * Date: 2026-02-22
 */

class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;

        HashMap<String,Integer> map1 = new HashMap<>();
        for(String s : words1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }

        HashMap<String,Integer> map2 = new HashMap<>();
        for(String s : words2){
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        for(String s : words1){
           if(map1.containsKey(s) && map2.containsKey(s)){
             int val1 = map1.get(s);
             int val2 = map2.get(s);
             if(val1==1 && val2==1) count++;
           }
        }
        return count;
    } 
}
