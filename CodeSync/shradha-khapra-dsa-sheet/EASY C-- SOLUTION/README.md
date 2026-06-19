# EASY C++ SOLUTION

- Platform: GeeksforGeeks
- Language: class Solution { Node deleteNode(Node head, int x) { // code here if (head == null) return null; Node curr = head; Node prv = null; if (x != 1){ for(int i=1;i<x;i++){ prv = curr; curr = curr.next; } prv.next = curr.next; }else{ return head.next; } return head; } }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
- Synced: 2026-06-19T09:00:36.696Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { Node deleteNode(Node head, int x) { // code here if (head == null) return null; Node curr = head; Node prv = null; if (x != 1){ for(int i=1;i<x;i++){ prv = curr; curr = curr.next; } prv.next = curr.next; }else{ return head.next; } return head; } }. Review the synced source file for the implementation details.
