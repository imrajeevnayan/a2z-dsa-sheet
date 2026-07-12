# Binary Exponentiation

- Platform: GeeksforGeeks
- Language: class Solution{ public: int mod=1000000007; long long power(int N,int R) { if(R==1) return N; if(R==0) return 1; long long val=power(N,R/2)%mod; val=(val*val)%mod; if(R&1) val=(val*N)%mod; return val; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags MakeMyTripWalmart, Company Tags, MakeMyTrip, Walmart, Topic Tags, Mathematical, Recursion
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
- Synced: 2026-07-12T18:47:34.972Z

## Problem Description

Given a number n, find the value of n raised to the power of its own reverse. The result will always fit into a 32-bit signed integer. Examples: Input: n = 2 Output: 4 Explanation: The reverse of 2 is 2, and 22 = 4. Input: n = 10 Output: 10 Explanation: The reverse of 10 is 1 (leading zero is discarded), and 10 raised to the power 1 is 10. Constraints: 1 ≤ n ≤ 10

## Explanation

This solution was accepted on GeeksforGeeks using class Solution{ public: int mod=1000000007; long long power(int N,int R) { if(R==1) return N; if(R==0) return 1; long long val=power(N,R/2)%mod; val=(val*val)%mod; if(R&1) val=(val*N)%mod; return val; }. The detected topics are Expected Complexities, Company Tags MakeMyTripWalmart, Company Tags, MakeMyTrip, Walmart, Topic Tags, Mathematical, Recursion. Review the synced source file for the implementation details.
