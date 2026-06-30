# Find Pair Given Difference(Simple Approach):-

- Platform: GeeksforGeeks
- Language: class Solution { public int findPair(int n, int x, int[] arr) { // Sort the array Arrays.sort(arr); // Initialize two pointers int i = 0, j = 1; while (i < n && j < n) { int diff = arr[j] - arr[i]; if (diff == x && i != j) { return 1; } else if (diff < x) { j++; } else { i++; } } return -1; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonVisa, Company Tags, Amazon, Visa, Topic Tags, Sorting, Binary Search
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
- Synced: 2026-06-30T09:10:35.400Z

## Problem Description

Given an array, arr[] and an integer x, return true if there exists a pair of elements in the array whose absolute difference is x, otherwise, return false. Examples: Input: arr[] = [5, 20, 3, 2, 5, 80], x = 78 Output: true Explanation: Pair (2, 80) have an absolute difference of 78. Input: arr[] = [90, 70, 20, 80, 50], x = 45 Output: false Explanation: There is no pair with absolute difference of 45. Input: arr[] = [1], x = 1 Output: false Constraints: 1<= arr.size() <=106 1<= arr[i] <=106 0<= x <=105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int findPair(int n, int x, int[] arr) { // Sort the array Arrays.sort(arr); // Initialize two pointers int i = 0, j = 1; while (i < n && j < n) { int diff = arr[j] - arr[i]; if (diff == x && i != j) { return 1; } else if (diff < x) { j++; } else { i++; } } return -1; } }. The detected topics are Expected Complexities, Company Tags AmazonVisa, Company Tags, Amazon, Visa, Topic Tags, Sorting, Binary Search. Review the synced source file for the implementation details.
