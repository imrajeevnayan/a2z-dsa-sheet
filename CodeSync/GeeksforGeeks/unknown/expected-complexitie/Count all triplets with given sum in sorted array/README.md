# Count all triplets with given sum in sorted array

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, two-pointer-algorithm, Hash, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-all-triplets-with-given-sum-in-sorted-array
- Synced: 2026-08-23T07:59:30.895Z

## Problem Description

Given a sorted array arr[] and a target value, the task is to count triplets (i, j, k) of valid indices, such that arr[i] + arr[j] + arr[k] = target and i < j < k. Examples: Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2 Output: 4 Explanation: Four triplets that add up to -2 are: arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2 arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2 arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2 arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2 Input: arr[] = [-2, 0, 1, 1, 5], target = 1 Output: 0 Explanation: There is no triplet whose sum is equal to 1. Constraints: 3 ≤ arr.size() ≤ 104 -105 ≤ arr[i], target ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, two-pointer-algorithm, Hash, Related Articles. Review the synced source file for the implementation details.
