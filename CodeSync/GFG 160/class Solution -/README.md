# class Solution {

- Platform: GeeksforGeeks
- Language: #User function Template for python3 class Solution: def removeDuplicate(self, arr): # code here freq={} for num in arr: if num not in freq: freq[num]=1 return freq
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles, Print Distinct Elements Given Integer Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array4141/1
- Synced: 2026-07-07T15:30:46.180Z

## Problem Description

Given an array arr[] of integers which may or may not contain duplicate elements. Your task is to remove duplicate elements. Your result should have elements according their first appearance in the input array. Examples: Input: arr[] = [1, 2, 3, 1, 4, 2] Output: [1, 2, 3, 4] Explanation: 2 and 1 have more than 1 occurence. Input: arr[] = [1, 2, 3, 4] Output: [1, 2, 3, 4] Explanation: There is no duplicate element. Constraints: 1<=arr.size()<=106 1<=arr[i]<=105

## Explanation

This solution was accepted on GeeksforGeeks using #User function Template for python3 class Solution: def removeDuplicate(self, arr): # code here freq={} for num in arr: if num not in freq: freq[num]=1 return freq. The detected topics are Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles, Print Distinct Elements Given Integer Array. Review the synced source file for the implementation details.
