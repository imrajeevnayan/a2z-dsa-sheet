# Java code with O(n) and O(n) using prefix sum + hasmap : Simple way

- Platform: GeeksforGeeks
- Language: class Solution { int maxLength(int arr[]) { // code here int sum = 0; Map<Integer,Integer> map = new HashMap<>(); int maxi=0; for(int i=0;i<arr.length;i++){ sum+=arr[i]; if(sum==0){ maxi= Math.max(maxi,i+1); } else if(map.containsKey(sum)){ maxi= Math.max(maxi,i-map.get(sum)); } else{ map.put(sum,i); } } return maxi; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftMakeMyTripNPCI, Company Tags, Amazon, Microsoft, MakeMyTrip, NPCI, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
- Synced: 2026-07-08T11:34:30.661Z

## Problem Description

Given an array arr[] containing both positive and negative integers, the task is to find the length of the longest subarray with a sum equals to 0. Note: A subarray is a contiguous part of an array, formed by selecting one or more consecutive elements while maintaining their original order. Examples: Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23] Output: 5 Explanation: The longest subarray with sum equals to 0 is [-2, 2, -8, 1, 7]. Input: arr[] = [2, 10, 4] Output: 0 Explanation: There is no subarray with a sum of 0. Input: arr[] = [1, 0, -4, 3, 1, 0] Output: 5 Explanation: The longest subarray with sum equals to 0 is [0, -4, 3, 1, 0] Constraints: 1 ≤ arr.size() ≤ 106 −103 ≤ arr[i] ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int maxLength(int arr[]) { // code here int sum = 0; Map<Integer,Integer> map = new HashMap<>(); int maxi=0; for(int i=0;i<arr.length;i++){ sum+=arr[i]; if(sum==0){ maxi= Math.max(maxi,i+1); } else if(map.containsKey(sum)){ maxi= Math.max(maxi,i-map.get(sum)); } else{ map.put(sum,i); } } return maxi; } }. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftMakeMyTripNPCI, Company Tags, Amazon, Microsoft, MakeMyTrip, NPCI, Topic Tags. Review the synced source file for the implementation details.
