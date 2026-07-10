# Maximum Sum of M Non

- Platform: LeetCode
- Language: Weekly Contest 505
- Difficulty: Hard
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/contest/weekly-contest-505/problems/maximum-sum-of-m-non-overlapping-subarrays-i/description/
- Synced: 2026-07-09T13:42:14.211Z

## Problem Description

You are given an integer array nums of length n, and three integers m, l, and r. Your task is to select at least one and at most m non-overlapping subarrays from nums such that: Each selected subarray has a length between [l, r] (inclusive). The total sum of all selected subarrays is maximized. Return the maximum total sum you can achieve. Example 1: Input: nums = [4,1,-5,2], m = 2, l = 1, r = 3 Output: 7 Explanation: One optimal strategy is to: Select the subarray [4, 1] with sum 4 + 1 = 5 and the subarray [2] with sum 2. Both subarrays have length between [l, r]. The total sum of these subarrays is 5 + 2 = 7, which is the maximum achievable sum with at most m = 2 subarrays. Example 2: Input: nums = [1,0,3,4], m = 2, l = 1, r = 2 Output: 8 Explanation: One optimal strategy is to: Select the subarray [1] with sum 1 and the subarray [3, 4] with sum 3 + 4 = 7. Both subarrays have length between [l, r]. The total sum of these subarrays is 1 + 7 = 8, which is the maximum achievable sum with at most m = 2 subarrays. Example 3: Input: nums = [-1,7,-4], m = 1, l = 2, r = 3 Output: 6 Explanation: Select the subarray [-1, 7] from nums which has length between [l, r]. The total sum of this subarray is -1 + 7 = 6, which is the maximum achievable sum with at most m = 1 subarray. Example 4: Input: nums = [-3,-4,-1], m = 2, l = 1, r = 2 Output: -1 Explanation: All subarrays of nums have negative sums. The optimal strategy is to select the subarray [-1], which has length between [l, r]. The total sum of this subarray is -1, which is the maximum achievable sum with at most m = 2 subarrays. Constraints: 1 <= n == nums.length <= 1000 -109 <= nums[i] <= 109​​​​​​​ 1 <= m <= n 1 <= l <= r <= n

## Explanation

This solution was accepted on LeetCode using Weekly Contest 505. Review the synced source file for the implementation details.
