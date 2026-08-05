# Number of Unique XOR Triplets II

- Platform: LeetCode
- Language: Daily Question
- Difficulty: Medium
- Topics: Array, Math, Bit Manipulation, Enumeration
- Runtime: 0 ms
- Memory: 46.80 MB
- Problem URL: https://leetcode.com/problems/number-of-unique-xor-triplets-ii/submissions/2095205171/?envType=daily-question&envId=2026-08-05
- Synced: 2026-08-05T10:53:07.246Z

## Problem Description

You are given an integer array nums. A XOR triplet is defined as the XOR of three elements nums[i] XOR nums[j] XOR nums[k] where i <= j <= k. Return the number of unique XOR triplet values from all possible triplets (i, j, k). Example 1: Input: nums = [1,3] Output: 2 Explanation: The possible XOR triplet values are: (0, 0, 0) → 1 XOR 1 XOR 1 = 1 (0, 0, 1) → 1 XOR 1 XOR 3 = 3 (0, 1, 1) → 1 XOR 3 XOR 3 = 1 (1, 1, 1) → 3 XOR 3 XOR 3 = 3 The unique XOR values are {1, 3}. Thus, the output is 2. Example 2: Input: nums = [6,7,8,9] Output: 4 Explanation: The possible XOR triplet values are {6, 7, 8, 9}. Thus, the output is 4. Constraints: 1 <= nums.length <= 1500 1 <= nums[i] <= 1500

## Explanation

This solution was accepted on LeetCode using Daily Question. The detected topics are Array, Math, Bit Manipulation, Enumeration. Review the synced source file for the implementation details.
