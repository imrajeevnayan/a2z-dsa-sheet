# Multiply left and right array sum

- Platform: GeeksforGeeks
- Language: // User function Template for Java class Solution { public int multiply(int[] arr) { // code here int n = arr.length; int sum1 = 0; int sum2 = 0; int mid = n / 2; for ( int i = 0 ; i < mid ; i++ ) { sum1 += arr[i]; } for ( int i = mid ; i < n ; i++ ) { sum2 += arr[i]; } return sum1*sum2; } }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/multiply-left-and-right-array-sum1555/1
- Synced: 2026-08-13T18:35:59.009Z

## Problem Description

Given an array of integers arr[], divide it into two subarrays left and right such that left contains the first half of the elements and right contains the remaining elements. If the size of the array is odd, the right subarray contains one extra element. Compute the sum of elements in both subarrays and return the product of these two sums. Examples : Input : arr = [1, 2, 3, 4] Output : 21 Explanation: Sum up an array from index 0 to 1 = 3, Sum up an array from index 2 to 3 = 7. Their multiplication is 21. Input : arr = [1, 2] Output : 2 Explanation: Their multiplication is 1*2 is equal to 2. Constraints: 1 ≤ arr.size() ≤ 1000 1 ≤ arr[i] ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for Java class Solution { public int multiply(int[] arr) { // code here int n = arr.length; int sum1 = 0; int sum2 = 0; int mid = n / 2; for ( int i = 0 ; i < mid ; i++ ) { sum1 += arr[i]; } for ( int i = mid ; i < n ; i++ ) { sum2 += arr[i]; } return sum1*sum2; } }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Arrays. Review the synced source file for the implementation details.
