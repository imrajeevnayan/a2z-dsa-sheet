# Print all elements in sorted order from row and column wise sorted matrix

- Platform: GeeksforGeeks
- Language: class Solution: def sortedMatrix(self, N, Mat): arr = sorted(sum(Mat, [])) k = -1 return [[arr[k := k+1] for j in range(N)] for i in range(N)]
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonFactSet, Company Tags, Amazon, FactSet, Topic Tags, Matrix, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sorted-matrix2333/1
- Synced: 2026-09-10T19:55:22.572Z

## Problem Description

Given an n * n matrix mat[][], sort all the elements of the matrix in non-decreasing order and return the resulting matrix. Examples: Input: mat[][] = [[10, 20, 30, 40], [15, 25, 35, 45], [27, 29, 37, 48], [32, 33, 39, 50]] Output: [[10, 15, 20, 25], [27, 29, 30, 32], [33, 35, 37, 39], [40, 45, 48, 50]] Explanation: Sorting the matrix gives this result: Input: mat[][] = [[1, 5, 3], [2, 8, 7], [4, 6, 9]] Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] Explanation: Sorting the matrix gives this result:

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def sortedMatrix(self, N, Mat): arr = sorted(sum(Mat, [])) k = -1 return [[arr[k := k+1] for j in range(N)] for i in range(N)]. The detected topics are Expected Complexities, Company Tags AmazonFactSet, Company Tags, Amazon, FactSet, Topic Tags, Matrix, Related Articles. Review the synced source file for the implementation details.
