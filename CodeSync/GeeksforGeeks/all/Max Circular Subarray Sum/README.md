# Max Circular Subarray Sum

- Platform: GeeksforGeeks
- Language: class Solution { public int maxCircularSum(int arr[]) { // code here int globalMax=arr[0]; int globalMin=arr[0]; int currMin=0; int currMax=0; int n=arr.length; int totalSum=0; for(int i=0;i<n;i++) { currMax+=arr[i]; totalSum+=arr[i]; if(currMax<0) { currMax=0; globalMax=Math.max(arr[i],globalMax); } else{ globalMax=Math.max(currMax,globalMax); } currMin+=arr[i]; if(currMin>0) { currMin=0; } else{ globalMin=Math.min(currMin,globalMin); } } if(globalMax<0) return globalMax; return Math.max(totalSum-globalMin,globalMax); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Arrays, Kadane
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1
- Synced: 2026-08-15T08:56:35.080Z

## Problem Description

You are given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases. Examples: Input: arr[] = [8, -8, 9, -9, 10, -11, 12] Output: 22 Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22. Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1] Output: 23 Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10]. Input: arr[] = [5, -2, 3, 4] Output: 12 Explanation: The circular subarray [3, 4, 5] gives the maximum sum of 12. Constraints: 1 ≤ arr.size() ≤ 105 -104 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int maxCircularSum(int arr[]) { // code here int globalMax=arr[0]; int globalMin=arr[0]; int currMin=0; int currMax=0; int n=arr.length; int totalSum=0; for(int i=0;i<n;i++) { currMax+=arr[i]; totalSum+=arr[i]; if(currMax<0) { currMax=0; globalMax=Math.max(arr[i],globalMax); } else{ globalMax=Math.max(currMax,globalMax); } currMin+=arr[i]; if(currMin>0) { currMin=0; } else{ globalMin=Math.min(currMin,globalMin); } } if(globalMax<0) return globalMax; return Math.max(totalSum-globalMin,globalMax); } }. The detected topics are Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Arrays, Kadane. Review the synced source file for the implementation details.
