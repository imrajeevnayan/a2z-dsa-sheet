# Understand the logic:

- Platform: GeeksforGeeks
- Language: class Solution: def sumTriangles(self, matrix, matrix_size): # Initialize variables for the upper and lower triangles sums lower_triangle_sum, upper_triangle_sum = 0, 0 # Loop through the rows and columns of the matrix for row in range(matrix_size): for col in range(matrix_size): # If the current row index is less than or equal to the current column index, # add the element to the lower triangle sum if row <= col: lower_triangle_sum += matrix[row][col] # If the current row index is greater than or equal to the current column index, # add the element to the upper triangle sum if row >= col: upper_triangle_sum += matrix[row][col] # Return the sums of the upper and lower triangles return lower_triangle_sum, upper_triangle_sum
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Matrix, Related Articles, Sum Upper Triangle Lower Triangle
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1
- Synced: 2026-09-10T19:38:29.585Z

## Problem Description

Given a square matrix mat[][] of size n*n, return an array of two elements containing two values: the sum of Upper Triangle elements and the sum of Lower Triangle elements. Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it. Examples: Input: n = 3, mat[][] = [[6, 5, 4], [1, 2, 5], [7, 9, 7]] Output: [29, 32] Explanation: Upper triangular matrix: 6 5 4 2 5 7 Sum of these elements is 6 + 5 + 4 + 2 + 5 + 7 = 29. Lower triangular matrix: 6 1 2 7 9 7 Sum of these elements is 6 + 1 + 2 + 7 + 9 + 7 = 32. Input: n = 2, mat[][] = [[1, 2], [3, 4]] Output: [7, 8] Explanation: Upper triangular matrix: 1 2 4 Sum of these elements are 1 + 2 + 4 = 7. Lower triangular matrix: 1 3 4 Sum of these elements are 1 + 3 + 4 = 8. Constraints: 1 ≤ n ≤ 500 1 ≤ mat[i][j] ≤ 1000

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def sumTriangles(self, matrix, matrix_size): # Initialize variables for the upper and lower triangles sums lower_triangle_sum, upper_triangle_sum = 0, 0 # Loop through the rows and columns of the matrix for row in range(matrix_size): for col in range(matrix_size): # If the current row index is less than or equal to the current column index, # add the element to the lower triangle sum if row <= col: lower_triangle_sum += matrix[row][col] # If the current row index is greater than or equal to the current column index, # add the element to the upper triangle sum if row >= col: upper_triangle_sum += matrix[row][col] # Return the sums of the upper and lower triangles return lower_triangle_sum, upper_triangle_sum. The detected topics are Expected Complexities, Topic Tags, Matrix, Related Articles, Sum Upper Triangle Lower Triangle. Review the synced source file for the implementation details.
