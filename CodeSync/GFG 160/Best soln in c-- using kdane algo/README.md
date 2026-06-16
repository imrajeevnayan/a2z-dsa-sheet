# Best soln in c++ using kdane algo...

- Platform: GeeksforGeeks
- Language: vector<int> subarraySum(vector<int> &arr, int target) { // code here int sum=0; vector<int>v; int j=0; for(int i=0;i<arr.size();i++) { //chekc sum+=arr[i]; //work while(sum>target && j<i) { sum-=arr[j]; j++; } if(sum==target) { v.push_back(i+1); break; } } if(v.size()!=0) { v.push_back(j+1); reverse(v.begin(),v.end()); return v; } return {-1}; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonFacebookGoogleVisa, Company Tags, Amazon, Facebook, Google, Visa, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
- Synced: 2026-06-15T17:07:14.888Z

## Problem Description

Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target. Note: If no such array is possible then, return [-1]. Examples: Input: arr[] = [1, 2, 3, 7, 5], target = 12 Output: [2, 4] Explanation: The sum of elements from 2nd to 4th position is 12. Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15 Output: [1, 5] Explanation: The sum of elements from 1st to 5th position is 15. Input: arr[] = [5, 3, 4], target = 2 Output: [-1] Explanation: There is no subarray with sum 2. Constraints: 1 ≤ arr.size() ≤ 106 0 ≤ arr[i] ≤ 103 0 ≤ target ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using vector<int> subarraySum(vector<int> &arr, int target) { // code here int sum=0; vector<int>v; int j=0; for(int i=0;i<arr.size();i++) { //chekc sum+=arr[i]; //work while(sum>target && j<i) { sum-=arr[j]; j++; } if(sum==target) { v.push_back(i+1); break; } } if(v.size()!=0) { v.push_back(j+1); reverse(v.begin(),v.end()); return v; } return {-1}; }. The detected topics are Expected Complexities, Company Tags AmazonFacebookGoogleVisa, Company Tags, Amazon, Facebook, Google, Visa, Topic Tags. Review the synced source file for the implementation details.
