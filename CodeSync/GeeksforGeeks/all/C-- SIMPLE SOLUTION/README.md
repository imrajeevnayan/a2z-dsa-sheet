# C++ : SIMPLE SOLUTION

- Platform: GeeksforGeeks
- Language: TC: O(n^2) int max=1; int curr=1; for(int i=0; i<n; i++){ curr=1; for(int j=i+1; j<n; j++){ if((arr[j-1]%2==0 && arr[j]%2!=0)||(arr[j-1]%2!=0 && arr[j]%2==0)){ curr++; }else{ break; } } max=Math.max(max,curr); } return max;
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/longest-subarray-of-evens-and-odds/1
- Synced: 2026-07-31T19:37:56.825Z

## Problem Description

Given an array arr[], return the maximum possible length of a subarray such that its elements are arranged alternately either as even and odd or odd and even. Examples: Input: arr[] = [10, 12, 14, 7, 8] Output: 3 Explanation: The max length of subarray is 3 and the subarray is [14, 7, 8]. Here the array starts as an even element and has odd and even elements alternately. Input: arr[] = [4, 6] Output: 1 Explanation: The array contains [4, 6]. So, we can only choose 1 element as that will be the max length subarray. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using TC: O(n^2) int max=1; int curr=1; for(int i=0; i<n; i++){ curr=1; for(int j=i+1; j<n; j++){ if((arr[j-1]%2==0 && arr[j]%2!=0)||(arr[j-1]%2!=0 && arr[j]%2==0)){ curr++; }else{ break; } } max=Math.max(max,curr); } return max;. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles. Review the synced source file for the implementation details.
