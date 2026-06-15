# TC: O(N) SC: O(1) || CPP

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> nextGreatest(vector<int> arr) { int maxi=-1; for(int i=arr.size()-1; i>=0; i--){ int curr = arr[i]; arr[i] = maxi; maxi = max(maxi,curr); } return arr; } };
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/greater-on-right-side4305/1
- Synced: 2026-06-15T11:22:37.684Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> nextGreatest(vector<int> arr) { int maxi=-1; for(int i=arr.size()-1; i>=0; i--){ int curr = arr[i]; arr[i] = maxi; maxi = max(maxi,curr); } return arr; } };. Review the synced source file for the implementation details.
