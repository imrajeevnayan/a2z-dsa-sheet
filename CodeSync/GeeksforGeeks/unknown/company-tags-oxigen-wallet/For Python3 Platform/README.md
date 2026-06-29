# For Python3 Platform

- Platform: GeeksforGeeks
- Language: class Solution { int findSum(int arr[]){ int n = arr.length; Arrays.sort(arr); int sum=arr[0]; for(int i=0;i<n-1;i++){ if(arr[i]==arr[i+1]){ continue; } sum=sum+arr[i+1]; } return sum; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Oxigen Wallet, Company Tags, Oxigen Wallet, Topic Tags, Arrays, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-distinct-elements4801/1
- Synced: 2026-06-29T16:08:35.796Z

## Problem Description

You are given an array arr. Find the sum of distinct elements in an array. Examples: Input: arr[] = [1, 2, 3, 4, 5] Output: 15 Explanation: Distinct elements are 1, 2, 3, 4, 5. So sum is 15. Input: arr[] = [5, 5, 5, 5, 5] Output: 5 Explanation: Only Distinct element is 5. So sum is 5. Constraints: 1 ≤ arr.size() ≤ 106 0 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int findSum(int arr[]){ int n = arr.length; Arrays.sort(arr); int sum=arr[0]; for(int i=0;i<n-1;i++){ if(arr[i]==arr[i+1]){ continue; } sum=sum+arr[i+1]; } return sum; } }. The detected topics are Expected Complexities, Company Tags Oxigen Wallet, Company Tags, Oxigen Wallet, Topic Tags, Arrays, Data Structures, Related Articles. Review the synced source file for the implementation details.
