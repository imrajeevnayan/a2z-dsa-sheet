# Binary Array Sorting

- Platform: GeeksforGeeks
- Language: class Solution { public void binSort(int[] arr) { int count1 = 0, count0 = 0; for(int i = 0; i < arr.length; i++){ if(arr[i] == 1){ count1++; } else { count0++; } } for(int i = 0; i < count0; i++){ arr[i] = 0; } for(int i = count0; i < arr.length; i++){ arr[i] = 1; } } }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Sorting, Arrays, two-pointer-algorithm
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1
- Synced: 2026-06-14T17:04:41.003Z

## Problem Description

You are given a binary array arr[], where each element is either 0 or 1. Your task is to rearrange the array in increasing order in place (without using extra space). You do not need to return anything; simply modify the input array. Examples: Input: arr[] = [1, 0, 1, 1, 0] Output: [0, 0, 1, 1, 1] Explanation: After arranging the elements in increasing order, elements will be as 0 0 1 1 1. Input: arr[] = [1, 0, 1, 1, 1, 1, 1, 0, 0, 0] Output: [0, 0, 0, 0, 1, 1, 1, 1, 1, 1] Explanation: After arranging the elements in increasing order, elements will be 0 0 0 0 1 1 1 1 1 1. Input: arr[] = [1, 1, 1, 1] Output: [1, 1, 1, 1] Explanation: Since the array already contains only 1s, no change is needed. Constraints: 1 ≤ arr.size() ≤ 106 arr[i] ∈ {0,1} for all valid indices i.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public void binSort(int[] arr) { int count1 = 0, count0 = 0; for(int i = 0; i < arr.length; i++){ if(arr[i] == 1){ count1++; } else { count0++; } } for(int i = 0; i < count0; i++){ arr[i] = 0; } for(int i = count0; i < arr.length; i++){ arr[i] = 1; } } }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Sorting, Arrays, two-pointer-algorithm. Review the synced source file for the implementation details.
