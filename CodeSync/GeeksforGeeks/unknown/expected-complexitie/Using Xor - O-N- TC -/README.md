# Using Xor ^ O(N) TC ->

- Platform: GeeksforGeeks
- Language: class Solution: def getOddOccurrence(self, arr): dic = {} for value in arr: if value in dic: dic[value] += 1 else: dic[value] = 1 for value,key in dic.items(): if key%2 != 0: return value
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonSnapdeal, Company Tags, Amazon, Snapdeal, Topic Tags, Arrays, Hash
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-the-odd-occurence4820/1
- Synced: 2026-07-07T16:48:43.569Z

## Problem Description

Given an array of arr[] positive integers where all numbers occur even number of times except one number which occurs odd number of times. Return that number. Examples: Input:arr[] = [1, 2, 3, 2, 3, 1, 3] Output: 3 Explaination: 3 occurs three times. Input:arr[] = [5, 7, 2, 7, 5, 2, 5] Output: 5 Explaination: 5 occurs three times. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def getOddOccurrence(self, arr): dic = {} for value in arr: if value in dic: dic[value] += 1 else: dic[value] = 1 for value,key in dic.items(): if key%2 != 0: return value. The detected topics are Expected Complexities, Company Tags AmazonSnapdeal, Company Tags, Amazon, Snapdeal, Topic Tags, Arrays, Hash. Review the synced source file for the implementation details.
