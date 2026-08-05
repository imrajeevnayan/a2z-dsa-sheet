# Intersection of Two Sorted Arrays

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> intersection(vector<int> &arr1, vector<int> &arr2) { vector<int> res; int i = 0; int j = 0; while (i < arr1.size() && j < arr2.size()) { if (arr1[i] == arr2[j]) { if (res.empty() || res.back() != arr1[i]) { res.push_back(arr1[i]); } i++; j++; } else if (arr1[i] < arr2[j]) { i++; } else { j++; } } return res; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Sorting, Related Articles, Union And Intersection Of Two Sorted Arrays 2
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/1
- Synced: 2026-08-05T11:31:02.581Z

## Problem Description

Given two sorted arrays arr1[] and arr2[]. Your task is to return the intersection of both arrays. Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not count duplicate elements. Note: If there is no intersection then return an empty array. Examples: Input: arr1[] = [1, 2, 3, 4], arr2[] = [2, 4, 6, 7, 8] Output: [2, 4] Explanation: 2 and 4 are only common elements in both the arrays. Input: arr1[] = [1, 2, 2, 3, 4], arr2[] = [2, 2, 4, 6, 7, 8] Output: [2, 4] Explanation: 2 and 4 are the only common elements. Input: arr1[] = [1, 2], arr2[] = [3, 4] Output: [] Explanation: No common elements. Constraints: 1 ≤ arr1.size(),arr2.size() ≤ 105 1 ≤ arr1[i], arr2[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> intersection(vector<int> &arr1, vector<int> &arr2) { vector<int> res; int i = 0; int j = 0; while (i < arr1.size() && j < arr2.size()) { if (arr1[i] == arr2[j]) { if (res.empty() || res.back() != arr1[i]) { res.push_back(arr1[i]); } i++; j++; } else if (arr1[i] < arr2[j]) { i++; } else { j++; } } return res; } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Sorting, Related Articles, Union And Intersection Of Two Sorted Arrays 2. Review the synced source file for the implementation details.
