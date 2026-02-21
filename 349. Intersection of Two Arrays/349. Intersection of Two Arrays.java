/*
 * Problem: 349. Intersection of Two Arrays
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/intersection-of-two-arrays/description/
 * Language: java
 * Date: 2026-02-21
 */

class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        int n1 = num1.length;
        int n2 = num2.length;
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele : num1)
            set.add(ele);
        for(int ele : num2){
            if(set.contains(ele)){
               al.add(ele);
               set.remove(ele);
            }
            
        }
        int[] arr = new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i] = al.get(i);
        }
        return arr;
        
    }
}
