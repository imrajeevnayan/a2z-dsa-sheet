# Java Tabulation Optimal Solution

- Platform: GeeksforGeeks
- Language: int sol(int i,int k,vector<int>&nums,vector<int>&dp){ if(i==nums.size()) return 0; if(dp[i]!=-1) return dp[i]; int maxi=nums[i],res=0; for(int j=i;j-i+1<=k and j<nums.size();j++){ maxi=max(maxi,nums[j]); int next=sol(j+1,k,nums,dp); res=max(maxi*(j-i+1)+next,res); } return dp[i]=res; } int solve(int n, int k, vector<int>&nums){ vector<int>dp(n,-1); return sol(0,k,nums,dp); }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags HCLSamsung, Company Tags, HCL, Samsung, Topic Tags, Dynamic Programming, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/partition-array-for-maximum-sum/1
- Synced: 2026-08-08T15:57:17.979Z

## Problem Description

Given an integer array arr[] and an integer k, partition the array into contiguous subarrays such that each subarray has a length of at most k. After partitioning, replace every element in each subarray with the maximum element present in that subarray. Compute the maximum possible sum of the array after performing this operation. Examples : Input: arr = [4, 1, 2, 3], k = 2 Output: 14 Explanation: One optimal partition is [4, 1] and [2, 3]. Therefore, the maximum possible sum will be 4 + 4 + 3 + 3 = 14. Input: arr[] = [2, 2], k = 1 Output: 4 Explanation: The array is partitioned as [2] and [2]. Hence, the sum is 2 + 2 = 4. Input: arr[] = [4, 6, 1, 1, 1], k = 2 Output: 18 Explanation: One optimal partition is [4], [6, 1] and [1, 1], Therefore, the maximum possible sum will be 4 + 6 + 6 + 1 + 1 = 18. Constraint: 1 ≤ arr.size() ≤ 500 0 ≤ arr[i] ≤ 109 1 ≤ k ≤ arr.size()

## Explanation

This solution was accepted on GeeksforGeeks using int sol(int i,int k,vector<int>&nums,vector<int>&dp){ if(i==nums.size()) return 0; if(dp[i]!=-1) return dp[i]; int maxi=nums[i],res=0; for(int j=i;j-i+1<=k and j<nums.size();j++){ maxi=max(maxi,nums[j]); int next=sol(j+1,k,nums,dp); res=max(maxi*(j-i+1)+next,res); } return dp[i]=res; } int solve(int n, int k, vector<int>&nums){ vector<int>dp(n,-1); return sol(0,k,nums,dp); }. The detected topics are Expected Complexities, Company Tags HCLSamsung, Company Tags, HCL, Samsung, Topic Tags, Dynamic Programming, Arrays. Review the synced source file for the implementation details.
