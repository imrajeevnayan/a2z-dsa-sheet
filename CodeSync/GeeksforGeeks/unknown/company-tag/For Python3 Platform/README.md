# For Python3 Platform

- Platform: GeeksforGeeks
- Language: class Solution { public: int minMaxProduct(vector<int> &arr1, vector<int> &arr2) { // code here return (*(std::max_element(arr1.begin(), arr1.end())) * *(std::min_element(arr2.begin(), arr2.end()))); } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Adobe, Company Tags, Adobe, Topic Tags, Arrays, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second3943/1
- Synced: 2026-07-07T15:42:09.269Z

## Problem Description

Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array arr1, and minimum element of the second array arr2. Examples : Input : arr1[] = [5, 7, 9, 3, 6, 2], arr2[] = [1, 2, 6, 1, 9] Output : 9 Explanation: The max in arr1 is 9. The min element in arr2 is 1. The product is 9*1 = 9. Input : arr1[] = [0, 0, 0, 0], arr2[] = [1, 1, 2] Output : 0 Constraints: 1 ≤ arr1.size() , arr2.size() ≤ 106 0 ≤ arr1[i], arr2[i] ≤ 108

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int minMaxProduct(vector<int> &arr1, vector<int> &arr2) { // code here return (*(std::max_element(arr1.begin(), arr1.end())) * *(std::min_element(arr2.begin(), arr2.end()))); } };. The detected topics are Expected Complexities, Company Tags Adobe, Company Tags, Adobe, Topic Tags, Arrays, Data Structures, Related Articles. Review the synced source file for the implementation details.
