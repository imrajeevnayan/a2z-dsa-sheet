# Next Happy Number

- Platform: GeeksforGeeks
- Language: bool solve(int n){ if(n==1 || n==7)return true; if(n==2 || n==4 || n==8 || n==3 || n==9 || n==5 || n==6)return false; int sq_sum=0; while(n){ int x=n%10; sq_sum+=(x*x); n/=10; } return solve(sq_sum); } int nextHappy(int n){ while(true){ n++; if(solve(n))return n; } return 0; }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Recursion
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/next-happy-number4538/1
- Synced: 2026-08-22T15:07:08.216Z

## Problem Description

Given a non-negative integer n, find the smallest Happy Number greater than n. A number is called a Happy Number if repeatedly replacing the number with the sum of the squares of its digits eventually results in 1. Examples: Input: n = 8 Output: 10 Explanation: 10 is the smallest Happy Number greater than 8, since 1² + 0² = 1. Input: n = 10 Output: 13 Explanation: 13 is the smallest Happy Number greater than 10, since 1² + 3² = 10, and then 1² + 0² = 1. Constraints: 1 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using bool solve(int n){ if(n==1 || n==7)return true; if(n==2 || n==4 || n==8 || n==3 || n==9 || n==5 || n==6)return false; int sq_sum=0; while(n){ int x=n%10; sq_sum+=(x*x); n/=10; } return solve(sq_sum); } int nextHappy(int n){ while(true){ n++; if(solve(n))return n; } return 0; }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Recursion. Review the synced source file for the implementation details.
