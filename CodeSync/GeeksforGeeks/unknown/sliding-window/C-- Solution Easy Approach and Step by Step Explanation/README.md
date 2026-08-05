# C++ Solution || Easy Approach and Step by Step Explanation

- Platform: GeeksforGeeks
- Language: class Solution { public: int f(vector<int>&arr,int target) { int n = (int)arr.size(); int i =0; int j = 0; int s = 0; int res = 0; while(j<n) { s+=arr[j]; while(i<=j && s>target) { s-=arr[i]; i++; } res += (j-i+1); j++; } return res; } int countSubarray(vector<int>& arr, int l, int r) { // code here int maxr = f(arr,r); int maxl = f(arr,l-1); // cout<<maxr<<" "<<maxl<<endl; return (maxr-maxl); } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, sliding-window, Arrays, Related Articles, Number Of Subarrays Having Sum In A Given Range
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-the-number-of-subarrays/1
- Synced: 2026-08-05T10:56:01.953Z

## Problem Description

Given an integer array arr[] and two integers l and r, find the number of subarrays whose sum lies in the range [l, r] (inclusive). A subarray is a contiguous sequence of elements within the array. Examples: Input: l = 3, r = 8, arr[] = [1, 4, 6] Output: 3 Explanation: The subarrays are [1,4], [4] and [6]. Therefore answer for this test case is 3. Input: l = 4, r = 13, arr[] = [2, 3, 5, 8] Output: 6 Explanation: The subarrays are [2, 3], [2, 3, 5], [3, 5], [5], [5, 8] and [8]. Therefore answer for this test case is 6. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 104 1 ≤ l ≤ r ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int f(vector<int>&arr,int target) { int n = (int)arr.size(); int i =0; int j = 0; int s = 0; int res = 0; while(j<n) { s+=arr[j]; while(i<=j && s>target) { s-=arr[i]; i++; } res += (j-i+1); j++; } return res; } int countSubarray(vector<int>& arr, int l, int r) { // code here int maxr = f(arr,r); int maxl = f(arr,l-1); // cout<<maxr<<" "<<maxl<<endl; return (maxr-maxl); } };. The detected topics are Expected Complexities, Topic Tags, sliding-window, Arrays, Related Articles, Number Of Subarrays Having Sum In A Given Range. Review the synced source file for the implementation details.
