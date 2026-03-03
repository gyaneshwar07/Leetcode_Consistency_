/*
 * Problem: 2600. K Items With the Maximum Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/k-items-with-the-maximum-sum/description/
 * Language: java
 * Date: 2026-03-03
 */

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes>k) return k;
        else if((numOnes + numZeros)>k) return numOnes;
        else{
            int neg_pick = k-(numOnes + numZeros);
            return numOnes-(neg_pick);
        }
    }
}
