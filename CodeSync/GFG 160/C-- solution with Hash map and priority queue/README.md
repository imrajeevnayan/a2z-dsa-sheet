# C++ solution with Hash map and priority queue

- Platform: GeeksforGeeks
- Language: import heapq class Solution: def topKFreq(self, arr, k): # Code here freq = {} for num in arr: freq[num] = freq.get(num, 0) + 1 max_heap = [] for num, fr in freq.items(): heapq.heappush(max_heap, (-fr, -num)) return [-heapq.heappop(max_heap)[1] for _ in range(k)]
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Arrays, Hash
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1
- Synced: 2026-07-15T09:42:18.089Z

## Problem Description

Given a non-empty integer array arr[]. Your task is to find and return the top k elements which have the highest frequency in the array. Note: If two numbers have the same frequency, the larger number should be given the higher priority. Examples: Input: arr[] = [3, 1, 4, 4, 5, 2, 6, 1], k = 2 Output: [4, 1] Explanation: Frequency of 4 is 2 and frequency of 1 is 2, these two have the maximum frequency and 4 is larger than 1. Input: arr[] = [7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9], k = 4 Output: [5, 11, 7, 10] Explanation: Frequency of 5 is 3, frequency of 11 is 2, frequency of 7 is 2, frequency of 10 is 1. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 105 1 ≤ k ≤ no. of distinct elements

## Explanation

This solution was accepted on GeeksforGeeks using import heapq class Solution: def topKFreq(self, arr, k): # Code here freq = {} for num in arr: freq[num] = freq.get(num, 0) + 1 max_heap = [] for num, fr in freq.items(): heapq.heappush(max_heap, (-fr, -num)) return [-heapq.heappop(max_heap)[1] for _ in range(k)]. The detected topics are Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Arrays, Hash. Review the synced source file for the implementation details.
