# For Python3 Platform

- Platform: GeeksforGeeks
- Language: ''' class Node: def __init__(self, data): self.data = data self.next = None ''' class Solution: def searchKey(self, head, key): while(head is not None): if(head.data == key): return True break head = head.next else: return False
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
- Synced: 2026-06-19T08:52:52.442Z

## Problem Description

Given a linked list with the head node and a key, the task is to check if the key is present in the linked list or not. Return true if key is present, else return false. Example: Input: key = 3, Output: true Explanation: 3 is present in Linked List. Input: key = 4, Output: false Explanation: 4 is not present in Linked List. Constraint: 1 ≤ Number of nodes ≤ 105 1 ≤ node.data, key ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using ''' class Node: def __init__(self, data): self.data = data self.next = None ''' class Solution: def searchKey(self, head, key): while(head is not None): if(head.data == key): return True break head = head.next else: return False. The detected topics are Expected Complexities, Topic Tags, Linked List, Data Structures, Related Articles. Review the synced source file for the implementation details.
