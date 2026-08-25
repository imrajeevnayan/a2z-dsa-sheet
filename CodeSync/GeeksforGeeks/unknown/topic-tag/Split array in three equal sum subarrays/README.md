# Split array in three equal sum subarrays

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Prefix Sum, Arrays, Related Articles, Split Array Three Equal Sum Subarrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/array-bonus-problems
- Synced: 2026-08-25T05:13:10.686Z

## Problem Description

Given an array, arr[], determine if arr can be split into three consecutive parts such that the sum of each part is equal. If possible, return any index pair(i, j) in an array such that sum(arr[0..i]) = sum(arr[i+1..j]) = sum(arr[j+1..n-1]), otherwise return an array {-1,-1}. Note: Since multiple answers are possible, return any of them. The driver code will print true if it is correct otherwise, it will print false. Examples : Input: arr[] = [1, 3, 4, 0, 4] Output: true Explanation: [1, 2] is valid pair as sum of subarray arr[0..1] is equal to sum of subarray arr[2..3] and also to sum of subarray arr[4..4]. The sum is 4, so driver code prints true. Input: arr[] = [2, 3, 4] Output: false Explanation: No three subarrays exist which have equal sum. Input: arr[] = [0, 1, 1] Output: false Constraints: 3 ≤ arr.size() ≤ 106 0 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, Prefix Sum, Arrays, Related Articles, Split Array Three Equal Sum Subarrays. Review the synced source file for the implementation details.
