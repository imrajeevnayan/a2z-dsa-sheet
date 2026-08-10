# Approach 2 contains an error

- Platform: LeetCode
- Language: DSA Patterns by anubhav0910 (Copy-a0b4xdj1)
- Difficulty: Medium
- Topics: Array, Bit Manipulation
- Runtime: 0 ms
- Memory: 108.79 MB
- Problem URL: https://leetcode.com/problems/find-the-original-array-of-prefix-xor/submissions/2101980121/?envType=problem-list-v2&envId=dapb7olr
- Synced: 2026-08-10T19:06:07.906Z

## Problem Description

You are given an integer array pref of size n. Find and return the array arr of size n that satisfies: pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]. Note that ^ denotes the bitwise-xor operation. It can be proven that the answer is unique. Example 1: Input: pref = [5,2,0,3,1] Output: [5,7,2,3,2] Explanation: From the array [5,7,2,3,2] we have the following: - pref[0] = 5. - pref[1] = 5 ^ 7 = 2. - pref[2] = 5 ^ 7 ^ 2 = 0. - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3. - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1. Example 2: Input: pref = [13] Output: [13] Explanation: We have pref[0] = arr[0] = 13. Constraints: 1 <= pref.length <= 105 0 <= pref[i] <= 106

## Explanation

This solution was accepted on LeetCode using DSA Patterns by anubhav0910 (Copy-a0b4xdj1). The detected topics are Array, Bit Manipulation. Review the synced source file for the implementation details.
