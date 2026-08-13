# C++ Solution using unordered Maps:

- Platform: GeeksforGeeks
- Language: #User function Template for python3 class Solution: def subArraySum(self,arr,k): #code here dc = {0:1} cur_sm = 0 res = 0 for ind, num in enumerate(arr): cur_sm += num dc[cur_sm] = dc.get(cur_sm,0) + 1 if cur_sm-k in dc: # print(ind, cur_sm) # print(dc) res+= dc[cur_sm-k] return res
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/subarray-range-with-given-sum2804/1
- Synced: 2026-08-13T17:26:33.352Z

## Problem Description

Given an unsorted array arr[] of integers and a sum k. Count the number of subarrays that add to a given number k. Examples: Input: arr[] = [10, 2, -2, -20, 10], k = -10 Output: 3 Explanation: Subarrays with sum -10 are: [10, 2, -2, -20], [2, -2, -20, 10] and [-20, 10]. Input: arr[] = [1, 4, 20, 3, 10, 5], k = 33 Output: 1 Explanation: Only 1 subarray exist with sum 33 is: [20, 3, 10].

## Explanation

This solution was accepted on GeeksforGeeks using #User function Template for python3 class Solution: def subArraySum(self,arr,k): #code here dc = {0:1} cur_sm = 0 res = 0 for ind, num in enumerate(arr): cur_sm += num dc[cur_sm] = dc.get(cur_sm,0) + 1 if cur_sm-k in dc: # print(ind, cur_sm) # print(dc) res+= dc[cur_sm-k] return res. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, Related Articles. Review the synced source file for the implementation details.
