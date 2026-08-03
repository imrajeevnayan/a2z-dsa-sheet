# Who has the majority?

- Platform: GeeksforGeeks
- Language: class Solution: def moreFrequent(self, arr, x, y): #code here count_x = 0 count_y = 0 for i in range(len(arr)): if arr[i] == x: count_x += 1 elif arr[i] == y: count_y += 1 if count_x > count_y: return x elif count_x < count_y: return y else: return x if x < y else y
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/who-has-the-majority/1
- Synced: 2026-08-03T16:38:11.076Z

## Problem Description

Given an array arr[] and two elements x and y, return the element that occurs more frequently. If both elements have the same frequency, return the smaller one. Examples: Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5], x = 4, y = 5 Output: 4 Explanation: frequency of 4 is 4.frequency of 5 is 1.Since 4>1 so return 4 Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], x = 1, y = 7 Output: 1 Explanation: frequency of 1 is 1.frequency of 7 is 1.Since 1 < 7, return 1. Constraints: 1 ≤ arr.size() ≤ 106 0 ≤ arr[i] , x , y ≤ 108

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def moreFrequent(self, arr, x, y): #code here count_x = 0 count_y = 0 for i in range(len(arr)): if arr[i] == x: count_x += 1 elif arr[i] == y: count_y += 1 if count_x > count_y: return x elif count_x < count_y: return y else: return x if x < y else y. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Arrays. Review the synced source file for the implementation details.
