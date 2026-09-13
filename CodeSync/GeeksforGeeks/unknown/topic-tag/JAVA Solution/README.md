# JAVA Solution

- Platform: GeeksforGeeks
- Language: // no hash map solution , using just one variable class Solution { public: int totalElements(vector<int> &arr) { // code here int l=0; int h=0; int len=0; int p=0; while(h<arr.size()){ if(arr[h]==arr[l] || arr[h]==arr[p]){ len=max(len,h-l+1); h++; } else{ l=p; while(arr[p]==arr[l])p++; continue; } } return len; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, two-pointer-algorithm, Arrays, sliding-window, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/longest-subarray-with-atmost-two-distinct-integers/1
- Synced: 2026-09-13T20:54:46.006Z

## Problem Description

Given an array arr[] consisting of positive integers, your task is to find the length of the longest subarray that contains at most two distinct integers. Examples: Input: arr[] = [2, 1, 2] Output: 3 Explanation: The entire array [2, 1, 2] contains at most two distinct integers (2 and 1). Hence, the length of the longest subarray is 3. Input: arr[] = [3, 1, 2, 2, 2, 2] Output: 5 Explanation: The longest subarray containing at most two distinct integers is [1, 2, 2, 2, 2], which has a length of 5.

## Explanation

This solution was accepted on GeeksforGeeks using // no hash map solution , using just one variable class Solution { public: int totalElements(vector<int> &arr) { // code here int l=0; int h=0; int len=0; int p=0; while(h<arr.size()){ if(arr[h]==arr[l] || arr[h]==arr[p]){ len=max(len,h-l+1); h++; } else{ l=p; while(arr[p]==arr[l])p++; continue; } } return len; } };. The detected topics are Expected Complexities, Topic Tags, two-pointer-algorithm, Arrays, sliding-window, Related Articles. Review the synced source file for the implementation details.
