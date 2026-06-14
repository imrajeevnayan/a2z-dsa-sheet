# Smartest Approach | Optimized Code | You won't regret Babygirl!

- Platform: GeeksforGeeks
- Language: class Solution { public void setMatrixZeroes(int[][] mat) { // code here boolean firstRow = false; boolean firstCol = false; for(int i=0; i<mat.length; i++) { for(int j=0; j<mat[0].length; j++) { if(mat[i][j] == 0) { if(i == 0) firstRow = true; if(j == 0) firstCol = true; mat[0][j] = 0; mat[i][0] = 0; } } } for(int i=1; i<mat.length; i++) { for(int j=1; j<mat[0].length; j++) { if(mat[0][j] == 0 || mat[i][0] == 0) { mat[i][j] = 0; } } } if(firstRow) { for(int j=0; j<mat[0].length; j++) { mat[0][j] = 0; } } if(firstCol) { for(int i=0; i<mat.length; i++) { mat[i][0] = 0; } } } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Expedia, Amazon, Yahoo, TCS, Service Now, Google
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/set-matrix-zeroes/1
- Synced: 2026-06-14T10:43:25.082Z

## Problem Description

You are given a 2D matrix mat[][] of size n x m. The task is to modify the matrix such that if mat[i][j] is 0, all the elements in the i-th row and j-th column are set to 0. Examples: Input: Output: Explanation: mat[1][1] = 0, so all elements in row 1 and column 1 are updated to zeroes. Input: Output: Explanation: mat[0][0] and mat[0][3] are 0s, so all elements in row 0, column 0 and column 3 are updated to zeroes. Constraints: 1 ≤ n, m ≤ 500 - 231 ≤ mat[i][j] ≤ 231 - 1

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public void setMatrixZeroes(int[][] mat) { // code here boolean firstRow = false; boolean firstCol = false; for(int i=0; i<mat.length; i++) { for(int j=0; j<mat[0].length; j++) { if(mat[i][j] == 0) { if(i == 0) firstRow = true; if(j == 0) firstCol = true; mat[0][j] = 0; mat[i][0] = 0; } } } for(int i=1; i<mat.length; i++) { for(int j=1; j<mat[0].length; j++) { if(mat[0][j] == 0 || mat[i][0] == 0) { mat[i][j] = 0; } } } if(firstRow) { for(int j=0; j<mat[0].length; j++) { mat[0][j] = 0; } } if(firstCol) { for(int i=0; i<mat.length; i++) { mat[i][0] = 0; } } } }. The detected topics are Expected Complexities, Company Tags, Expedia, Amazon, Yahoo, TCS, Service Now, Google. Review the synced source file for the implementation details.
