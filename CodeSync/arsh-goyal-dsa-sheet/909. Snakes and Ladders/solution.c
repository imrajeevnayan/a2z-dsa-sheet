/*
 * Platform: LeetCode
 * Problem: 909. Snakes and Ladders
 * URL: https://leetcode.com/problems/snakes-and-ladders/description/?envType=problem-list-v2&envId=w9vfgdm5
 * Language: C
 * Difficulty: Medium
 * Topics: Array, Breadth-First Search, Matrix
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-26T07:01:42.677Z
 */

Input: board = [[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,35,-1,-1,13,-1],[-1,-1,-1,-1,-1,-1],[-1,15,-1,-1,-1,-1]]
Output: 4
Explanation: 
In the beginning, you start at square 1 (at row 5, column 0).
You decide to move to square 2 and must take the ladder to square 15.
You then decide to move to square 17 and must take the snake to square 13.
You then decide to move to square 14 and must take the ladder to square 35.
You then decide to move to square 36, ending the game.
This is the lowest possible number of moves to reach the last square, so return 4.
