# Celebrity Problem

- Platform: GeeksforGeeks
- Language: class Solution { public int celebrity(int mat[][]) { int n = mat.length; int candidates = 0; int row = -1; for(int i=0; i<n; i++) { for(int j = 0; j<n; j++) { if(mat[i][j] == 1 && i!=j) break; if(j==n-1) { candidates++; row = i; } } if(candidates > 1) return -1; } if(candidates == 0) return -1; for(int j=0; j<n; j++) { if(mat[j][row] == 0) return -1; } return row; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Zoho, Flipkart, Amazon, Microsoft, Google, Fab.com
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/the-celebrity-problem/1
- Synced: 2026-09-15T04:54:24.478Z

## Problem Description

Consider a party being organized by some people. A celebrity is a person who is known to all but does not know anyone at the party. A square matrix mat[][] of size n * n is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return index of the celebrity in the party. If the celebrity does not exist, return -1. Note: Follow 0-based indexing. Examples: Input: mat[][] = [[1, 1, 0], [0, 1, 0], [0, 1, 1]] Output: 1 Explanation: 0th and 2nd person both know 1st person and 1st person does not know anyone. Therefore, 1 is the celebrity person. Input: mat[][] = [[1, 1], [1, 1]] Output: -1 Explanation: Since both the people at the party know each other. Hence none of them is a celebrity person. Input: mat[][] = [[1]] Output: 0

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int celebrity(int mat[][]) { int n = mat.length; int candidates = 0; int row = -1; for(int i=0; i<n; i++) { for(int j = 0; j<n; j++) { if(mat[i][j] == 1 && i!=j) break; if(j==n-1) { candidates++; row = i; } } if(candidates > 1) return -1; } if(candidates == 0) return -1; for(int j=0; j<n; j++) { if(mat[j][row] == 0) return -1; } return row; } }. The detected topics are Expected Complexities, Company Tags, Zoho, Flipkart, Amazon, Microsoft, Google, Fab.com. Review the synced source file for the implementation details.
