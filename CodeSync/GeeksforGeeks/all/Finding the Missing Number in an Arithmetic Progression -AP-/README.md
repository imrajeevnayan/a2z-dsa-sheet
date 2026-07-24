# Finding the Missing Number in an Arithmetic Progression (AP)

- Platform: GeeksforGeeks
- Language: class Solution { public int findMissing(int[] arr) { int n = arr.length; // Step 1: Compute the common difference d int d1 = (arr[n-1] - arr[0]) / n; int d2 = Math.min(Math.abs(arr[n-1] - arr[n-2]), Math.abs(arr[1] - arr[0])); int d = Math.max(Math.abs(d1), Math.abs(d2)); // Apply sign for descending AP if ((arr[n-1] - arr[n-2]) < 0) { d = -d; } // Step 2: Scan to find mismatch for (int i = 0; i < n - 1; i++) { if (arr[i+1] - arr[i] != d) { return arr[i] + d; } } // If nothing found, missing number is after last element return arr[n-1] + d; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Searching, Binary Search, Hash, Related Articles, Find Missing Number Arithmetic Progression
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/missing-element-of-ap2228/1
- Synced: 2026-07-24T06:27:23.098Z

## Problem Description

Given a sorted array arr[] that represents an Arithmetic Progression (AP) with exactly one missing element, find the missing number. The array arr[] is sorted in either ascending or descending order. Note: An element will always exist that, upon inserting into a sequence forms Arithmetic progression. If the given sequence already forms a valid complete AP, return the (n+1)-th element that would come next in the sequence. Examples: Input: arr[] = [2, 4, 8, 10, 12, 14] Output: 6 Explanation: Actual AP should be 2, 4, 6, 8, 10, 12, 14. Input: arr[] = [1, 6, 11, 16, 21, 31] Output: 26 Explanation: Actual AP should be 1, 6, 11, 16, 21, 26, 31. Input: arr[] = [4, 7, 10, 13, 16] Output: 19 Explanation: Since the sequence already forms a valid AP, the next element after 16 in the sequence would be 19. Therefore, the output is 19. Constraints: 2 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 2*107

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int findMissing(int[] arr) { int n = arr.length; // Step 1: Compute the common difference d int d1 = (arr[n-1] - arr[0]) / n; int d2 = Math.min(Math.abs(arr[n-1] - arr[n-2]), Math.abs(arr[1] - arr[0])); int d = Math.max(Math.abs(d1), Math.abs(d2)); // Apply sign for descending AP if ((arr[n-1] - arr[n-2]) < 0) { d = -d; } // Step 2: Scan to find mismatch for (int i = 0; i < n - 1; i++) { if (arr[i+1] - arr[i] != d) { return arr[i] + d; } } // If nothing found, missing number is after last element return arr[n-1] + d; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Searching, Binary Search, Hash, Related Articles, Find Missing Number Arithmetic Progression. Review the synced source file for the implementation details.
