# Subarrays With At Most K Distinct

- Platform: GeeksforGeeks
- Language: class Solution { public: int countAtMostK(vector<int> &arr, int k) { // code here unordered_map<int, int> mp; int l=0, ans=0; for (int r=0; r<arr.size(); r++) { mp[arr[r]]++; while (mp.size()>k) { mp[arr[l]]--; if (mp[arr[l]] == 0) mp.erase(arr[l]); l++; } ans += r-l+1; } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, sliding-window, Arrays, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/subarrays-with-at-most-k-distinct-integers/1
- Synced: 2026-08-02T10:47:14.630Z

## Problem Description

You are given an array arr[] of positive integers and an integer k, find the number of subarrays in arr[] where the count of distinct integers is at most k. Note: A subarray is a contiguous part of an array. Examples: Input: arr[] = [1, 2, 2, 3], k = 2 Output: 9 Explanation: Subarrays with at most 2 distinct elements are: [1], [2], [2], [3], [1, 2], [2, 2], [2, 3], [1, 2, 2] and [2, 2, 3]. Input: arr[] = [1, 1, 1], k = 1 Output: 6 Explanation: Subarrays with at most 1 distinct element are: [1], [1], [1], [1, 1], [1, 1] and [1, 1, 1]. Input: arr[] = [1, 2, 1, 1, 3, 3, 4, 2, 1], k = 2 Output: 24 Explanation: There are 24 subarrays with at most 2 distinct elements. Constraints: 1 ≤ arr.size() ≤ 2*104 1 ≤ k ≤ 2*104 1 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int countAtMostK(vector<int> &arr, int k) { // code here unordered_map<int, int> mp; int l=0, ans=0; for (int r=0; r<arr.size(); r++) { mp[arr[r]]++; while (mp.size()>k) { mp[arr[l]]--; if (mp[arr[l]] == 0) mp.erase(arr[l]); l++; } ans += r-l+1; } return ans; } };. The detected topics are Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, sliding-window, Arrays, Related Articles. Review the synced source file for the implementation details.
