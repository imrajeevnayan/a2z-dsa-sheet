# Maximum Manhattan Distance After All Moves

- Platform: LeetCode
- Language: Weekly Contest 507
- Difficulty: Medium
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/contest/weekly-contest-507/problems/maximum-manhattan-distance-after-all-moves/description/
- Synced: 2026-06-23T19:04:09.888Z

## Problem Description

You are given a string moves consisting of the characters 'U', 'D', 'L', 'R', and '_'. Starting from the origin (0, 0), each character represents one move on a 2D plane: 'U': Move up by 1 unit. 'D': Move down by 1 unit. 'L': Move left by 1 unit. 'R': Move right by 1 unit. '_': Can be independently replaced with any one of 'U', 'D', 'L', or 'R'. Return the maximum Manhattan distance from the origin that can be achieved after all moves have been performed. Example 1: Input: moves = "L_D_" Output: 4 Explanation: One optimal choice is: 'L': (0, 0) -> (-1, 0) '_' treated as 'D': (-1, 0) -> (-1, -1) 'D': (-1, -1) -> (-1, -2) '_' treated as 'L': (-1, -2) -> (-2, -2) The final Manhattan distance from the origin is |0 - (-2)| + |0 - (-2)| = 4. Example 2: Input: moves = "U_R" Output: 3 Explanation: One optimal choice is: 'U': (0, 0) -> (0, 1) '_' treated as 'U': (0, 1) -> (0, 2) 'R': (0, 2) -> (1, 2) The final Manhattan distance from the origin is |0 - 1| + |0 - 2| = 3. Constraints: 1 <= moves.length <= 105 moves consists of only 'U', 'D', 'L', 'R', and '_'.

## Explanation

This solution was accepted on LeetCode using Weekly Contest 507. Review the synced source file for the implementation details.
