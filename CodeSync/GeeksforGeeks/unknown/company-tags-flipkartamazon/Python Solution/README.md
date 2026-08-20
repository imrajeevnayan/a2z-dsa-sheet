# Python Solution:

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> findSmallestRange(vector<vector<int>>& nums) { // Code here int k = nums.size(); map<int, int> mp; vector<pair<int, int>> vec; for (int i = 0; i < k; i++){ for (int j = 0; j < nums[i].size(); j++){ vec.push_back({nums[i][j], i}); } } sort(vec.begin(), vec.end()); int all = 0; int ans = INT_MAX; int a = -1, b = -1; int i = 0, j = 0, n = vec.size(); while (j < n){ mp[vec[j].second]++; while (mp.size() >= k){ if (vec[j].first-vec[i].first < ans){ a = vec[i].first; b = vec[j].first; ans = vec[j].first-vec[i].first; } else if (vec[j].first-vec[i].first == ans){ if (vec[i].first < a){ a = vec[i].first; b = vec[j].first; } } mp[vec[i].second]--; if (mp[vec[i].second] == 0) mp.erase(vec[i].second); i++; } j++; } return {a, b}; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags FlipkartAmazon, Company Tags, Flipkart, Amazon, Topic Tags, Arrays, Heap
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-smallest-range-containing-elements-from-k-lists/1
- Synced: 2026-08-20T13:35:12.377Z

## Problem Description

Given a 2d integer array mat[][] of size n*k, where each row is sorted in ascending order. Your task is to find the smallest range [l, r] that includes at least one element from each of the n lists. If more than one such ranges are found, return the first one. Note: If there are two possible ranges [a, b] and [c, d] with the same size, choose the one with the smaller starting value, i.e., consider [a, b] if a < c. Examples: Input: mat[][] = [[4, 7, 9, 12, 15], [0, 8, 10, 14, 20], [6, 12, 16, 30, 50]] Output: [6, 8] Explanation: Smallest range is formed by number 7 from the first list, 8 from second list and 6 from the third list. Input: mat[][] = [[2, 4], [1, 7], [20, 40]] Output: [4, 20] Explanation: Smallest range is formed by number 4 from the first list, 7 from second list and 20 from the third list. Constraints: 1 ≤ n, k ≤ 500 0 ≤ mat[i][j] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> findSmallestRange(vector<vector<int>>& nums) { // Code here int k = nums.size(); map<int, int> mp; vector<pair<int, int>> vec; for (int i = 0; i < k; i++){ for (int j = 0; j < nums[i].size(); j++){ vec.push_back({nums[i][j], i}); } } sort(vec.begin(), vec.end()); int all = 0; int ans = INT_MAX; int a = -1, b = -1; int i = 0, j = 0, n = vec.size(); while (j < n){ mp[vec[j].second]++; while (mp.size() >= k){ if (vec[j].first-vec[i].first < ans){ a = vec[i].first; b = vec[j].first; ans = vec[j].first-vec[i].first; } else if (vec[j].first-vec[i].first == ans){ if (vec[i].first < a){ a = vec[i].first; b = vec[j].first; } } mp[vec[i].second]--; if (mp[vec[i].second] == 0) mp.erase(vec[i].second); i++; } j++; } return {a, b}; } };. The detected topics are Expected Complexities, Company Tags FlipkartAmazon, Company Tags, Flipkart, Amazon, Topic Tags, Arrays, Heap. Review the synced source file for the implementation details.
