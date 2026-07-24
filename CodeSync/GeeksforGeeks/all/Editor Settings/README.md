# Editor Settings

- Platform: GeeksforGeeks
- Language: class Solution { int lowerBound(int[] arr, int target) { int low = 0,high = arr.length; while (low < high) { int mid = low + (high - low) / 2; if (arr[mid] >= target) high = mid; else low = mid + 1; } return low; } }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/implement-lower-bound/1
- Synced: 2026-07-24T12:26:07.476Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int lowerBound(int[] arr, int target) { int low = 0,high = arr.length; while (low < high) { int mid = low + (high - low) / 2; if (arr[mid] >= target) high = mid; else low = mid + 1; } return low; } }. Review the synced source file for the implementation details.
