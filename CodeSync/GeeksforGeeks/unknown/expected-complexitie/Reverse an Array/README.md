# Reverse an Array

- Platform: GeeksforGeeks
- Language: Time complexity - O(N) Space complexity - O(1) class Solution { public void reverseArray(int arr[]) { // code here int start = 0; int end = arr.length -1; while(start<end){ int temp = arr[start]; arr[start] = arr[end]; arr[end] = temp; start++; end--; } } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Bloomberg, Facebook, TCS, Adobe, Google, Infosys
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-an-array/1
- Synced: 2026-06-30T15:46:04.588Z

## Problem Description

You are given an array of integers arr[]. You have to reverse the given array. Note: Modify the array in place. Examples: Input: arr = [1, 4, 3, 2, 6, 5] Output: [5, 6, 2, 3, 4, 1] Explanation: The elements of the array are [1, 4, 3, 2, 6, 5]. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is [5, 6, 2, 3, 4, 1]. Input: arr = [4, 5, 2] Output: [2, 5, 4] Explanation: The elements of the array are [4, 5, 2]. The reversed array will be [2, 5, 4]. Input: arr = [1] Output: [1] Explanation: The array has only single element, hence the reversed array is same as the original. Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using Time complexity - O(N) Space complexity - O(1) class Solution { public void reverseArray(int arr[]) { // code here int start = 0; int end = arr.length -1; while(start<end){ int temp = arr[start]; arr[start] = arr[end]; arr[end] = temp; start++; end--; } } }. The detected topics are Expected Complexities, Company Tags, Bloomberg, Facebook, TCS, Adobe, Google, Infosys. Review the synced source file for the implementation details.
