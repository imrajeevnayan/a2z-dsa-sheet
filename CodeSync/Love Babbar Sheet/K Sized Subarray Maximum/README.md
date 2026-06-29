# K Sized Subarray Maximum

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> max_of_subarrays(int k, vector<int> &arr) { priority_queue<pair<int, int>> pq; vector<int> result; int n = arr.size(); for (int i = 0; i < k; i++) { pq.push({arr[i], i}); } result.push_back(pq.top().first); for (int i = k; i < n; i++) { pq.push({arr[i], i}); while (pq.top().second <= i - k) { pq.pop(); } result.push_back(pq.top().first); } return result; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, Directi, Google, NPCI
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
- Synced: 2026-06-29T16:03:46.996Z

## Problem Description

Given an array arr[] of positive integers and an integer k. You have to find the maximum value for each contiguous subarray of size k. Return an array of maximum values corresponding to each contiguous subarray. Examples: Input: arr[] = [1, 2, 3, 1, 4, 5, 2, 3, 6], k = 3 Output: [3, 3, 4, 5, 5, 5, 6] Explanation: 1st contiguous subarray [1, 2, 3], max = 3 2nd contiguous subarray [2, 3, 1], max = 3 3rd contiguous subarray [3, 1, 4], max = 4 4th contiguous subarray [1, 4, 5], max = 5 5th contiguous subarray [4, 5, 2], max = 5 6th contiguous subarray [5, 2, 3], max = 5 7th contiguous subarray [2, 3, 6], max = 6 Input: arr[] = [5, 1, 3, 4, 2], k = 1 Output: [5, 1, 3, 4, 2] Explanation: When k = 1, each element in the array is its own subarray, so the output is simply the same array Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ k ≤ arr.size() 0 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> max_of_subarrays(int k, vector<int> &arr) { priority_queue<pair<int, int>> pq; vector<int> result; int n = arr.size(); for (int i = 0; i < k; i++) { pq.push({arr[i], i}); } result.push_back(pq.top().first); for (int i = k; i < n; i++) { pq.push({arr[i], i}); while (pq.top().second <= i - k) { pq.pop(); } result.push_back(pq.top().first); } return result; } };. The detected topics are Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, Directi, Google, NPCI. Review the synced source file for the implementation details.
