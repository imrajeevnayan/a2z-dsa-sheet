# class Solution { // Function to check whether there is a subarray present with 0-sum or not. static boolean findsum(int arr[]) { // Your code here Set<Integer> set = new HashSet<>(); int sum =0; for(int num : arr){ sum+=num; if(sum==0 || set.contains(sum))return true; set.add(sum); // need to add summ beo thts where this imp } return false; }}

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags PaytmAdobe, Company Tags, Paytm, Adobe, Topic Tags, sliding-window, Hash
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
- Synced: 2026-07-10T09:58:38.140Z

## Problem Description

Given an array of integers, arr[]. Find if there is a subarray (of size at least one) with 0 sum. Return true/false depending upon whether there is a subarray present with 0-sum or not. Examples: Input: arr[] = [4, 2, -3, 1, 6] Output: true Explanation: 2, -3, 1 is the subarray with a sum of 0. Input: arr = [4, 2, 0, 1, 6] Output: true Explanation: 0 is one of the element in the array so there exist a subarray with sum 0. Input: arr = [1, 2, -1] Output: false Constraints: 1 <= arr.size <= 105 -105 <= arr[i] <= 105

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags PaytmAdobe, Company Tags, Paytm, Adobe, Topic Tags, sliding-window, Hash. Review the synced source file for the implementation details.
