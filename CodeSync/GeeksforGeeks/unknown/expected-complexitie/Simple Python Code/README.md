# Simple Python Code:

- Platform: GeeksforGeeks
- Language: void transpose(vector<vector<int> >& matrix, int n) { // code here int arr[n][n]; for(int i=0;i<n;i++) { for(int j=0;j<n;j++) { arr[i][j]=matrix[j][i]; } } for(int i=0;i<n;i++) { for(int j=0;j<n;j++) { matrix[i][j]=arr[i][j]; } } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags MakeMyTripInfoEdgeBloombergNPCI, Company Tags, MakeMyTrip, InfoEdge, Bloomberg, NPCI, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
- Synced: 2026-09-11T17:10:53.270Z

## Problem Description

Given a square matrix of size n x n, return the transpose matrix of the given matrix. The transpose of a matrix is obtained by converting all the rows to columns and all the columns to rows. Examples: Input: mat[][] = [[1, 1, 1, 1], [2, 2, 2, 2], [3, 3, 3, 3], [4, 4, 4, 4]] Output: [[1, 2, 3, 4], [1, 2, 3, 4], 1, 2, 3, 4], [1, 2, 3, 4]] Explanation: Converting rows into columns and columns into rows. Input: mat[][] = [[1, 2], [9, -2]] Output: [[1, 9], [2, -2]] Explanation: Converting rows into columns and columns into rows. Constraints: 1 ≤ n ≤ 103 -109 ≤ mat[i][j] ≤109

## Explanation

This solution was accepted on GeeksforGeeks using void transpose(vector<vector<int> >& matrix, int n) { // code here int arr[n][n]; for(int i=0;i<n;i++) { for(int j=0;j<n;j++) { arr[i][j]=matrix[j][i]; } } for(int i=0;i<n;i++) { for(int j=0;j<n;j++) { matrix[i][j]=arr[i][j]; } } }. The detected topics are Expected Complexities, Company Tags MakeMyTripInfoEdgeBloombergNPCI, Company Tags, MakeMyTrip, InfoEdge, Bloomberg, NPCI, Topic Tags. Review the synced source file for the implementation details.
