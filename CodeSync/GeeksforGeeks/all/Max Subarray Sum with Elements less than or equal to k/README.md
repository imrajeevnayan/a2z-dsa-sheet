# Max Subarray Sum with Elements less than or equal to k

- Platform: GeeksforGeeks
- Language: class Solution { public: /*You are requried to complete this method */ long long max_Books(int a[], int n, int k) { // Your code here long long dp[n] = {0}; dp[0] = (a[0] <= k ? a[0] : 0); for(int i = 1; i < n; i++){ if(a[i] <= k){ dp[i] = dp[i-1] + a[i]; } else{ dp[i] = 0; } } return *max_element(dp, dp + n); } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Junglee Games, Company Tags, Junglee Games, Topic Tags, Arrays, Dynamic Programming, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/you-and-your-books/1
- Synced: 2026-08-14T17:50:22.544Z

## Problem Description

Given an array arr[] and an integer k, the task is to find the maximum sum of a subarray such that every element in the chosen subarray is less than or equal to k. Note: A subarray is a contiguous sequence of elements within an array. Examples: Input: k = 1, arr[] = [3, 2, 2, 3, 1, 1, 1, 3] Output: 3 Explanation: Here, the valid subarray is [1, 1, 1], since all other elements are greater than 1. The sum of this subarray is 1 + 1 + 1 = 3, which is the maximum possible. Input: k = 2, arr[] = [3, 2, 2, 3, 1, 1, 1, 3] Output: 4 Explanation: Here, the valid subarrays are [2, 2] and [1, 1, 1]. Their sums are 4 and 3 respectively. Therefore, the maximum possible sum is 4, obtained from the subarray [2, 2]. Constraints: 1 ≤ n ≤ 105 1 ≤ k ≤ 104 0 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: /*You are requried to complete this method */ long long max_Books(int a[], int n, int k) { // Your code here long long dp[n] = {0}; dp[0] = (a[0] <= k ? a[0] : 0); for(int i = 1; i < n; i++){ if(a[i] <= k){ dp[i] = dp[i-1] + a[i]; } else{ dp[i] = 0; } } return *max_element(dp, dp + n); } };. The detected topics are Expected Complexities, Company Tags Junglee Games, Company Tags, Junglee Games, Topic Tags, Arrays, Dynamic Programming, Related Articles. Review the synced source file for the implementation details.
