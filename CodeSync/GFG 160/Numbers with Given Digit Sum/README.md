# Numbers with Given Digit Sum

- Platform: GeeksforGeeks
- Language: class Solution { public: static const int N=10; int memo[N][82]; int solve(int n, int digit, int sum){ if(digit==n) return sum==0; if(memo[digit][sum] != -1) return memo[digit][sum]; int cnt=0; for(int i=(digit==0); i<10; i++){ if(sum-i < 0) break; cnt+=solve(n, digit+1, sum-i); } if(digit==0 && cnt==0) return -1; return memo[digit][sum]=cnt; } int countWays(int n, int sum) { // code here memset(memo, -1, sizeof(memo)); return solve(n, 0, sum); } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Dynamic Programming, Mathematical, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-of-n-digit-numbers-whose-sum-of-digits-equals-to-given-sum0733/1
- Synced: 2026-07-17T18:07:07.478Z

## Problem Description

Given two integers n and sum, determine the number of n-digit positive integers whose digits add up to sum. An n-digit number cannot have leading zeros; that is, the first digit must be between 1 and 9. If there exist no n digit number with sum of digits equal to given sum, return -1. Examples : Input: n = 2, sum = 2 Output: 2 Explaination: The valid 2-digit numbers whose digits sum to 2 are 11 and 20. Input: n = 1, sum = 10 Output: -1 Explaination: A single-digit number can only have a digit sum between 0 and 9. Input: n = 2, sum = 10 Output: 9 Explaination: The 2-digit numbers whose digits add up to 10 are: 19, 28, 37, 46, 55, 64, 73, 82, 91. Constraints: 1 ≤ n ≤ 9 1 ≤ sum ≤ 81

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: static const int N=10; int memo[N][82]; int solve(int n, int digit, int sum){ if(digit==n) return sum==0; if(memo[digit][sum] != -1) return memo[digit][sum]; int cnt=0; for(int i=(digit==0); i<10; i++){ if(sum-i < 0) break; cnt+=solve(n, digit+1, sum-i); } if(digit==0 && cnt==0) return -1; return memo[digit][sum]=cnt; } int countWays(int n, int sum) { // code here memset(memo, -1, sizeof(memo)); return solve(n, 0, sum); } };. The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Dynamic Programming, Mathematical, Related Articles. Review the synced source file for the implementation details.
