# Kadane's Algorithm Inverted | Minimum Subarray Sum | O(N) | 100% Correct

- Platform: GeeksforGeeks
- Language: class Solution: def smallestSumSubarray(self, A, N): min_sum = float('inf') # Handles all-positive arrays correctly c_sum = 0 for num in A: c_sum += num # Extend current subarray min_sum = min(min_sum, c_sum) # Snapshot best sum BEFORE reset if c_sum > 0: c_sum = 0 # Positive prefix — start fresh return min_sum
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Dynamic Programming, Related Articles, Smallest Sum Contiguous Subarray
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1
- Synced: 2026-07-31T18:17:54.022Z

## Problem Description

Given an array arr[], find the sub-array containing at least one number which has the minimum sum and return its sum. Examples : Input: arr[] = {3,-4, 2,-3,-1, 7,-5} Output: -6 Explanation: The subarray is {-4,2,-3,-1} = -6 Input: arr[] = {2, 6, 8, 1, 4} Output: 1 Explanation: The sub-array is {1} = 1 Constraints: 1 ≤ N ≤ 106 -107 ≤ A[i] ≤ 107

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def smallestSumSubarray(self, A, N): min_sum = float('inf') # Handles all-positive arrays correctly c_sum = 0 for num in A: c_sum += num # Extend current subarray min_sum = min(min_sum, c_sum) # Snapshot best sum BEFORE reset if c_sum > 0: c_sum = 0 # Positive prefix — start fresh return min_sum. The detected topics are Expected Complexities, Topic Tags, Arrays, Dynamic Programming, Related Articles, Smallest Sum Contiguous Subarray. Review the synced source file for the implementation details.
