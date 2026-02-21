/*
 * Problem: 350. Intersection of Two Arrays II
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * Language: java
 * Date: 2026-02-21
 */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for (int ele : nums2) {
            if (map.containsKey(ele) && map.get(ele) > 0) {
                al.add(ele);
                map.put(ele, map.get(ele) - 1);
            }
        }
         int[] arr = new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}
