# Max Sum Subarray of size K

- Platform: GeeksforGeeks
- Language: class Solution: def maxSubarraySum(self, arr, k): # code here n = len(arr) mxSum = 0 currSum = 0 l = 0 for r in range(n): currSum += arr[r] if r - l + 1 > k: currSum -= arr[l] l += 1 if r - l + 1 == k: mxSum = max(mxSum, currSum) return mxSum
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags OYO RoomsNPCI, Company Tags, OYO Rooms, NPCI, Topic Tags, prefix-sum, sliding-window
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
- Synced: 2026-06-28T18:45:04.153Z

## Problem Description

Given an array of integers arr[] and a number k. Return the maximum sum of a subarray of size k. Note: A subarray is a contiguous part of any given array. Examples: Input: arr[] = [100, 200, 300, 400], k = 2 Output: 700 Explanation: arr2 + arr3 = 700, which is maximum. Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4 Output: 39 Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum. Input: arr[] = [100, 200, 300, 400], k = 1 Output: 400 Explanation: arr3 = 400, which is maximum. Constraints: 1 ≤ arr.size() ≤ 106 0 ≤ arr[i] ≤ 106 1 ≤ k ≤ arr.size()

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def maxSubarraySum(self, arr, k): # code here n = len(arr) mxSum = 0 currSum = 0 l = 0 for r in range(n): currSum += arr[r] if r - l + 1 > k: currSum -= arr[l] l += 1 if r - l + 1 == k: mxSum = max(mxSum, currSum) return mxSum. The detected topics are Expected Complexities, Company Tags OYO RoomsNPCI, Company Tags, OYO Rooms, NPCI, Topic Tags, prefix-sum, sliding-window. Review the synced source file for the implementation details.
