# Array Insert at Index

- Platform: GeeksforGeeks
- Language: import java.util.*; class Solution { public void insertAtIndex(ArrayList<Integer> arr, int index, int val) { // code here arr.add(index ,val); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles, Insert Element At A Given Position In An Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/array-insert-at-index/1
- Synced: 2026-08-03T16:23:42.134Z

## Problem Description

You are given an array arr(0-based index) and two positive integer index and val. You need to insert an val at given index. Examples: Input: arr[] = [1, 2, 3, 4, 5], index = 5, val = 90 Output: 1 2 3 4 5 90 Explanation: 90 is inserted at index 5(0-based indexing). After inserting, array elements are like [1, 2, 3, 4, 5, 90]. Input: arr[] = [1, 2, 3, 4, 5], index = 2, val = 90 Output: [1, 2, 90, 3, 4, 5] Explanation: 90 is inserted at index 2(0-based indexing). After inserting, array elements are like [1, 2, 90, 3, 4, 5]. Constraints: 1 ≤arr.size() ≤ 105 0 ≤ val, arr[i] ≤ 106 0 ≤ index ≤ arr.size()

## Explanation

This solution was accepted on GeeksforGeeks using import java.util.*; class Solution { public void insertAtIndex(ArrayList<Integer> arr, int index, int val) { // code here arr.add(index ,val); } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles, Insert Element At A Given Position In An Array. Review the synced source file for the implementation details.
