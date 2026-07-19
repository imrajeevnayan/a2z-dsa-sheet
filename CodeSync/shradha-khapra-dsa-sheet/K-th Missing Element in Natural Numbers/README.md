# K-th Missing Element in Natural Numbers

- Platform: GeeksforGeeks
- Language: class Solution { public int findKthSmall(int[] arr, int k) { // code here HashSet<Integer> set = new HashSet<>(); for(int num : arr){ set.add(num); } int sequenceNum = 0; int n = 0; while(k > n){ sequenceNum++; if(!set.contains(sequenceNum)){ n++; } } return sequenceNum; } }
- Difficulty: Unknown
- Topics: Expected Complexities Related Articles, Expected Complexities, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/k-th-missing-element-in-natural-numbers/1
- Synced: 2026-07-19T05:35:21.404Z

## Problem Description

Given an array arr[] of positive integers and a positive integer k, consider the infinite sequence of unique natural numbers. Remove all elements present in arr[] from this sequence. Your task is to find the k-th smallest number in the remaining set of natural numbers. Examples: Input: arr[] = [1, 9, 5, 2], k = 6 Output: 10 Explaination: After removing [1, 2, 5, 9] from the natural numbers, the remaining sequence is: 3, 4, 6, 7, 8, 10, 11, .... and so on. The 6th number in this sequence is 10, so the answer is 10 Input: arr[] = [1, 2, 3, 4], k = 1 Output: 5 Explaination: After removing [1, 2, 3, 4] from the natural numbers, the remaining sequence is : 5, 6, 7, .... and so on. The 1st number in the sequence is 5, so the answer is 5. Constraints: 1 ≤ arr.size(), arr[i] ≤ 105 1 ≤ k ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int findKthSmall(int[] arr, int k) { // code here HashSet<Integer> set = new HashSet<>(); for(int num : arr){ set.add(num); } int sequenceNum = 0; int n = 0; while(k > n){ sequenceNum++; if(!set.contains(sequenceNum)){ n++; } } return sequenceNum; } }. The detected topics are Expected Complexities Related Articles, Expected Complexities, Related Articles. Review the synced source file for the implementation details.
