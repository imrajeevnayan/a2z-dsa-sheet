# For Python3 Platform

- Platform: GeeksforGeeks
- Language: ''' class Node: def __init__(self, data): # data -> value stored in node self.data = data self.next = None ''' class Solution: def insertInMiddle(self, head, x): new_node = Node(x) if(head is None): return new_node temp = head length = 0 while(temp is not None): length += 1 temp = temp.next middle = length//2 if length % 2 == 0 else length//2 + 1 before = head for _ in range(middle - 1): before = before.next new_node.next = before.next before.next = new_node return head
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Related Articles, Insert Node Middle Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1
- Synced: 2026-09-04T18:13:11.559Z

## Problem Description

Given the head of a Singly Linked List and a value x. Insert the key in the middle of the linked list. Examples : Input: 1->2->4, x = 3 Output: 1->2->3->4 Explanation: Input: 10->20->40->50, x = 30 Output: 10->20->30->40->50 Explanation: Constraints: 0 ≤ number of nodes ≤ 105 0 ≤ node->data , x ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using ''' class Node: def __init__(self, data): # data -> value stored in node self.data = data self.next = None ''' class Solution: def insertInMiddle(self, head, x): new_node = Node(x) if(head is None): return new_node temp = head length = 0 while(temp is not None): length += 1 temp = temp.next middle = length//2 if length % 2 == 0 else length//2 + 1 before = head for _ in range(middle - 1): before = before.next new_node.next = before.next before.next = new_node return head. The detected topics are Expected Complexities, Topic Tags, Linked List, Related Articles, Insert Node Middle Linked List. Review the synced source file for the implementation details.
