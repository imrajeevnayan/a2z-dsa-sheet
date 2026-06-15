# Delete the Middle Node of a Linked List

- Platform: LeetCode
- Language: Daily Question
- Difficulty: Medium
- Topics: Linked List, Two Pointers
- Runtime: 0 ms
- Memory: N/A
- Problem URL: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=daily-question&envId=2026-06-15
- Synced: 2026-06-15T02:16:59.178Z

## Problem Description

You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list. The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x. For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively. Example 1: Input: head = [1,3,4,7,1,2,6] Output: [1,3,4,1,2,6] Explanation: The above figure represents the given linked list. The indices of the nodes are written below. Since n = 7, node 3 with value 7 is the middle node, which is marked in red. We return the new list after removing this node. Example 2: Input: head = [1,2,3,4] Output: [1,2,4] Explanation: The above figure represents the given linked list. For n = 4, node 2 with value 3 is the middle node, which is marked in red. Example 3: Input: head = [2,1] Output: [2] Explanation: The above figure represents the given linked list. For n = 2, node 1 with value 1 is the middle node, which is marked in red. Node 0 with value 2 is the only node remaining after removing node 1. Constraints: The number of nodes in the list is in the range [1, 105]. 1 <= Node.val <= 105

## Explanation

This solution was accepted on LeetCode using Daily Question. The detected topics are Linked List, Two Pointers. Review the synced source file for the implementation details.
