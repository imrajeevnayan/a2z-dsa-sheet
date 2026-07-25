# 4 Sum - All Quadruples

- Platform: GeeksforGeeks
- Language: class Solution: def fourSum(self, arr, target): # code here arr.sort() res = [] for i in range(len(arr)): if i > 0 and arr[i] == arr[i-1]: continue for j in range(i+1, len(arr)): if j > i+1 and arr[j] == arr[j-1]: continue # two pointers left, right = j+1, len(arr)-1 while left < right: total = arr[i] + arr[j] + arr[left] + arr[right] if total == target: res.append([arr[i], arr[j], arr[left], arr[right]]) left += 1 right -= 1 while left < right and arr[left] == arr[left-1]: left += 1 while left < right and arr[right] == arr[right+1]: right -= 1 elif total < target: left += 1 else: right -= 1 return res
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Amazon, Microsoft, OYO Rooms, Adobe, Google, NPCI
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
- Synced: 2026-07-25T18:54:33.168Z

## Problem Description

Given an array arr[] of integers and another integer target. You have to find all unique quadruples from the given array whose sum is equal to the given target. Note: All the quadruples should be internally sorted, i.e for any quadruple [q1, q2, q3, q4] it should be : q1 ≤ q2 ≤ q3 ≤ q4. Examples : Input: arr[] = [0, 0, 2, 1, 1], target = 3 Output: [[0, 0, 1, 2]] Explanation: Sum of 0, 0, 1, 2 is equal to 3. Input: arr[] = [10, 2, 3, 4, 5, 7, 8], target = 23 Output: [[2, 3, 8, 10], [2, 4, 7, 10], [3, 5, 7, 8]] Explanation: Sum of [2, 3, 8, 10] is 23, sum of [2, 4, 7, 10] is 23 and sum of [3, 5, 7, 8] is also 23. Input: arr[] = [0, 0, 2, 1, 1], target = 2 Output: [[0, 0, 1, 1]] Explanation: Sum of [0, 0, 1, 1] is equal to 2. Constraints: 1 ≤ arr.size() ≤ 200 -106 ≤ target ≤ 106 -106 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def fourSum(self, arr, target): # code here arr.sort() res = [] for i in range(len(arr)): if i > 0 and arr[i] == arr[i-1]: continue for j in range(i+1, len(arr)): if j > i+1 and arr[j] == arr[j-1]: continue # two pointers left, right = j+1, len(arr)-1 while left < right: total = arr[i] + arr[j] + arr[left] + arr[right] if total == target: res.append([arr[i], arr[j], arr[left], arr[right]]) left += 1 right -= 1 while left < right and arr[left] == arr[left-1]: left += 1 while left < right and arr[right] == arr[right+1]: right -= 1 elif total < target: left += 1 else: right -= 1 return res. The detected topics are Expected Complexities, Company Tags, Amazon, Microsoft, OYO Rooms, Adobe, Google, NPCI. Review the synced source file for the implementation details.
