/*
 * Platform: LeetCode
 * Problem: Explore
 * URL: https://leetcode.com/explore/learn/card/dynamic-programming/630/an-introduction-to-dynamic-programming/4035/
 * Language: Go
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-28T09:05:45.772Z
 */

// Pseudocode example for bottom-up

F = array of length (n + 1)
F[0] = 0
F[1] = 1
for i from 2 to n:
    F[i] = F[i - 1] + F[i - 2]
