# Easiest Approach! - Java

- Platform: GeeksforGeeks
- Language: class Solution { public int subarraySum(int[] arr) { // How many subarrays include arr[i]? // how many times each element appears across all subarrays? // Number of choices for l (start): // 👉 0 → i → (i + 1) choices // Number of choices for r (end): // 👉 i → n-1 → (n - i) choices int total = 0; for(int i=0; i<arr.length; i++){ total += (arr[i] * (i+1) * (arr.length-i)); } return total; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles, Sum Of All Subarrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-subarrays2229/1
- Synced: 2026-09-15T07:26:02.181Z

## Problem Description

Given an array arr[], find the sum of all the subarrays of the given array. Note: It is guaranteed that the total sum will fit within a 32-bit integer range. Examples: Input: arr[] = [1, 2, 3] Output: 20 Explanation: All subarray sums are: [1] = 1, [2] = 2, [3] = 3, [1, 2] = 3, [2, 3] = 5, [1, 2, 3] = 6. Thus total sum is 1 + 2 + 3 + 3 + 5 + 6 = 20. Input: arr[] = [1, 3] Output: 8 Explanation: All subarray sums are: [1] = 1, [3] = 3, [1, 3] = 4. Thus total sum is 1 + 3 + 4 = 8. Constraints : 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int subarraySum(int[] arr) { // How many subarrays include arr[i]? // how many times each element appears across all subarrays? // Number of choices for l (start): // 👉 0 → i → (i + 1) choices // Number of choices for r (end): // 👉 i → n-1 → (n - i) choices int total = 0; for(int i=0; i<arr.length; i++){ total += (arr[i] * (i+1) * (arr.length-i)); } return total; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles, Sum Of All Subarrays. Review the synced source file for the implementation details.
