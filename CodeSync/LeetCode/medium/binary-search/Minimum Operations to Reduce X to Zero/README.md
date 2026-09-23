# Minimum Operations to Reduce X to Zero

- Platform: LeetCode
- Language: Daily Question
- Difficulty: Medium
- Topics: Array, Hash Table, Binary Search, Sliding Window, Prefix Sum
- Runtime: 0 ms
- Memory: 101.98 MB
- Problem URL: https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/submissions/2150444835/?envType=daily-question&envId=2026-09-23
- Synced: 2026-09-23T05:55:25.842Z

## Problem Description

You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations. Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1. Example 1: Input: nums = [1,1,4,2,3], x = 5 Output: 2 Explanation: The optimal solution is to remove the last two elements to reduce x to zero. Example 2: Input: nums = [5,6,7,8,9], x = 4 Output: -1 Example 3: Input: nums = [3,2,20,1,1,3], x = 10 Output: 5 Explanation: The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero. Constraints: 1 <= nums.length <= 105 1 <= nums[i] <= 104 1 <= x <= 109

## Explanation

This solution was accepted on LeetCode using Daily Question. The detected topics are Array, Hash Table, Binary Search, Sliding Window, Prefix Sum. Review the synced source file for the implementation details.
