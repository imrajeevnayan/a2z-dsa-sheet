# //Easy solution using compare function ----------->

- Platform: GeeksforGeeks
- Language: import heapq class Solution: def printKClosest(self, arr, k, x): # code here res = [] min_heap = [] for num in arr: if num != x: heapq.heappush(min_heap, (-abs(num-x), num)) if len(min_heap) > k: heapq.heappop(min_heap) for _ in range(k): res.append(heapq.heappop(min_heap)[1]) return res[::-1]
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonOYO Rooms, Company Tags, Amazon, OYO Rooms, Topic Tags, Arrays, Binary Search
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/k-closest-elements3619/1
- Synced: 2026-07-24T05:20:18.214Z

## Problem Description

You are given a sorted array arr[] of unique integers, an integer k, and a target value x. Return exactly k elements from the array closest to x, excluding x if it exists. An element a is closer to x than b if: |a - x| < |b - x|, or |a - x| == |b - x| and a > b (i.e., prefer the larger element if tied) Return the k closest elements in order of closeness. Examples: Input: arr[] = [1, 3, 4, 10, 12], k = 2, x = 4 Output: [3, 1] Explanation: 4 is excluded from the consideration. The closest element to 4 is 3 with a distance of 1. The next closest element is 1 with a distance of 3. Input: arr[] = [10, 20, 30, 40, 50], k = 3, x = 25 Output: [30, 20, 40] Explanation: First closest element to 25 is 30, since 30 > 20. Second closest element to 25 is 20. Third closest element to 25 is 40. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ k ≤ arr.size() 1 ≤ x ≤ 106 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using import heapq class Solution: def printKClosest(self, arr, k, x): # code here res = [] min_heap = [] for num in arr: if num != x: heapq.heappush(min_heap, (-abs(num-x), num)) if len(min_heap) > k: heapq.heappop(min_heap) for _ in range(k): res.append(heapq.heappop(min_heap)[1]) return res[::-1]. The detected topics are Expected Complexities, Company Tags AmazonOYO Rooms, Company Tags, Amazon, OYO Rooms, Topic Tags, Arrays, Binary Search. Review the synced source file for the implementation details.
