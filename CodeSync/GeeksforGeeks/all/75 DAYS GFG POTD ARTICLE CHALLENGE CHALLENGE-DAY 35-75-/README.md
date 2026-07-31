# 75 DAYS GFG POTD ARTICLE CHALLENGE CHALLENGE(DAY 35/75)

- Platform: GeeksforGeeks
- Language: from typing import List class Solution: def convertToWave(self, array_length: int, array: List[int]) -> None: # Loop through the array with a step of 2 (starting from index 1) for i in range(1, array_length, 2): # Swap the current element with the next element array[i - 1], array[i] = array[i], array[i - 1]
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, Flipkart, Amazon, Microsoft, FactSet, Goldman Sachs
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
- Synced: 2026-07-31T19:24:06.161Z

## Problem Description

Given an sorted array arr[] of integers. Sort the array into a wave-like array (In Place). In other words, arrange the elements into a sequence such that : arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ... and so on. If there are multiple solutions, find the lexicographically smallest one. Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array. Examples: Input: arr[] = [1, 2, 3, 4, 5] Output: [2, 1, 4, 3, 5] Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5. Input: arr[] = [2, 4, 7, 8, 9, 10] Output: [4, 2, 8, 7, 10, 9] Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9. Input: arr[] = [1] Output: [1] Constraints: 1 ≤ arr.size ≤ 106 0 ≤ arr[i] ≤109

## Explanation

This solution was accepted on GeeksforGeeks using from typing import List class Solution: def convertToWave(self, array_length: int, array: List[int]) -> None: # Loop through the array with a step of 2 (starting from index 1) for i in range(1, array_length, 2): # Swap the current element with the next element array[i - 1], array[i] = array[i], array[i - 1]. The detected topics are Expected Complexities, Company Tags, Paytm, Flipkart, Amazon, Microsoft, FactSet, Goldman Sachs. Review the synced source file for the implementation details.
