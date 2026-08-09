# MEMOIZATION:

- Platform: GeeksforGeeks
- Language: class Solution { public: int zigzagSequence(vector<vector<int>>& mat) { int n = mat.size(); if (n == 0) return 0; if (n == 1) return mat[0][0]; vector<int> dp = mat[0]; for (int i = 1; i < n; ++i) { int max1 = -1, max2 = -1; int max1_col = -1; for (int j = 0; j < n; ++j) { if (dp[j] > max1) { max2 = max1; max1 = dp[j]; max1_col = j; } else if (dp[j] > max2) { max2 = dp[j]; } } vector<int> curr(n); for (int j = 0; j < n; ++j) { if (j == max1_col) { curr[j] = mat[i][j] + max2; } else { curr[j] = mat[i][j] + max1; } } dp = curr; } int ans = 0; for (int j = 0; j < n; ++j) { ans = max(ans, dp[j]); } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Directi, Company Tags, Directi, Topic Tags, Dynamic Programming, Related Articles, Largest Sum Zig Zag Sequence In A Matrix
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/largest-zigzag-sequence5416/1
- Synced: 2026-08-08T19:30:28.100Z

## Problem Description

Given a square matrix mat[][] of size n × n. A zigzag sequence starts from the top and ends at the bottom. Two consecutive elements of sequence cannot belong to the same column. Return the maximum sum of such a zigzag sequence. Examples: Input: mat[][] = [[3, 1, 2], [4, 8, 5], [6, 9, 7]] Output: 18 Explanation: One optimal zigzag sequence is: 3 -> 8 -> 7, where the sum = 3 + 8 + 7 = 18. Input: mat[][] = [[1, 2, 4], [3, 9, 6], [11, 3, 15]] Output: 28 Explanation: One optimal zigzag sequence is: 4 -> 9 -> 15, where the sum = 4 + 9 + 15 = 28. Constraints: 1 ≤ n ≤ 100 1 ≤ mat[i][j] ≤ 1000

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int zigzagSequence(vector<vector<int>>& mat) { int n = mat.size(); if (n == 0) return 0; if (n == 1) return mat[0][0]; vector<int> dp = mat[0]; for (int i = 1; i < n; ++i) { int max1 = -1, max2 = -1; int max1_col = -1; for (int j = 0; j < n; ++j) { if (dp[j] > max1) { max2 = max1; max1 = dp[j]; max1_col = j; } else if (dp[j] > max2) { max2 = dp[j]; } } vector<int> curr(n); for (int j = 0; j < n; ++j) { if (j == max1_col) { curr[j] = mat[i][j] + max2; } else { curr[j] = mat[i][j] + max1; } } dp = curr; } int ans = 0; for (int j = 0; j < n; ++j) { ans = max(ans, dp[j]); } return ans; } };. The detected topics are Expected Complexities, Company Tags Directi, Company Tags, Directi, Topic Tags, Dynamic Programming, Related Articles, Largest Sum Zig Zag Sequence In A Matrix. Review the synced source file for the implementation details.
