# Matrix Snake Pattern

- Platform: GeeksforGeeks
- Language: class Solution: def snakePattern(self, matrix): row_position, result = 0, [] for row in matrix: if row_position % 2: result += row[::-1] else: result += row row_position += 1 return result
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Matrix, Related Articles, Print Matrix Snake Pattern, Arrays
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
- Synced: 2026-09-10T19:29:22.497Z

## Problem Description

Given a matrix mat[][] of size n x n. Print the elements of the matrix in the snake like pattern depicted below. Examples : Input: n = 3, mat[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]] Output: [45, 48, 54, 87, 89, 21, 70, 78, 15] Explanation: Printing it in snake pattern will lead to the output as [45, 48, 54, 87, 89, 21, 70, 78, 15. Input: n = 2, mat[][] = [[1, 2], [3, 4]] Output: [1, 2, 4, 3] Explanation: Printing it in snake pattern will give output as [1, 2, 4, 3]. Constraints: 1 <= n <= 103 1 <= mat[i][j] <= 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def snakePattern(self, matrix): row_position, result = 0, [] for row in matrix: if row_position % 2: result += row[::-1] else: result += row row_position += 1 return result. The detected topics are Expected Complexities, Topic Tags, Matrix, Related Articles, Print Matrix Snake Pattern, Arrays. Review the synced source file for the implementation details.
