# Reverse a linked list

- Platform: GeeksforGeeks
- Language: class Node: def __init__(self, val): self.data = val self.next = None class Solution: def reverseList(self, head): # Code here temp = head prev = None while temp is not None: front = temp.next temp.next = prev prev = temp temp = front return prev
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, VMWare, Zoho, Accolite, Amazon, Microsoft
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
- Synced: 2026-07-22T16:37:22.915Z

## Problem Description

You are given the head of a singly linked list. You need to reverse the linked list and return the head of the reversed list. Examples: Input: Output: 4 -> 3 -> 2 -> 1 Explanation: After reversing the linkedList Input: Output: 8 -> 9 -> 10 -> 7 -> 2 Explanation: After reversing the linked list Input: Output: 8 Explanation: Constraints: 1 ≤ number of nodes ≤ 105 1 ≤ node->data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Node: def __init__(self, val): self.data = val self.next = None class Solution: def reverseList(self, head): # Code here temp = head prev = None while temp is not None: front = temp.next temp.next = prev prev = temp temp = front return prev. The detected topics are Expected Complexities, Company Tags, Paytm, VMWare, Zoho, Accolite, Amazon, Microsoft. Review the synced source file for the implementation details.
