# Swap kth elements

- Platform: GeeksforGeeks
- Language: class Solution: def swapKth(self, arr, k): arr[k-1], arr[-k] = arr[-k], arr[k-1] return arr
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Morgan StanleyRockstand, Company Tags, Morgan Stanley, Rockstand, Topic Tags, Arrays, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/swap-kth-elements5500/1
- Synced: 2026-07-07T16:52:15.719Z

## Problem Description

Given an array arr[], swap the kth element from the beginning with the kth element from the end. Note: 1-based indexing is followed. Examples : Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3 Output: [1, 2, 6, 4, 5, 3, 7, 8] Explanation: 3rd element from beginning is 3 and 3rd element from end is 6, so we replace 3 & 6. Input: arr[] = [5, 3, 6, 1, 2], k = 2 Output: [5, 1, 6, 3, 2] Explanation: 2nd element from beginning is 3 and from end is 1. Constraints: 1 ≤ arr.size(), k ≤ 106 -109 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def swapKth(self, arr, k): arr[k-1], arr[-k] = arr[-k], arr[k-1] return arr. The detected topics are Expected Complexities, Company Tags Morgan StanleyRockstand, Company Tags, Morgan Stanley, Rockstand, Topic Tags, Arrays, Data Structures. Review the synced source file for the implementation details.
