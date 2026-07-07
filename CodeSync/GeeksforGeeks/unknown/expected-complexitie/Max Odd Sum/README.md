# Max Odd Sum

- Platform: GeeksforGeeks
- Language: # Easy-Python Solution class Solution: def findMaxOddSum(self, arr): res = 0 min_odd = float("inf") for num in arr: if num > 0: res += num if num % 2 != 0: min_odd = min(min_odd, abs(num)) if min_odd == float("inf"): return -1 if res % 2 != 0: return res return res - min_odd
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles, Subsequence Maximum Odd Sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/max-odd-sum0651/1
- Synced: 2026-07-07T16:50:46.765Z

## Problem Description

Given an array arr[] of integers, determine whether a subsequence exists with an odd sum. If such a subsequence exists, return the maximum possible odd sum. If no subsequence with an odd sum can be formed, return -1. Examples: Input: arr = [4, -3, 3, -5] Output: 7 Explanation: The subsequence with the maximum odd sum is [4, 3], and the sum is 4 + 3 = 7. Input: arr = [2, 5, -4, 3, -1] Output: 9 Explanation: The subsequence with the maximum odd sum is [2, 5, 3, -1], and the sum is 2 + 5 + 3 + (-1) = 9. Constraints: 1 ≤ arr.length ≤ 106 -103 ≤ arr[i] ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using # Easy-Python Solution class Solution: def findMaxOddSum(self, arr): res = 0 min_odd = float("inf") for num in arr: if num > 0: res += num if num % 2 != 0: min_odd = min(min_odd, abs(num)) if min_odd == float("inf"): return -1 if res % 2 != 0: return res return res - min_odd. The detected topics are Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles, Subsequence Maximum Odd Sum. Review the synced source file for the implementation details.
