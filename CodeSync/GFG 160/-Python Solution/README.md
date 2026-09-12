# #Python Solution:

- Platform: GeeksforGeeks
- Language: int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) { // code here if(Grid1.length==Grid2.length){ for(int i=0;i<Grid1.length;i++){ for(int j=0;j<Grid1[0].length;j++){ if(Grid1[i][j]!=Grid2[i][j]){return 0;} } } } return 1; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Matrix, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/identical-matrices1042/1
- Synced: 2026-09-11T17:22:56.827Z

## Problem Description

Given two square matrices mat1[][] and mat2[][] of size n × n, determine whether the matrices are identical or not. Examples: Input: mat1[][] = [[1, 2], [3, 4]], mat2[][] = [[1, 2], [3, 4]] Output: true Explanation: Both the matrices are identical, so the answer is 1. Input: mat1[][] = [[1, 2], [3, 4], mat2[][] = [[1, 2], [3, 2]] Output: false Explanation: Both the matrices are not identical, So, answer is 0. Constraints: 1 ≤ n ≤ 1000 -1000 ≤ mat1[i][j], mat2[i][j] ≤ 1000

## Explanation

This solution was accepted on GeeksforGeeks using int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) { // code here if(Grid1.length==Grid2.length){ for(int i=0;i<Grid1.length;i++){ for(int j=0;j<Grid1[0].length;j++){ if(Grid1[i][j]!=Grid2[i][j]){return 0;} } } } return 1; }. The detected topics are Expected Complexities, Topic Tags, Matrix, Related Articles. Review the synced source file for the implementation details.
