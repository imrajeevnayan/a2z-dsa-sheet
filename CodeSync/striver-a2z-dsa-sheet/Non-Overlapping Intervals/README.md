# Non-Overlapping Intervals

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Greedy, Sorting, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160
- Synced: 2026-08-23T08:25:28.300Z

## Problem Description

Given a 2D array intervals[][] of size n, where intervals[i] = [starti, endi]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping. Note: Two intervals are considered non-overlapping if the end time of one interval is less than or equal to the start time of the next interval. Examples: Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]] Output: 1 Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping. Input: intervals[][] = [[1, 3], [1, 3], [1, 3]] Output: 2 Explanation: You need to remove two [1, 3] to make the rest of the intervals non-overlapping. Input: intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]] Output: 0 Explanation: All intervals are already non-overlapping. Constraints: 1 ≤ n ≤ 105 0 ≤ starti < endi ≤ 5*104

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, Arrays, Greedy, Sorting, Related Articles. Review the synced source file for the implementation details.
