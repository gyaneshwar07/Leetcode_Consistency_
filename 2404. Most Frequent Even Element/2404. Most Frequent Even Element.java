/*
 * Problem: 2404. Most Frequent Even Element
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/most-frequent-even-element/description/
 * Language: java
 * Date: 2026-02-16
 */

class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(ele%2==0) map.put(ele,map.getOrDefault(ele,0)+1);
        }
        if(map.isEmpty()) return -1;
        int mx = 0,ele=Integer.MAX_VALUE;
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val>=mx){
                if(val==mx && key<ele) ele=key;
                if(val>mx){
                    mx=val;
                    ele=key;
                }
            }
            
        }
        return ele;
    }
}
