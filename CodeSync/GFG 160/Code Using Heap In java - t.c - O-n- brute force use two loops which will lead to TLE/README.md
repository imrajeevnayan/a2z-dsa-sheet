# Code Using Heap In java : ) t.c -> O(n) brute force : use two loops which will lead to TLE

- Platform: GeeksforGeeks
- Language: class Solution { public static int KthLargest(int arr[], int k) { PriorityQueue<Integer> minHeap = new PriorityQueue<>(); for (int i = 0; i<arr.length; i++) { minHeap.add(arr[i]); if (minHeap.size()>k) { minHeap.poll(); } } return minHeap.peek(); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Heap, STL, Related Articles, Kth Largest Element In An Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/kth-largest-element5034/1
- Synced: 2026-08-20T13:35:57.607Z

## Problem Description

Given an array arr[] and a number k. The task is to find the kth largest element in the array. Examples: Input: arr[] = [3, 5, 4, 2, 9], k = 3 Output: 4 Explanation: Third largest element in the array is 4. Input: arr[] = [4, 3, 7, 6, 5], k = 5 Output: 3 Explanation: Fifth largest element in the array is 3. Constraints: 1 <= k <= arr.size<= 106 -104 <= arr[i] <= 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static int KthLargest(int arr[], int k) { PriorityQueue<Integer> minHeap = new PriorityQueue<>(); for (int i = 0; i<arr.length; i++) { minHeap.add(arr[i]); if (minHeap.size()>k) { minHeap.poll(); } } return minHeap.peek(); } }. The detected topics are Expected Complexities, Topic Tags, Heap, STL, Related Articles, Kth Largest Element In An Array. Review the synced source file for the implementation details.
