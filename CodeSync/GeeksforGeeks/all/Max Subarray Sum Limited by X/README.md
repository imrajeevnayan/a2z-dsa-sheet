# Max Subarray Sum Limited by X

- Platform: GeeksforGeeks
- Language: class Solution: def findMaxSubarraySum(self, arr, x): start = 0 end = 0 max_sum = 0 current_sum = 0 LENGTH = len(arr) while end < LENGTH: current_sum += arr[end] while current_sum > x: current_sum -= arr[start] start += 1 if current_sum <= x: max_sum = max(max_sum, current_sum) end += 1 return max_sum
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, sliding-window, two-pointer-algorithm, Arrays, Related Articles, Maximum Sum Subarray Sum Less Equal Given Sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/maximum-sum-of-subarray-less-than-or-equal-to-x4033/1
- Synced: 2026-09-13T10:41:10.082Z

## Problem Description

Given an array arr[] of integers and a number x, find the sum of subarray having a maximum sum less than or equal to the given value of x. Examples: Input: arr[] = [1, 2, 3, 4, 5], x = 11 Output: 10 Explanation: Subarray having maximum sum is [1, 2, 3, 4]. Input: arr[] = [2, 4, 6, 8, 10], x = 7 Output: 6 Explanation: Subarray having maximum sum is [2, 4] or [6]. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 104 1 ≤ x ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def findMaxSubarraySum(self, arr, x): start = 0 end = 0 max_sum = 0 current_sum = 0 LENGTH = len(arr) while end < LENGTH: current_sum += arr[end] while current_sum > x: current_sum -= arr[start] start += 1 if current_sum <= x: max_sum = max(max_sum, current_sum) end += 1 return max_sum. The detected topics are Expected Complexities, Topic Tags, sliding-window, two-pointer-algorithm, Arrays, Related Articles, Maximum Sum Subarray Sum Less Equal Given Sum. Review the synced source file for the implementation details.
