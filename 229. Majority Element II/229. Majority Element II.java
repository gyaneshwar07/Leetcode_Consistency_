/*
 * Problem: 229. Majority Element II
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/majority-element-ii/description/
 * Language: java
 * Date: 2026-02-16
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        List<Integer> al = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)>(n/3)) al.add(key);
        }
        return al;
    }
}
