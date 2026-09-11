# Matrix Boundary Traversal

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> boundaryTraversal(vector<vector<int>>& mat) { vector<int> res; int row = mat.size(); int col = mat[0].size(); if (row == 1) { for (int j = 0; j < col; j++) res.push_back(mat[0][j]); return res; } if (col == 1) { for (int i = 0; i < row; i++) res.push_back(mat[i][0]); return res; } for (int j = 0; j < col; j++) res.push_back(mat[0][j]); for (int i = 1; i < row; i++) res.push_back(mat[i][col - 1]); for (int j = col - 2; j >= 0; j--) res.push_back(mat[row - 1][j]); for (int i = row - 2; i > 0; i--) res.push_back(mat[i][0]); return res; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Matrix, Related Articles, Boundary Elements Matrix
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1
- Synced: 2026-09-10T19:27:44.674Z

## Problem Description

You are given a matrix mat[][] . Return the boundary traversal on the matrix in a clockwise manner starting from the first row of the matrix. Examples: Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15,16]] Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5] Explanation: The boundary traversal is: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5] Input:mat[][] = [[12, 11, 10, 9], [8, 7, 6, 5], [4, 3, 2, 1]] Output: [12, 11, 10, 9, 5, 1, 2, 3, 4, 8] Explanation: The boundary traversal is: [12, 11, 10, 9, 5, 1, 2, 3, 4, 8] Input:mat[][] = [[12, 11], [4, 3]] Output: [12, 11, 3, 4] Explanation: The boundary traversal is: [12, 11, 3, 4] Constraints: 1 ≤ mat.size()≤ 1000 1 ≤ mat[0].size() ≤ 1000 0 ≤ mat[i][j] ≤ 1000

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> boundaryTraversal(vector<vector<int>>& mat) { vector<int> res; int row = mat.size(); int col = mat[0].size(); if (row == 1) { for (int j = 0; j < col; j++) res.push_back(mat[0][j]); return res; } if (col == 1) { for (int i = 0; i < row; i++) res.push_back(mat[i][0]); return res; } for (int j = 0; j < col; j++) res.push_back(mat[0][j]); for (int i = 1; i < row; i++) res.push_back(mat[i][col - 1]); for (int j = col - 2; j >= 0; j--) res.push_back(mat[row - 1][j]); for (int i = row - 2; i > 0; i--) res.push_back(mat[i][0]); return res; } };. The detected topics are Expected Complexities, Topic Tags, Matrix, Related Articles, Boundary Elements Matrix. Review the synced source file for the implementation details.
