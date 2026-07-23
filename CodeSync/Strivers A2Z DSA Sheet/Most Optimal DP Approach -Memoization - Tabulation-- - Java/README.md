# Most Optimal DP Approach (Memoization + Tabulation)! - Java

- Platform: GeeksforGeeks
- Language: class Solution: def lis(self, arr): # code here def binary_search(sub, num): ans = len(sub) # if not found left, right = 0, ans - 1 while left <= right: mid = (left+right)//2 if sub[mid] >= num: ans = mid right -= 1 else: left += 1 return ans sub = [] for num in arr: i = binary_search(sub, num) if i < len(sub): sub[i] = num else: sub.append(num) return len(sub)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, Amazon, Microsoft, OYO Rooms, Samsung, BankBazaar
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1
- Synced: 2026-07-23T13:05:44.170Z

## Problem Description

Given an array arr[] of non-negative integers, the task is to find the length of the Longest Strictly Increasing Subsequence (LIS). A subsequence is strictly increasing if each element in the subsequence is strictly less than the next element. Examples: Input: arr[] = [5, 8, 3, 7, 9, 1] Output: 3 Explanation: The longest strictly increasing subsequence could be [5, 7, 9], which has a length of 3. Input: arr[] = [10, 6, 3, 11, 7, 15] Output: 3 Explanation: One of the possible longest strictly increasing subsequences is [10, 11, 15], which has a length of 3. Input: arr[] = [3, 10, 2, 1, 20] Output: 3 Explanation: The longest strictly increasing subsequence could be [3, 10, 20], which has a length of 3. Constraints: 1 ≤ arr.size() ≤ 103 0 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def lis(self, arr): # code here def binary_search(sub, num): ans = len(sub) # if not found left, right = 0, ans - 1 while left <= right: mid = (left+right)//2 if sub[mid] >= num: ans = mid right -= 1 else: left += 1 return ans sub = [] for num in arr: i = binary_search(sub, num) if i < len(sub): sub[i] = num else: sub.append(num) return len(sub). The detected topics are Expected Complexities, Company Tags, Paytm, Amazon, Microsoft, OYO Rooms, Samsung, BankBazaar. Review the synced source file for the implementation details.
