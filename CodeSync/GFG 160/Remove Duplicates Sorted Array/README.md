# Remove Duplicates Sorted Array

- Platform: GeeksforGeeks
- Language: class Solution: def removeDuplicates(self, arr): # code here l = 0 i = 0 while i < len(arr): if arr[l] == arr[i]: i += 1 else: l += 1 arr[l] = arr[i] return arr[:l+1]
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Zoho, Morgan Stanley, Microsoft, Samsung, Google, Wipro
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
- Synced: 2026-06-15T11:19:35.856Z

## Problem Description

You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once. Return an array containing these distinct elements in the same order as they appeared. Examples : Input: arr[] = [2, 2, 2, 2, 2] Output: [2] Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return array containing [2] after modifying the array. Input: arr[] = [1, 2, 4] Output: [1, 2, 4] Explation: As the array does not contain any duplicates so you should return [1, 2, 4]. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def removeDuplicates(self, arr): # code here l = 0 i = 0 while i < len(arr): if arr[l] == arr[i]: i += 1 else: l += 1 arr[l] = arr[i] return arr[:l+1]. The detected topics are Expected Complexities, Company Tags, Zoho, Morgan Stanley, Microsoft, Samsung, Google, Wipro. Review the synced source file for the implementation details.
