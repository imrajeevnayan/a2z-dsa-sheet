# Cyclically Shift Rows and Columns

- Platform: LeetCode
- Language: Weekly Contest 519
- Difficulty: Easy
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/contest/weekly-contest-519/problems/cyclically-shift-rows-and-columns/description/
- Synced: 2026-09-13T03:14:19.977Z

## Problem Description

You are given an integer n, a 2D integer array grid of size n x n, and two integer arrays rowShift and colShift, each of length n where: rowShift[i] represents the number of positions to cyclically left shift the ith row of grid. colShift[j] represents the number of positions to cyclically upward shift the jth column of grid. First, cyclically shift each row according to rowShift, then cyclically shift each column according to colShift. Return the resulting grid after performing all the shifts. A cyclic left shift of the ith row by k positions shifts only that row. The element at column j moves to column (j - k + n) % n, while all other rows remain unchanged. A cyclic upward shift of the jth column by k positions shifts only that column. The element at row i moves to row (i - k + n) % n, while all other columns remain unchanged. Example 1: Input: n = 2, grid = [[1,2],[3,4]], rowShift = [1,0], colShift = [0,1] Output: [[2,4],[3,1]] Explanation: The grid changes as follows: Example 2: Input: n = 3, grid = [[1,2,3],[4,5,6],[7,8,9]], rowShift = [1,2,0], colShift = [2,2,1] Output: [[7,8,5],[2,3,9],[6,4,1]] Explanation: The grid changes as follows: Constraints: 1 <= n == grid.length == grid[i].length <= 10 1 <= grid[i][j] <= 100 rowShift.length == colShift.length == n 0 <= rowShift[i], colShift[i] < n

## Explanation

This solution was accepted on LeetCode using Weekly Contest 519. Review the synced source file for the implementation details.
