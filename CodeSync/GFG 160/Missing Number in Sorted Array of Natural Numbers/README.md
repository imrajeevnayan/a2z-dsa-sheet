# Missing Number in Sorted Array of Natural Numbers

- Platform: GeeksforGeeks
- Language: class Solution { int missingNumber(int arr[]) { int left = 0; int right = arr.length - 1; while (left <= right) { int mid = left + (right - left) / 2; // Check if the missing number is on the left side if (arr[mid] != mid + 1) { right = mid - 1; } else { // Missing number is on the right side left = mid + 1; } } // left points to the position where the number is missing return left + 1; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Binary Search, Mathematical, Arrays, Related Articles, Find The Missing Number In A Sorted Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/missing-number-in-sorted-array-of-natural-numbers/1
- Synced: 2026-07-24T12:29:00.711Z

## Problem Description

Given a sorted array arr[] of n-1 integers, these integers are in the range of 1 to n. There are no duplicates in the array. One of the integers is missing in the array. Find the missing integer. Examples: Input: arr[] = [1, 2, 3, 4, 6, 7, 8] Output: 5 Explanation: The missing integer in the array is 5. Input: arr[] = [1, 2, 3, 4, 5, 6, 8, 9] Output: 7 Explanation: The missing integer in the array is 7. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ arr.size()+1

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int missingNumber(int arr[]) { int left = 0; int right = arr.length - 1; while (left <= right) { int mid = left + (right - left) / 2; // Check if the missing number is on the left side if (arr[mid] != mid + 1) { right = mid - 1; } else { // Missing number is on the right side left = mid + 1; } } // left points to the position where the number is missing return left + 1; } }. The detected topics are Expected Complexities, Topic Tags, Binary Search, Mathematical, Arrays, Related Articles, Find The Missing Number In A Sorted Array. Review the synced source file for the implementation details.
