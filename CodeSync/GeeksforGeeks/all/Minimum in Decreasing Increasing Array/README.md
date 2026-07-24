# Minimum in Decreasing Increasing Array

- Platform: GeeksforGeeks
- Language: class Solution { public int findMinIndex(int[] arr) { int left = 0; int right = arr.length - 1; while (left < right) { int mid = left + (right - left) / 2; // If mid element is greater than its next element, // the minimum lies to the right if (arr[mid] > arr[mid + 1]) { left = mid + 1; } else { // Minimum is at mid or to the left right = mid; } } // At the end, left == right pointing to the minimum return left; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Binary Search, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/ternary-search/1
- Synced: 2026-07-24T12:25:15.829Z

## Problem Description

Given an array arr[] that strictly decreases and then strictly increases, the array is said to be V-shaped or unimodal. Find the index of the minimum element present in the array. Examples: Input: arr[] = [9, 7, 5, 2, 4, 6, 10] Output: 3 Explanation: The minimum of the given array is 2, which is at index 3. Input: arr[] = [10, 8, 6, 5, 2, 12, 14] Output: 4 Explanation: The minimum of the given array is 2, which is at index 4. Constraint: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int findMinIndex(int[] arr) { int left = 0; int right = arr.length - 1; while (left < right) { int mid = left + (right - left) / 2; // If mid element is greater than its next element, // the minimum lies to the right if (arr[mid] > arr[mid + 1]) { left = mid + 1; } else { // Minimum is at mid or to the left right = mid; } } // At the end, left == right pointing to the minimum return left; } }. The detected topics are Expected Complexities, Topic Tags, Binary Search, Related Articles. Review the synced source file for the implementation details.
