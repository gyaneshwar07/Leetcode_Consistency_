/*
 * Problem: 78. Subsets
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/subsets/description/
 * Language: java
 * Date: 2026-05-06
 */

class Solution {
    public void Solve(int[] nums , List<List<Integer>> ans , List<Integer> al, int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        Solve(nums,ans,al,i+1);
        int ele = nums[i];
        al.add(nums[i]);
        Solve(nums,ans,al,i+1);

        al.remove(al.size()-1); //backtrack

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        int n = nums.length;
        Solve(nums,ans,al,0);
        return ans;
    }
}
