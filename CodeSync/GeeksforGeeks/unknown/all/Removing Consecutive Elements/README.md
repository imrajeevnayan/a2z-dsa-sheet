# Removing Consecutive Elements

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Stack, STL, Related Articles, Removing Consecutive Elements
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/removing-consecutive-elements/1
- Synced: 2026-08-04T16:46:47.222Z

## Problem Description

Given an array arr[] of positive elements and two special numbers x and y. Remove all consecutive same special numbers. The final array should be free from any consecutive same special elements. Note: The final array may be empty. Examples : Input: arr[] = [2, 1, 2, 2, 2, 5], x = 1, y = 2 Output: 2 1 2 5 Explanation: x = 1 and y = 2. Now, we traverse the array from left to right and remove all consecutive 1s and 2s. First, we remove 2 1 2 2 2 5. Now we are left with 2 1 2 5. Now,there is no consecutive 1 or 2. We are left with 2 1 2 5. Constraints: 1 <= arr.size() <= 105 1 <= arr[i] <= 105 1 <= x, y <= 105

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, Stack, STL, Related Articles, Removing Consecutive Elements. Review the synced source file for the implementation details.
