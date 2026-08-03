# C++ Solution || Easy Approach and Step by Step Explanation

- Platform: GeeksforGeeks
- Language: def maxSumWithK(self, arr: list[int], k: int) -> int: n = len(arr) bestEnd = [0]*n bestEnd[0] = arr[0] for i in range(1,n): bestEnd[i] = max(arr[i],arr[i]+bestEnd[i-1]) winsum = sum(arr[:k]) ans = winsum for i in range(k,n): winsum = winsum + arr[i] - arr[i-k] ans = max(ans,winsum+bestEnd[i-k],winsum) return ans
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags FacebookPaytmMyntra, Company Tags, Facebook, Paytm, Myntra, Topic Tags, sliding-window
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/largest-sum-subarray-of-size-at-least-k3121/1
- Synced: 2026-08-03T15:09:34.599Z

## Problem Description

Given an array arr[] and an integer k, find the maximum sum among all contiguous subarrays having a length greater than or equal to k. Examples: Input: arr[] = [1, -2, 2, -3], k = 3 Output: 1 Explanation: The sub-array of length at least 3 that produces greatest sum is [1, -2, 2] Input: arr[] = [1, 1, 1, 1, 1, 1], k = 2 Output: 6 Explanation: The sub-array of length at least 2 that produces greatest sum is [1, 1, 1, 1, 1, 1] Input: arr[] = [-4, -2, 1, -3], k = 2 Output: -1 Explanation: The sub-array of length at least 2 that produces greatest sum is [-2, 1]

## Explanation

This solution was accepted on GeeksforGeeks using def maxSumWithK(self, arr: list[int], k: int) -> int: n = len(arr) bestEnd = [0]*n bestEnd[0] = arr[0] for i in range(1,n): bestEnd[i] = max(arr[i],arr[i]+bestEnd[i-1]) winsum = sum(arr[:k]) ans = winsum for i in range(k,n): winsum = winsum + arr[i] - arr[i-k] ans = max(ans,winsum+bestEnd[i-k],winsum) return ans. The detected topics are Expected Complexities, Company Tags FacebookPaytmMyntra, Company Tags, Facebook, Paytm, Myntra, Topic Tags, sliding-window. Review the synced source file for the implementation details.
