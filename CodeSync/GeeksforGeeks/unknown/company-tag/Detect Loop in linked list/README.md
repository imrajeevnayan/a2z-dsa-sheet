# Detect Loop in linked list

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, VMWare, Accolite, Amazon, OYO Rooms, Samsung
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/lru-cache
- Synced: 2026-08-17T09:04:36.976Z

## Problem Description

You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null. Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null. Note that pos is not passed as a parameter. Examples: Input: pos = 2, Output: true Explanation: There exists a loop as last node is connected back to the second node. Input: pos = 0, Output: false Explanation: There exists no loop in given linked list. Input: pos = 1, Output: true Explanation: There exists a loop as last node is connected back to the first node. Constraints: 1 ≤ number of nodes ≤ 105 1 ≤ node->data ≤ 103 0 ≤ pos ≤ number of nodes

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags, Paytm, VMWare, Accolite, Amazon, OYO Rooms, Samsung. Review the synced source file for the implementation details.
