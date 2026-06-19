# For Python3 Platform

- Platform: GeeksforGeeks
- Language: class Node: def __init__(self, data): self.data = data self.next = None class Solution: def insertAtEnd(self, head, x): new_node = Node(x) if(head is None): head = new_node return head temp = head while(temp.next is not None): temp = temp.next temp.next = new_node return head
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags HikeWiproTCS, Company Tags, Hike, Wipro, TCS, Topic Tags, Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1
- Synced: 2026-06-19T08:53:48.137Z

## Problem Description

You are given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the head of the modified Linked List. Examples : Input: x = 6, Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 Explanation: We can see that 6 is inserted at the end of the linkedlist. Input: x = 1, Output: 4 -> 5 -> 1 Explanation: We can see that 1 is inserted at the end of the linked list. Constraints: 0 ≤ number of nodes ≤ 105 0 ≤ node->data , x ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using class Node: def __init__(self, data): self.data = data self.next = None class Solution: def insertAtEnd(self, head, x): new_node = Node(x) if(head is None): head = new_node return head temp = head while(temp.next is not None): temp = temp.next temp.next = new_node return head. The detected topics are Expected Complexities, Company Tags HikeWiproTCS, Company Tags, Hike, Wipro, TCS, Topic Tags, Linked List. Review the synced source file for the implementation details.
