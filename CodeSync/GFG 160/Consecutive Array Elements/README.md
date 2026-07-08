# Consecutive Array Elements

- Platform: GeeksforGeeks
- Language: class Solution: def areConsecutive(self, arr): n = len(arr) high = 0 ans = 0 for i in range(n): ans += arr[i] high = max(high, arr[i]) rsum = (high * (high + 1)) // 2 return ans == rsum
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles, Check If Array Elements Are Consecutive
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/consecutive-array-elements2711/1
- Synced: 2026-07-08T12:27:57.189Z

## Problem Description

Given an unsorted array arr of positive integers, find whether the array consists of consecutive distinct numbers or not. The result is going to be true if the array contains all integers in the range from the minimum to the maximum present exactly once, otherwise false. Examples: Input: arr[] = [5, 4, 2, 1, 3] Output: true Explanation: All are consecutive elements, according to this order 1, 2, 3, 4 and 5. Input: arr[] = [2, 1, 4] Output: false Explanation: All elements are not consecutive. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def areConsecutive(self, arr): n = len(arr) high = 0 ans = 0 for i in range(n): ans += arr[i] high = max(high, arr[i]) rsum = (high * (high + 1)) // 2 return ans == rsum. The detected topics are Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles, Check If Array Elements Are Consecutive. Review the synced source file for the implementation details.
