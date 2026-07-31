# Easiest Solution using Recursion + Backtracking! - Java

- Platform: GeeksforGeeks
- Language: class Solution { private: void solve(vector<int> nums, vector<vector<int>> &ans, int idx){ if(idx >= nums.size()){ ans.push_back(nums); return; } for(int i=idx; i<nums.size(); i++){ swap(nums[idx], nums[i]); solve(nums, ans, idx+1); // This is for backtracking swap(nums[idx], nums[i]); } } public: vector<vector<int>> permuteDist(vector<int>& arr) { // code here vector<vector<int>> ans; int idx=0; solve(arr, ans, idx); return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, Backtracking, Arrays, Recursion
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/generate-permutations-of-an-array/1
- Synced: 2026-07-31T18:14:15.655Z

## Problem Description

Given an array arr[] of unique elements. Generate all possible permutations of the elements in the array. Note: You can return the permutations in any order, the driver code will print them in sorted order. Examples: Input: arr[] = [1, 2, 3] Output: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]] Explanation: There are 6 possible permutations (3! = 6) of the array. Input: arr[] = [1, 3] Output: [[1, 3], [3, 1]] Explanation: There are 2 possible permutations (2! = 2) of the array. Constraints: 1 ≤ arr.size() ≤ 9

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { private: void solve(vector<int> nums, vector<vector<int>> &ans, int idx){ if(idx >= nums.size()){ ans.push_back(nums); return; } for(int i=idx; i<nums.size(); i++){ swap(nums[idx], nums[i]); solve(nums, ans, idx+1); // This is for backtracking swap(nums[idx], nums[i]); } } public: vector<vector<int>> permuteDist(vector<int>& arr) { // code here vector<vector<int>> ans; int idx=0; solve(arr, ans, idx); return ans; } };. The detected topics are Expected Complexities, Company Tags NPCI, Company Tags, NPCI, Topic Tags, Backtracking, Arrays, Recursion. Review the synced source file for the implementation details.
