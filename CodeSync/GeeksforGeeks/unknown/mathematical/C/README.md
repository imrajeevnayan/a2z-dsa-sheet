# C

- Platform: GeeksforGeeks
- Language: class Solution { public: void print_divisors(int n) { // Code here.g vector<int>ans; for(int i=1; i*i<=n;i++){ if (n%i==0){ ans.push_back(i); if(i!=n/i){ ans.push_back(n/i);} } } sort(ans.begin(),ans.end()); for(auto x:ans){ cout<<x<<" "; } } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Mathematical, Factorization, Algorithms, Related Articles, Find All Factors Of A Natural Number
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1
- Synced: 2026-06-28T12:18:07.666Z

## Problem Description

Given an integer n, return all the divisors of n in the ascending order. Examples: Input : n = 20 Output: 1 2 4 5 10 20 Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20. Input: n = 21191 Output: 1 21191 Explanation: As 21191 is a prime number, it has only 2 factors(1 and the number itself). Constraints: 1 ≤ n ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: void print_divisors(int n) { // Code here.g vector<int>ans; for(int i=1; i*i<=n;i++){ if (n%i==0){ ans.push_back(i); if(i!=n/i){ ans.push_back(n/i);} } } sort(ans.begin(),ans.end()); for(auto x:ans){ cout<<x<<" "; } } };. The detected topics are Expected Complexities, Topic Tags, Mathematical, Factorization, Algorithms, Related Articles, Find All Factors Of A Natural Number. Review the synced source file for the implementation details.
