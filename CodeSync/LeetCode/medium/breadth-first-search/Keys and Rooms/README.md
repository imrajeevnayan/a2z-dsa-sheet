# Keys and Rooms

- Platform: LeetCode
- Language: Master Leetcode (Copy-2hx9d5gg)
- Difficulty: Medium
- Topics: Depth-First Search, Breadth-First Search, Graph Theory
- Runtime: 0 ms
- Memory: 46.26 MB
- Problem URL: https://leetcode.com/problems/keys-and-rooms/submissions/2101890000/?envType=problem-list-v2&envId=daeijq25
- Synced: 2026-08-10T17:28:28.880Z

## Problem Description

There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key. When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms. Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise. Example 1: Input: rooms = [[1],[2],[3],[]] Output: true Explanation: We visit room 0 and pick up key 1. We then visit room 1 and pick up key 2. We then visit room 2 and pick up key 3. We then visit room 3. Since we were able to visit every room, we return true. Example 2: Input: rooms = [[1,3],[3,0,1],[2],[0]] Output: false Explanation: We can not enter room number 2 since the only key that unlocks it is in that room. Constraints: n == rooms.length 2 <= n <= 1000 0 <= rooms[i].length <= 1000 1 <= sum(rooms[i].length) <= 3000 0 <= rooms[i][j] < n All the values of rooms[i] are unique.

## Explanation

This solution was accepted on LeetCode using Master Leetcode (Copy-2hx9d5gg). The detected topics are Depth-First Search, Breadth-First Search, Graph Theory. Review the synced source file for the implementation details.
