/*
 * Problem: 50. Pow(x, n)
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/powx-n/description/
 * Language: java
 * Date: 2026-05-10
 */

class Solution {
    public double posPow(double x , long n){
        if(n==0) return 1;
        double half = posPow(x,n/2);
        if(n%2==0) return (half*half);
        return x*half*half;
    }
    public double negPow(double x , long n){
        if(n==0) return 1;
        double half = negPow(x,n/2);
        if(n%2==0) return half*half;
        return half*half*x;
    }
    public double myPow(double x, int n) {
        long N = n;
        if(N>0){
            return posPow(x,N);
        }
        else{
            return negPow(1/x,-N);
        }
    }
}
