# Check if array is sorted

- Platform: GeeksforGeeks
- Language: class Solution { public: bool isSorted(vector<int>& arr) { // code here for(int i=0,j=i+1;i<arr.size(),j<arr.size();i++,j++){ if(arr[i]>arr[j]){ return false; } } return true; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Sorting, Data Structures, Algorithms, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
- Synced: 2026-07-14T15:23:38.618Z

## Problem Description

Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false. Examples: Input: arr[] = [10, 20, 30, 40, 50] Output: true Explanation: The given array is sorted. Input: arr[] = [90, 80, 100, 70, 40, 30] Output: false Explanation: The given array is not sorted. Constraints: 1 ≤ arr.size ≤ 106 - 109 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: bool isSorted(vector<int>& arr) { // code here for(int i=0,j=i+1;i<arr.size(),j<arr.size();i++,j++){ if(arr[i]>arr[j]){ return false; } } return true; } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Sorting, Data Structures, Algorithms, Related Articles. Review the synced source file for the implementation details.
