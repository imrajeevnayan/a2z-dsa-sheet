# For Python3 Platform

- Platform: GeeksforGeeks
- Language: ''' class Node: def __init__(self, data): self.data = data self.next = None ''' class Solution: def isSorted(self, head): increase = decrease = True while(head.next is not None): increase = (increase and (head.data <= head.next.data)) decrease = (decrease and (head.data >= head.next.data)) head = head.next return (increase or decrease)
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/is-linked-list-sorted/1
- Synced: 2026-08-17T09:22:27.598Z

## Problem Description

Given the head of a singly linked list, find whether the given linked list is sorted or not. Note: The sorting can either be non-increasing or non-decreasing. Examples: Input: head = 1 -> 5 -> 2 -> 9 Output: false Explanation: The list is neither in non-decreasing order nor in non-increasing order. Input: head = 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40 Output: true Explanation: The nodes are arranged in non-decreasing order. Constraints: 1 ≤ no. of nodes ≤ 105 1 ≤ node->data ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using ''' class Node: def __init__(self, data): self.data = data self.next = None ''' class Solution: def isSorted(self, head): increase = decrease = True while(head.next is not None): increase = (increase and (head.data <= head.next.data)) decrease = (decrease and (head.data >= head.next.data)) head = head.next return (increase or decrease). The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Linked List. Review the synced source file for the implementation details.
