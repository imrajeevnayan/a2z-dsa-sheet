# Two Sum - Pair with Given Sum

- Platform: GeeksforGeeks
- Language: class Solution { public: bool twoSum(vector<int>& arr, int target) { // code here unordered_set<int>ust; for (const int &data:arr) { if (ust.count(target - data))return true; ust.insert(data); } return false; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Zoho, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/key-pair5616/1
- Synced: 2026-09-20T10:18:15.306Z

## Problem Description

Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target. Examples: Input: arr[] = [0, -1, 2, -3, 1], target = -2 Output: true Explanation: arr[3] + arr[4] = -3 + 1 = -2 Input: arr[] = [1, -2, 1, 0, 5], target = 0 Output: false Explanation: None of the pair makes a sum of 0 Input: arr[] = [11], target = 11 Output: false Explanation: No pair is possible as only one element is present in arr[]

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: bool twoSum(vector<int>& arr, int target) { // code here unordered_set<int>ust; for (const int &data:arr) { if (ust.count(target - data))return true; ust.insert(data); } return false; } };. The detected topics are Expected Complexities, Company Tags, Zoho, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft. Review the synced source file for the implementation details.
