# For Python3 Platform

- Platform: GeeksforGeeks
- Language: ''' class Node: def __init__(self, data): self.data = data self.next = None ''' class Solution: def getKthFromLast(self, head, k): temp = head length = 0 while(temp is not None): length += 1 temp = temp.next if(length - k < 0): return -1 else: for _ in range(length-k): head = head.next return head.data
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Accolite, Amazon, OYO Rooms, Samsung
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
- Synced: 2026-09-05T06:54:15.867Z

## Problem Description

Given the head of a linked list and an integer k, return the kth node from the end of the linked list. If k is greater than the number of nodes in the list, return -1. Examples : Input: k = 2 Output: 8 Explanation: The 2nd node from end is 8. Input: k = 3 Output: 40 The 3rd node from the end is 40. Input: k = 5 Output: -1 Explanation: The given linked list is 10 -> 5 -> 100 -> 5. Since 'k' is more than the number of nodes, the output is -1. Constraints: 1 ≤ number of nodes ≤ 106 1 ≤ node->data , x ≤ 106 1 ≤ k ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using ''' class Node: def __init__(self, data): self.data = data self.next = None ''' class Solution: def getKthFromLast(self, head, k): temp = head length = 0 while(temp is not None): length += 1 temp = temp.next if(length - k < 0): return -1 else: for _ in range(length-k): head = head.next return head.data. The detected topics are Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Accolite, Amazon, OYO Rooms, Samsung. Review the synced source file for the implementation details.
