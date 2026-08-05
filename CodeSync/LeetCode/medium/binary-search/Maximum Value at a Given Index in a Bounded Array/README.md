# Maximum Value at a Given Index in a Bounded Array

- Platform: LeetCode
- Language: Problem List
- Difficulty: Medium
- Topics: Math, Binary Search, Greedy
- Runtime: 0 ms
- Memory: N/A
- Problem URL: https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/submissions/2095206254/
- Synced: 2026-08-05T10:53:38.674Z

## Problem Description

You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed) that satisfies the following conditions: nums.length == n nums[i] is a positive integer where 0 <= i < n. abs(nums[i] - nums[i+1]) <= 1 where 0 <= i < n-1. The sum of all the elements of nums does not exceed maxSum. nums[index] is maximized. Return nums[index] of the constructed array. Note that abs(x) equals x if x >= 0, and -x otherwise. Example 1: Input: n = 4, index = 2, maxSum = 6 Output: 2 Explanation: nums = [1,2,2,1] is one array that satisfies all the conditions. There are no arrays that satisfy all the conditions and have nums[2] == 3, so 2 is the maximum nums[2]. Example 2: Input: n = 6, index = 1, maxSum = 10 Output: 3 Constraints: 1 <= n <= maxSum <= 109 0 <= index < n

## Explanation

This solution was accepted on LeetCode using Problem List. The detected topics are Math, Binary Search, Greedy. Review the synced source file for the implementation details.
