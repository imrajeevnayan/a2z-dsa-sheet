# Understanding and Implementing the "Find the closest number" Solution | C++ | O(logN) Solution | Approach + Intuition ✅✅✅

- Platform: GeeksforGeeks
- Language: class Solution { public: int findClosest(int n, int k, int arr[]) { // Using lower_bound to find the position where 'k' would be inserted int lb = lower_bound(arr, arr + n, k) - arr; // If the element at the lower bound is exactly 'k', return 'k' if (arr[lb] == k) return k; // If the lower bound index is greater than 0, we need to compare with the previous element if (lb > 0) { // Compare the differences to find the closest element if (k - arr[lb - 1] < arr[lb] - k) return arr[lb - 1]; else return arr[lb]; } // If the lower bound index is 0, the only option is the first element return arr[lb]; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Binary Search, Related Articles, Find Closest Number Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-the-closest-number5513/1
- Synced: 2026-07-24T05:31:26.317Z

## Problem Description

Given a sorted array arr[] of positive integers. The task is to find the closest value in the array to the given number k. The array may contain duplicate values. Note: If the difference with k is the same for two values in the array return the greater value. Examples : Input: arr[] = [1, 3, 6, 7], k = 4 Output: 3 Explanation: We have array arr={1, 3, 6, 7} and target is 4. If we look at the absolute difference of target with every element of the array we will get { |1-4|, |3-4|, |6-4|, |7-4| } = {3, 1, 2, 3}. So, the closest number is 3. Input: arr[] = [1, 2, 3, 5, 6, 8, 9], k = 4 Output: 5 Explanation: The absolute difference of 4 is 1 from both 3 and 5. According to the question, we have to return greater value, which is 5. Input: arr[] = [6, 8, 8, 8, 9, 11, 13, 13, 15, 18, 19], k = 10 Output: 11 Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ k ≤ 109 1 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int findClosest(int n, int k, int arr[]) { // Using lower_bound to find the position where 'k' would be inserted int lb = lower_bound(arr, arr + n, k) - arr; // If the element at the lower bound is exactly 'k', return 'k' if (arr[lb] == k) return k; // If the lower bound index is greater than 0, we need to compare with the previous element if (lb > 0) { // Compare the differences to find the closest element if (k - arr[lb - 1] < arr[lb] - k) return arr[lb - 1]; else return arr[lb]; } // If the lower bound index is 0, the only option is the first element return arr[lb]; } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Binary Search, Related Articles, Find Closest Number Array. Review the synced source file for the implementation details.
