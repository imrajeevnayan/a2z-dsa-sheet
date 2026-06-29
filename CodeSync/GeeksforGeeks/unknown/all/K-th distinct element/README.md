# K-th distinct element

- Platform: GeeksforGeeks
- Language: from collections import Counter class Solution: def KthDistinct(self, nums, k): freq = Counter(nums) distinct = [x for x in nums if freq[x] == 1] return distinct[k - 1] if k <= len(distinct) else -1
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Hash, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/k-th-distinct-element4510/1
- Synced: 2026-06-29T18:18:23.451Z

## Problem Description

Given an integer array arr[] and an integer k, find the k-th distinct element in the array. A distinct element is an element that appears exactly once in the entire array. Distinct elements are considered in the same order as they appear in the array. Return the k-th distinct element if it exists; otherwise, return -1. Examples: Input: arr[] = [1, 2, 1, 3, 4, 2], k = 2 Output: 4 Explanation: The elements that appear exactly once are 3 and 4. In their order of appearance, the 2nd distinct element is 4. Input: arr[] = [5, 1, 2, 5, 3, 2, 4], k = 3 Output: 4 Explanation: The elements that appear exactly once are 1, 3, and 4. The 3rd distinct element is 4. Constranits: 1 ≤ n ≤ 105, where n is the length of the array 1 ≤ arr[i] ≤ 106 1 ≤ k ≤ n

## Explanation

This solution was accepted on GeeksforGeeks using from collections import Counter class Solution: def KthDistinct(self, nums, k): freq = Counter(nums) distinct = [x for x in nums if freq[x] == 1] return distinct[k - 1] if k <= len(distinct) else -1. The detected topics are Expected Complexities, Topic Tags, Hash, Data Structures, Related Articles. Review the synced source file for the implementation details.
