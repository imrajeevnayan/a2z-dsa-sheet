# Elements in the Range

- Platform: GeeksforGeeks
- Language: class Solution: def checkElements(self, start, end, arr): # code here found = [False for i in range(start, end+1)] for i in arr: if i in range(start, end+1): found[i-start] = True return all(found)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Searching, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/elements-in-the-range2834/1
- Synced: 2026-07-07T16:12:33.628Z

## Problem Description

Given an array arr[] containing distinct positive integers, and two integers start and end defining a range. Determine if the array contains all elements within inclusive range [start, end]. Note: If the array contains all elements in the given range return true otherwise return false. Examples : Input: start = 2, end = 5, arr[] = [1, 4, 5, 2, 7, 8, 3] Output: true Explanation: All integers within the range [2, 5] are 2, 3, 4, and 5, and all of them are present in the array. Therefore, the answer is true for this test case. Input: start = 2, end = 6, arr[] = [1, 4, 5, 2, 7, 8, 3] Output: false Explanation: The array does not contain 6; hence, it does not contain all the elements in the range [2, 6]. Therefore, the output is false. Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 105 0 ≤ start ≤ end ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def checkElements(self, start, end, arr): # code here found = [False for i in range(start, end+1)] for i in arr: if i in range(start, end+1): found[i-start] = True return all(found). The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Searching, Data Structures. Review the synced source file for the implementation details.
