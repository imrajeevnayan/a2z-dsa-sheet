# Count Square Submatrices with All Ones

- Platform: GeeksforGeeks
- Language: int countSquares(int N, int M, vector<vector<int>> &matrix) { // code here int sum=0; for(int i=0; i<N; i++){ for(int j=0; j<M; j++){ if(i>0 && j>0 && matrix[i][j] == 1) matrix[i][j] = min(matrix[i-1][j-1], min(matrix[i][j-1], matrix[i-1][j]))+1; sum += matrix[i][j]; } } return sum; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Dynamic Programming, Related Articles, Number Of Square Matrices With All 1s
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-square-submatrices-with-all-ones/1
- Synced: 2026-08-08T15:56:34.662Z

## Problem Description

Given an n × m binary matrix mat[][], count the total number of square submatrices whose every element is 1. Examples : Input: n = 3, m = 3, mat[][] = [[0, 1, 1], [1, 1, 1], [0, 1, 1]] Output: 9 Explanation: There are 9 square submatrices containing only 1s: 7 squares of size 1 × 1 2 squares of size 2 × 2 0 squares of size 3 × 3 Therefore, the total number of square submatrices with all 1s is 7 + 2 = 9. Input: n = 3, m = 3 mat[][] = [[1, 0, 1], [1, 1, 0], [1, 1, 0]] Output: 7 Explanation: There are 7 square submatrices containing only 1s: 6 squares of size 1 × 1 1 squares of size 2 × 2 0 squares of size 3 × 3 Therefore, the total number of square submatrices with all 1s is 6 + 1 = 7. Constraints: 1 ≤ n, m ≤ 103 0 ≤ mat[i][j] ≤ 1

## Explanation

This solution was accepted on GeeksforGeeks using int countSquares(int N, int M, vector<vector<int>> &matrix) { // code here int sum=0; for(int i=0; i<N; i++){ for(int j=0; j<M; j++){ if(i>0 && j>0 && matrix[i][j] == 1) matrix[i][j] = min(matrix[i-1][j-1], min(matrix[i][j-1], matrix[i-1][j]))+1; sum += matrix[i][j]; } } return sum; }. The detected topics are Expected Complexities, Topic Tags, Dynamic Programming, Related Articles, Number Of Square Matrices With All 1s. Review the synced source file for the implementation details.
