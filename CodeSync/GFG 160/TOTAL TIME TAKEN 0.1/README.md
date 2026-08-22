# TOTAL TIME TAKEN : 0.1 ????

- Platform: GeeksforGeeks
- Language: from typing import List class Solution: def isFrequencyUnique(self, n : int, arr : List[int]) -> bool: frequency = {} for num in arr: frequency[num] = frequency.get(num, 0) + 1 return len(set(frequency.values())) == len(frequency.values())
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, PayPal, Bloomberg, Adobe, Google, Amazon, Apple
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/unique-frequencies-of-not/1
- Synced: 2026-08-22T15:48:23.207Z

## Problem Description

Given an array arr[] of integers, the task is to check whether the frequency of the elements in the array is unique or not. Or in other words, there are no two distinct numbers in array with equal frequency. If all the frequency is unique then return true, else return false. Examples: Input: arr[] = [1, 1, 2, 5, 5] Output: false Explanation: The array contains 2 (1’s), 1 (2’s) and 2 (5’s), since the number of frequency of 1 and 5 are the same i.e. 2 times. Therefore, this array does not satisfy the condition. Input: arr[] = [2, 2, 5, 10, 1, 2, 10, 5, 10, 2] Output: true Explanation: Number of 1’s -> 1 Number of 2’s -> 4 Number of 5’s -> 2 Number of 10’s -> 3. Since, the number of occurrences of elements present in the array is unique, this array satisfy the condition. Input: arr[] = [1, 1, 1] Output: true Explanation: Constraints: 1 ≤ arr.size() ≤ 105 -109 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using from typing import List class Solution: def isFrequencyUnique(self, n : int, arr : List[int]) -> bool: frequency = {} for num in arr: frequency[num] = frequency.get(num, 0) + 1 return len(set(frequency.values())) == len(frequency.values()). The detected topics are Expected Complexities, Company Tags, PayPal, Bloomberg, Adobe, Google, Amazon, Apple. Review the synced source file for the implementation details.
