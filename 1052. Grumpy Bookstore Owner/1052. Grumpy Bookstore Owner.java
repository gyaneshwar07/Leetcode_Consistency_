/*
 * Problem: 1052. Grumpy Bookstore Owner
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/grumpy-bookstore-owner/
 * Language: java
 * Date: 2026-03-18
 */

class Solution {
    public int maxSatisfied(int[] cus, int[] grumpy, int min) {
        int n = cus.length;
        int sum = 0;
        int mxsum = 0;
        int msum = 0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0) sum+=cus[i];
        }
        int i = 0 , j = min-1;
        for(int a = i ; a<=j;a++){
            if(grumpy[a]==1) msum+=cus[a];
        }
        mxsum = Math.max(mxsum,msum);
        i++;j++;
        while(j<n){
           if(grumpy[i-1]==1) msum -= cus[i-1];
           if(grumpy[j]==1) msum += cus[j];
           mxsum = Math.max(mxsum,msum);
           i++;j++;
        }
        return mxsum+sum;
    }
}
