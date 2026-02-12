/*
 * Problem: 1. Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/description/
 * Language: java
 * Date: 2026-02-12
 */

class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int req = target-arr[i];
            if(map.containsKey(req)){
                int val = map.get(req);
                return new int[] {i,val};
            }
            else map.put(arr[i],i);
        }
        return new int[] {} ;
    }
}
