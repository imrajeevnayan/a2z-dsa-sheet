# Subarray Sum Divisible By K

- Platform: GeeksforGeeks
- Language: class Solution: # Function to count the number of subarrays with a sum that is divisible by K def subCount(self, arr, k): count = 0 prefix_sum = 0 mod_map = {0: 1} # Initialize with 0:1 to handle subarrays starting at index 0 for num in arr: prefix_sum += num mod = (prefix_sum % k + k) % k # Normalize mod to be non-negative count += mod_map.get(mod, 0) mod_map[mod] = mod_map.get(mod, 0) + 1 return count
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags PaytmAmazon, Company Tags, Paytm, Amazon, Topic Tags, Arrays, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sub-array-sum-divisible-by-k2617/1
- Synced: 2026-07-10T11:26:38.827Z

## Problem Description

You are given an integer array arr[] and a value k. The task is to find the count of all sub-arrays whose sum is divisible by k. Examples: Input: arr[] = [4, 5, 0, -2, -3, 1], k = 5 Output: 7 Explanation: There are 7 sub-arrays whose sum is divisible by k: [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3] and [-2, -3] Input: arr[] = [2, 2, 2, 2, 2, 2], k = 2 Output: 21 Explanation: All subarray sums are divisible by 2 Input: arr[] = [-1, -3, 2], k = 5 Output: 0 Explanation: There is no such sub-array whose sum is divisible by k. Constraints: 1 ≤ arr.size() ≤ 104 -106 ≤ arr[i]≤ 106 1 ≤ k ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: # Function to count the number of subarrays with a sum that is divisible by K def subCount(self, arr, k): count = 0 prefix_sum = 0 mod_map = {0: 1} # Initialize with 0:1 to handle subarrays starting at index 0 for num in arr: prefix_sum += num mod = (prefix_sum % k + k) % k # Normalize mod to be non-negative count += mod_map.get(mod, 0) mod_map[mod] = mod_map.get(mod, 0) + 1 return count. The detected topics are Expected Complexities, Company Tags PaytmAmazon, Company Tags, Paytm, Amazon, Topic Tags, Arrays, Data Structures. Review the synced source file for the implementation details.
