# Minimum Product of k Elements

- Platform: GeeksforGeeks
- Language: class Solution { int minProduct(int arr[], int k) { final int MOD = (int)1e9 + 7; if (k > arr.length) { k = arr.length; } long prod = 1; Arrays.sort(arr); for(int i=0;i<k;i++){ prod = (prod * arr[i]) % MOD; } return (int)prod; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Sorting, Modular Arithmetic, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/minimum-product-of-k-integers2553/1
- Synced: 2026-08-05T11:07:12.623Z

## Problem Description

Given an array arr of positive integers, return the minimum possible product of any k elements from the array. Return the result modulo 1e9 + 7. Examples: Input: arr[] = [1, 2, 3, 4, 5], k = 2 Output: 2 Explanation: We will get the minimum product after multiplying 1 and 2 that is 2. So, the answer is 2. Input: arr[] = [9, 10, 8], k = 3 Output: 720 Explanation: We have to multiply all the numbers. Constraints: 1 ≤ k, arr.size() ≤ 105 1 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int minProduct(int arr[], int k) { final int MOD = (int)1e9 + 7; if (k > arr.length) { k = arr.length; } long prod = 1; Arrays.sort(arr); for(int i=0;i<k;i++){ prod = (prod * arr[i]) % MOD; } return (int)prod; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Sorting, Modular Arithmetic, Related Articles. Review the synced source file for the implementation details.
