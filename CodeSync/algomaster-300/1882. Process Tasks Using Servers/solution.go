/*
 * Platform: LeetCode
 * Problem: 1882. Process Tasks Using Servers
 * URL: https://leetcode.com/problems/process-tasks-using-servers/description/?envType=daily-question&envId=2026-11-07
 * Language: Go
 * Difficulty: Medium
 * Topics: Array, Heap (Priority Queue)
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-11-07T03:20:09.793Z
 */

Input: servers = [3,3,2], tasks = [1,2,3,2,1,2]
Output: [2,2,0,2,1,2]
Explanation: Events in chronological order go as follows:
- At second 0, task 0 is added and processed using server 2 until second 1.
- At second 1, server 2 becomes free. Task 1 is added and processed using server 2 until second 3.
- At second 2, task 2 is added and processed using server 0 until second 5.
- At second 3, server 2 becomes free. Task 3 is added and processed using server 2 until second 5.
- At second 4, task 4 is added and processed using server 1 until second 5.
- At second 5, all servers become free. Task 5 is added and processed using server 2 until second 7.
