# Count Ways with 3, 5 and 10

- Platform: GeeksforGeeks
- Language: class Geeks { public int count(int n) { int[] dp = new int[n + 1]; dp[0] = 1; int[] scores = {3, 5, 10}; for (int s : scores) { for (int i = s; i <= n; i++) { dp[i] += dp[i - s]; } } return dp[n]; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Dynamic Programming, Related Articles, Count Number Ways Reach Given Score Game
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reach-a-given-score-1587115621/1
- Synced: 2026-08-08T16:33:03.726Z

## Problem Description

Consider a game where a player can score 3 or 5 or 10 points in a move. Given a total score n, find number of distinct combinations to reach the given score. Examples: Input: n = 10 Output: 2 Explanation: There are two ways {5,5} and {10}. Input: n = 20 Output: 4 Explanation: There are four possible ways. {5,5,5,5}, {3,3,3,3,3,5}, {10,10}, {5,5,10}. Constraints: 1 ≤ n ≤ 5*105

## Explanation

This solution was accepted on GeeksforGeeks using class Geeks { public int count(int n) { int[] dp = new int[n + 1]; dp[0] = 1; int[] scores = {3, 5, 10}; for (int s : scores) { for (int i = s; i <= n; i++) { dp[i] += dp[i - s]; } } return dp[n]; } }. The detected topics are Expected Complexities, Topic Tags, Dynamic Programming, Related Articles, Count Number Ways Reach Given Score Game. Review the synced source file for the implementation details.
