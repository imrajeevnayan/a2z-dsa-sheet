# 75 DAYS GFG POTD ARTICLE CHALLENGE CHALLENGE(DAY 45/75)

- Platform: GeeksforGeeks
- Language: class Solution: def sortedInsert(self, head, value): # Check if the linked list is empty or the new value is smaller than the head. if not head or value < head.data: new_node = Node(value) new_node.next = head return new_node current = head # Traverse the linked list to find the appropriate position to insert the value. while current.next and current.next.data < value: current = current.next new_node = Node(value) new_node.next = current.next current.next = new_node return head
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonWiproSAP Labs, Company Tags, Amazon, Wipro, SAP Labs, Topic Tags, Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/insert-in-a-sorted-list/1
- Synced: 2026-08-19T07:17:27.003Z

## Problem Description

Given a linked list sorted in ascending order and an integer called key, insert data in the linked list such that the list remains sorted. Examples: Input: list[] = [20, 36, 47, 58, 69, 80], key = 19 Output: [19, 20, 36, 47, 58, 69, 80] Explanation: After inserting 19 the sorted linked list will look like the one in the output. Input: list[] = [50, 100], key = 75 Output: [50, 75, 100] Explanation: After inserting 75 the sorted linked list will look like the one in the output.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def sortedInsert(self, head, value): # Check if the linked list is empty or the new value is smaller than the head. if not head or value < head.data: new_node = Node(value) new_node.next = head return new_node current = head # Traverse the linked list to find the appropriate position to insert the value. while current.next and current.next.data < value: current = current.next new_node = Node(value) new_node.next = current.next current.next = new_node return head. The detected topics are Expected Complexities, Company Tags AmazonWiproSAP Labs, Company Tags, Amazon, Wipro, SAP Labs, Topic Tags, Linked List. Review the synced source file for the implementation details.
