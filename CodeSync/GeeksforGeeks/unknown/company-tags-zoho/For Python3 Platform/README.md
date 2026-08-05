# For Python3 Platform

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> alternateSort(vector<int>& arr) { // Your code goes here std::sort(arr.begin(), arr.end()); int start = 0; int end = arr.size() - 1; vector<int> ans; ans.reserve(arr.size()); while (start < end) { ans.push_back(arr[end--]); ans.push_back(arr[start++]); } if (start == end) { ans.push_back(arr[start]); } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Zoho, Company Tags, Zoho, Topic Tags, Arrays, Sorting, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/alternative-sorting1311/1
- Synced: 2026-08-05T11:04:07.074Z

## Problem Description

Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the largest and the second element is the smallest, the third element is the second largest and the fourth element is the second smallest, and so on. Examples: Input: arr[] = [7, 1, 2, 3, 4, 5, 6] Output: [7, 1, 6, 2, 5, 3, 4] Explanation: The first element is first maximum and second element is first minimum and so on. Input: arr[] = [1, 6, 9, 4, 3, 7, 8, 2] Output: [9, 1, 8, 2, 7, 3, 6, 4] Explanation: The first element is first maximum and second element is first minimum and so on. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> alternateSort(vector<int>& arr) { // Your code goes here std::sort(arr.begin(), arr.end()); int start = 0; int end = arr.size() - 1; vector<int> ans; ans.reserve(arr.size()); while (start < end) { ans.push_back(arr[end--]); ans.push_back(arr[start++]); } if (start == end) { ans.push_back(arr[start]); } return ans; } };. The detected topics are Expected Complexities, Company Tags Zoho, Company Tags, Zoho, Topic Tags, Arrays, Sorting, Related Articles. Review the synced source file for the implementation details.
