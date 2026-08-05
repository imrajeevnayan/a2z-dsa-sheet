# Min Diff Pair

- Platform: GeeksforGeeks
- Language: class Solution { public int minimumDifference(int[] arr) { Arrays.sort(arr); int minDiff = arr[1] - arr[0]; for (int i=1; i<arr.length-1; i++) { int diff = arr[i+1] - arr[i]; if (diff < minDiff) { minDiff = diff; } } return minDiff; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Sorting, Related Articles, Find Minimum Difference Pair
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/minimum-difference-pair5444/1
- Synced: 2026-08-05T11:08:16.841Z

## Problem Description

Given an array arr[]. find the minimum difference between any pair in the given array. Examples: Input: arr[] = [2, 4, 5, 9, 7] Output: 1 Explanation: Difference between 5 and 4 is 1. Input: arr[] = [3, 10, 8, 6] Output: 2 Explanation: Difference between 8 and 6 is 2. Constraints: 2 <= arr.size() <= 105 1 <= arr[i] <= 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int minimumDifference(int[] arr) { Arrays.sort(arr); int minDiff = arr[1] - arr[0]; for (int i=1; i<arr.length-1; i++) { int diff = arr[i+1] - arr[i]; if (diff < minDiff) { minDiff = diff; } } return minDiff; } }. The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Sorting, Related Articles, Find Minimum Difference Pair. Review the synced source file for the implementation details.
