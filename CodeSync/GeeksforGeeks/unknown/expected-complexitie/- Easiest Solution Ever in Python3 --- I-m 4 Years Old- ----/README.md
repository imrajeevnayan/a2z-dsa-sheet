# # Easiest Solution Ever in Python3 🍄, I'm 4 Years Old! 🦄🥑

- Platform: GeeksforGeeks
- Language: class Solution: def countSubarrWithEqualZeroAndOne(self,arr, n): for i in range(n): if arr[i]==0: arr[i]=-1 count=0 curr_sum=0 d={0:1} for a in arr: curr_sum+=a count+=d.get(curr_sum,0) d[curr_sum]=d.get(curr_sum,0)+1 return count
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, Data Structures, prefix-sum, Related Articles, Count Subarrays Equal Number 1s 0s
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1
- Synced: 2026-07-11T06:52:27.231Z

## Problem Description

Given an array arr[] containing 0s and 1s. Count the number of subarrays having equal number of 0s and 1s. Examples: Input: arr[] = [1, 0, 0, 1, 0, 1, 1] Output: 8 Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5) ,(2, 5), (0, 5), (1, 6) Input: arr[] = [1, 1, 1, 1, 0] Output: 1 Explanation: The index range for the subarray is (3,4). Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 1

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def countSubarrWithEqualZeroAndOne(self,arr, n): for i in range(n): if arr[i]==0: arr[i]=-1 count=0 curr_sum=0 d={0:1} for a in arr: curr_sum+=a count+=d.get(curr_sum,0) d[curr_sum]=d.get(curr_sum,0)+1 return count. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, Data Structures, prefix-sum, Related Articles, Count Subarrays Equal Number 1s 0s. Review the synced source file for the implementation details.
