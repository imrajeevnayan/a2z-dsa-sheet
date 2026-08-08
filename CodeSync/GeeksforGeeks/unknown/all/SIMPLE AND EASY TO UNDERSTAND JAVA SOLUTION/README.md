# SIMPLE AND EASY TO UNDERSTAND JAVA SOLUTION

- Platform: GeeksforGeeks
- Language: vector<int> countBits(int n) { vector<int> output(n+1, 0); for(int i=0; i<=n; i++) output[i] = output[i >> 1] + (i & 1); return output; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Bloomberg, Facebook, Adobe, Google, Amazon, Microsoft
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/bits-counting/1
- Synced: 2026-08-08T16:02:31.164Z

## Problem Description

Given an integer n , return an array containing the number of set bits (1s) in the binary representation of every integer in the range [0, n]. Examples : Input: n = 3 Output: [0, 1, 1, 2] Explanation: The numbers from 0 to 3 have 0, 1, 1, and 2 set bits respectively. Input: n = 7 Output: [0, 1, 1, 2, 1, 2, 2, 3] Explanation: The numbers from 0 to 7 have 0, 1, 1, 2, 1, 2, 2, and 3 set bits respectively. Constraints: 0 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using vector<int> countBits(int n) { vector<int> output(n+1, 0); for(int i=0; i<=n; i++) output[i] = output[i >> 1] + (i & 1); return output; }. The detected topics are Expected Complexities, Company Tags, Bloomberg, Facebook, Adobe, Google, Amazon, Microsoft. Review the synced source file for the implementation details.
