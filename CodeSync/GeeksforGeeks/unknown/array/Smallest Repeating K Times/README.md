# Smallest Repeating K Times

- Platform: GeeksforGeeks
- Language: class Solution { public int findDuplicate(int[] arr, int k) { // code here int[] freq = new int[10001]; for ( int i : arr ) { freq[i]++; } for ( int i = 0 ; i < 10001 ; i++ ) { if ( freq[i] == k ) { return i; } } return -1; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, Data Structures, Related Articles, C++, cpp-unordered_map
- Runtime: . S
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/smallest-number-repeating-k-times3239/1
- Synced: 2026-06-29T16:34:16.298Z

## Problem Description

Given an array arr, the goal is to find out the smallest number that is repeated exactly ‘k’ times. Note: If there is no such element then return -1. Example: Input: arr[] = [2, 2, 1, 3, 1], k = 2 Output: 1 Explanation: 2 and 1 both appear exactly 2 times. Since we need to find the smallest, output is 1. Input: arr[] = [3, 5, 3, 2], k = 1 Output: 2 Explanation: 5 and 2 each appear exactly 1 time. Since we need the smallest, the output is 2. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int findDuplicate(int[] arr, int k) { // code here int[] freq = new int[10001]; for ( int i : arr ) { freq[i]++; } for ( int i = 0 ; i < 10001 ; i++ ) { if ( freq[i] == k ) { return i; } } return -1; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, Data Structures, Related Articles, C++, cpp-unordered_map. Review the synced source file for the implementation details.
