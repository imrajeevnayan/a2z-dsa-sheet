# Modular Exponentiation

- Platform: GeeksforGeeks
- Language: class Solution { public: int powMod(int x, int n, int M) { long res = 1; x %= M; while (n) { if (n & 1) res = res * x % M; x = (long)x * x % M; n >>= 1; } return res; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags GoogleMakeMyTrip, Company Tags, Google, MakeMyTrip, Topic Tags, Divide and Conquer, Binary Search
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers5537/1
- Synced: 2026-07-28T09:14:29.721Z

## Problem Description

Given three integers x, n, and M, compute (x^n) % M, i.e., the remainder when x raised to the power n is divided by M. Examples: Input: x = 3, n = 2, M = 4 Output: 1 Explanation: 32 % 4 = 9 % 4 = 1. Input: x = 2, n = 6, M = 10 Output: 4 Explanation: 26 % 10 = 64 % 10 = 4. Constraints: 1 ≤ x, n, M ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int powMod(int x, int n, int M) { long res = 1; x %= M; while (n) { if (n & 1) res = res * x % M; x = (long)x * x % M; n >>= 1; } return res; } };. The detected topics are Expected Complexities, Company Tags GoogleMakeMyTrip, Company Tags, Google, MakeMyTrip, Topic Tags, Divide and Conquer, Binary Search. Review the synced source file for the implementation details.
