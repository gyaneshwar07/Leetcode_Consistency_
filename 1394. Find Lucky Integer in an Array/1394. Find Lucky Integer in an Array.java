/*
 * Problem: 1394. Find Lucky Integer in an Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-lucky-integer-in-an-array/submissions/1927288894/
 * Language: java
 * Date: 2026-02-22
 */

class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int mx = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val==key){
                if(key>mx) mx=key;
            }
        }
        if(mx==Integer.MIN_VALUE) return -1;
        return mx;
    }
}
