# First negative in every window of size k

- Platform: GeeksforGeeks
- Language: class Solution: def firstNegInt(self, arr, k): # code here l, r = 0, k - 1 res = [] while r < len(arr): # this maintains the window [k] if r - l + 1 > k: l += 1 # in the current window, shrink from left side # if the left most element is not negative while l <= r and arr[l] >= 0: l += 1 # has negative in current window if l <= r: res.append(arr[l]) # no negative in current window else: res.append(0) r += 1 return res
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, sliding-window, two-pointer-algorithm, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
- Synced: 2026-06-28T19:03:26.169Z

## Problem Description

Given an array arr[] and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k. Note: If a window does not contain a negative integer, then return 0 for that window. Examples: Input: arr[] = [-8, 2, 3, -6, 10] , k = 2 Output: [-8, 0, -6, -6] Explanation: Window [-8, 2] First negative integer is -8. Window [2, 3] No negative integers, output is 0. Window [3, -6] First negative integer is -6. Window [-6, 10] First negative integer is -6. Input: arr[] = [12, -1, -7, 8, -15, 30, 16, 28] , k = 3 Output: [-1, -1, -7, -15, -15, 0] Explanation: Window [12, -1, -7] First negative integer is -1. Window [-1, -7, 8] First negative integer is -1. Window [-7, 8, -15] First negative integer is -7. Window [8, -15, 30] First negative integer is -15. Window [-15, 30, 16] First negative integer is -15. Window [30, 16, 28] No negative integers, output is 0. Input: arr[] = [12, 1, 3, 5] , k = 3 Output: [0, 0] Explanation: Window [12, 1, 3] No negative integers, output is 0. Window [1, 3, 5] No negative integers, output is 0. Constraints: 1 <= arr.size() <= 106 -105 <= arr[i] <= 105 1 <= k <= arr.size()

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def firstNegInt(self, arr, k): # code here l, r = 0, k - 1 res = [] while r < len(arr): # this maintains the window [k] if r - l + 1 > k: l += 1 # in the current window, shrink from left side # if the left most element is not negative while l <= r and arr[l] >= 0: l += 1 # has negative in current window if l <= r: res.append(arr[l]) # no negative in current window else: res.append(0) r += 1 return res. The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, sliding-window, two-pointer-algorithm, Arrays. Review the synced source file for the implementation details.
