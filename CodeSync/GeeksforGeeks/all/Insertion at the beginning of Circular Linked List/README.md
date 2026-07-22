# Insertion at the beginning of Circular Linked List

- Platform: GeeksforGeeks
- Language: temp = tail.next tail.next = Node(key) tail.next.next = temp return tail
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/insertion-at-the-beginning-of-circular-linked-list/1
- Synced: 2026-07-22T15:32:22.822Z

## Problem Description

You are given a Circular Linked List and an integer key representing a node. Insert the given key node at the beginning of the circular linked list. Note that the function will receive the tail pointer of the Circular Linked List. Note: You don't have to print anything, just return the head of the modified list in each function. Nodes may consist of Duplicate values. Examples: Input: key = 5, Output: 5 -> 1 -> 7 -> 8 -> 10 Explanation: After inserting 5 at the beginning of the given circular linked list, it has elements as 5, 1, 7, 8, 10. Input: key = 1, Output: 1 -> 2 -> 5 -> 7 -> 8 -> 10 Explanation: After inserting 1 at the beginning of the given circular linked list, it has elements as 1, 2, 5, 7, 8, 10. Constraints: 1 ≤ number of nodes ≤ 105 0 ≤ node -> data, key ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using temp = tail.next tail.next = Node(key) tail.next.next = temp return tail. The detected topics are Expected Complexities, Topic Tags, Linked List, Related Articles. Review the synced source file for the implementation details.
