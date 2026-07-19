# Count Dominant Nodes in a Binary Tree

- Platform: LeetCode
- Language: Weekly Contest 511
- Difficulty: Medium
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/contest/weekly-contest-511/problems/count-dominant-nodes-in-a-binary-tree/
- Synced: 2026-07-19T07:42:45.011Z

## Problem Description

You are given the root of a complete binary tree. A node x is called dominant if its value is equal to the maximum value among all nodes in the subtree rooted at x. Return the number of dominant nodes in the tree. Example 1: Input: root = [5,3,8,2,4,7,1] Output: 5 Explanation: The leaf nodes with values 2, 4, 7, and 1 are dominant. The node with value 8 is dominant because its value is the maximum value in its subtree [8, 7, 1]. Thus, the answer is 5. Example 2: Input: root = [1,2,3,1,2] Output: 4 Explanation: The leaf nodes with values 1, 2, and 3 are dominant. The node with value 2 whose subtree is [2, 1, 2] is dominant because its value is the maximum value in its subtree. Thus, the answer is 4. Constraints: The number of nodes in the tree is in the range [1, 105]. 1 <= Node.val <= 109 The tree is guaranteed to be a complete binary tree.

## Explanation

This solution was accepted on LeetCode using Weekly Contest 511. Review the synced source file for the implementation details.
