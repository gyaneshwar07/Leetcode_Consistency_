/*
 * Problem: 169. Majority Element
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/majority-element/description/
 * Language: java
 * Date: 2026-02-16
 */

class Solution {
    public int majorityElement(int[] nums) { //<ik,
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val>(n/2)){
                return key;
            }
        }
        return 990;
    }
}
