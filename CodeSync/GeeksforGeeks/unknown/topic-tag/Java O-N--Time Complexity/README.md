# Java O(N)-Time Complexity

- Platform: GeeksforGeeks
- Language: // User function Template for Java class Solution { public int[] dupLastIndex(int[] arr) { // Complete the function int l = arr.length-1; int l1 = arr.length-2; while(l1 >=0){ if(arr[l]==arr[l1])return new int []{l,arr[l]}; else l--; l1--; } return new int [] {-1,-1}; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles, Last Duplicate Element Sorted Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/last-duplicate-element-in-a-sorted-array5539/1
- Synced: 2026-07-07T15:33:07.578Z

## Problem Description

You are given a sorted array arr[] that may contain duplicate elements. Your task is to find the index of the last occurrence of any duplicate element and return the index along with the value of that element. If no duplicate element is found, return [-1, -1]. Examples : Input: arr[] = [1, 5, 5, 6, 6, 7] Output: [4, 6] Explanation: Last duplicate element is 6 having index 4. Input: arr[] = [1, 2, 3, 4, 5] Output: [-1, -1] Explanation: No duplicate elements are present in the array. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for Java class Solution { public int[] dupLastIndex(int[] arr) { // Complete the function int l = arr.length-1; int l1 = arr.length-2; while(l1 >=0){ if(arr[l]==arr[l1])return new int []{l,arr[l]}; else l--; l1--; } return new int [] {-1,-1}; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Data Structures, Related Articles, Last Duplicate Element Sorted Array. Review the synced source file for the implementation details.
