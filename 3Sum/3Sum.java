/*
 * Problem: 3Sum
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/3sum/description/
 * Language: java
 * Date: 2026-02-12
 */

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue; //skip duplicate 

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1])
                        j++; //skip duplicate
                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                } else if (sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return ans;
    }
}
