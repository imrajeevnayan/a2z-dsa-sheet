# 3 Sum Closest

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Amazon, Microsoft, Adobe, Google, Zoho, Uber
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-bonus-problems
- Synced: 2026-08-25T06:04:22.783Z

## Problem Description

Given an array arr[] and an integer target, the task is to find the sum of three integers in arr[] such that the sum is closest to target. Note: If multiple sums are closest to target, return the maximum one. Examples: Input: arr[] = [-1, 2, 2, 4], target = 4 Output: 5 Explanation: All possible triplets [-1, 2, 2], sum = (-1) + 2 + 2 = 3 [-1, 2, 4], sum = (-1) + 2 + 4 = 5 [-1, 2, 4], sum = (-1) + 2 + 4 = 5 [2, 2, 4], sum = 2 + 2 + 4 = 8 Triplet [-1, 2, 2], [-1, 2, 4] and [-1, 2, 4] have sum closest to target, so return the maximum one, that is 5. Input: arr[] = [1, 10, 4, 5], target = 10 Output: 10 Explanation: All possible triplets [1, 10, 4], sum = (1 + 10 + 4) = 15 [1, 10, 5], sum = (1 + 10 + 5) = 16 [1, 4, 5], sum = (1 + 4 + 5) = 10 [10, 4, 5], sum = (10 + 4 + 5) = 19 Triplet [1, 4, 5] has sum = 10 which is closest to target. Constraints: 3 ≤ arr.size() ≤ 103 -103 ≤ arr[i] ≤ 103 -104 ≤ target ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags, Amazon, Microsoft, Adobe, Google, Zoho, Uber. Review the synced source file for the implementation details.
