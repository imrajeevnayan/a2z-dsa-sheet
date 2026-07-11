# Easy solution for beginners | Python Solution

- Platform: GeeksforGeeks
- Language: class Solution: def cntSubarrays(self, arr, k): # code here count = 0 prefix_sum = 0 seen = {} seen[0] = 1 for i in range(len(arr)): prefix_sum += arr[i] remove = prefix_sum - k if remove in seen: count += seen[remove] seen[prefix_sum] = seen.get(prefix_sum, 0) + 1 return count
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Hash, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1
- Synced: 2026-07-11T06:40:51.346Z

## Problem Description

Given an unsorted array arr[] of integers, find the number of subarrays whose sum exactly equal to a given number k. Examples: Input: arr[] = [10, 2, -2, -20, 10], k = -10 Output: 3 Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10. Input: arr[] = [9, 4, 20, 3, 10, 5], k = 33 Output: 2 Explaination: Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33. Input: arr[] = [1, 3, 5], k = 0 Output: 0 Explaination: No subarray with 0 sum. Constraints: 1 ≤ arr.size() ≤ 105 -103 ≤ arr[i] ≤ 103 -105 ≤ k ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def cntSubarrays(self, arr, k): # code here count = 0 prefix_sum = 0 seen = {} seen[0] = 1 for i in range(len(arr)): prefix_sum += arr[i] remove = prefix_sum - k if remove in seen: count += seen[remove] seen[prefix_sum] = seen.get(prefix_sum, 0) + 1 return count. The detected topics are Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Hash, Data Structures, Related Articles. Review the synced source file for the implementation details.
