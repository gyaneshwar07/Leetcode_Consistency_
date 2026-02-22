/*
 * Problem: 884. Uncommon Words from Two Sentences
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
 * Language: java
 * Date: 2026-02-22
 */

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String w : a)
            map.put(w, map.getOrDefault(w, 0) + 1);

        for (String w : b)
            map.put(w, map.getOrDefault(w, 0) + 1);

        ArrayList<String> ans = new ArrayList<>();

        for (String w : a){
            if (map.get(w) == 1)
                ans.add(w);
        }

        for (String w : b){
            if (map.get(w) == 1)
                ans.add(w);
        }
        String[] st = new String[ans.size()];
        if (ans.isEmpty())
            System.out.print("-1");
        else{
            for(int i=0;i<ans.size();i++){
                st[i]=ans.get(i);
            }
        }
        return st;
    }
}

