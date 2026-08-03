# Product of Array

- Platform: GeeksforGeeks
- Language: class Solution { public: long long int product(vector<int> &arr) { // code here const int MOD = 1000000007; long long ans = 1; for(int i=0; i<arr.size(); i++){ ans = (ans * arr[i]) % MOD; } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles, Program For Product Of Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/product-of-array-element/1
- Synced: 2026-08-03T16:50:18.077Z

## Problem Description

Given an array, arr[] of positive integers. Your task is to return the product of array elements under the given modulo, mod with the value of 1000000007. Note: The modulo operation finds the remainder after the division of one by another. For example, k(mod(m)) = k%m = remainder obtained when k is divided by m Examples: Input: arr[] = [1, 2, 3, 4] Output: 24 Explanation: The product of the elements in the array is 1×2×3×4=24. Since 24 is less than 1000000007, the output is simply 24. Input: arr[] = [100000, 100000, 100000] Output: 993000007 Explanation: The product of the array elements is 100000 × 100000 × 100000 = 1000000000000000. Taking modulo 1000000007, the result is 1000000000000000 % 1000000007 = 993000007 Constraints: 1<=arr.size<=105 1<=arr[i]<=105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: long long int product(vector<int> &arr) { // code here const int MOD = 1000000007; long long ans = 1; for(int i=0; i<arr.size(); i++){ ans = (ans * arr[i]) % MOD; } return ans; } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles, Program For Product Of Array. Review the synced source file for the implementation details.
