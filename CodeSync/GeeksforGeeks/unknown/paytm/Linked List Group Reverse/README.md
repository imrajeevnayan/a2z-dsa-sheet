# Linked List Group Reverse

- Platform: GeeksforGeeks
- Language: """ class Node: def __init__(self, data): self.data = data self.next = None """ class Solution: def reverseKGroup(self, head, k): # Code here def reverse(node): curr = node prev = None l = 0 while curr and l < k: nxt = curr.next curr.next = prev prev = curr curr = nxt l += 1 return prev, curr dummy = Node(0) back = dummy while head: prev, front = reverse(head) back.next = prev back = head head.next = front head = front return dummy.next
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, VMWare, Accolite, Amazon, Microsoft, Snapdeal
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
- Synced: 2026-07-22T17:03:14.636Z

## Problem Description

Given the head of a Singly linked list. Reverse every k node in the linked list and return the head of the modified list. Note: If the number of nodes is not a multiple of k then the left-out nodes at the end, should be considered as a group and must be reversed. Examples: Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 2 Output: 2 -> 1 -> 4 -> 3 -> 6 -> 5 Explanation: Linked List is reversed in a group of size k = 2. Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 4, Output: 4 -> 3 -> 2 -> 1 -> 6 -> 5 Explanation: Linked List is reversed in a group of size k = 4. Constraints: 1 ≤ size of linked list ≤ 105 0 ≤ node->data ≤ 106 1 ≤ k ≤ size of linked list

## Explanation

This solution was accepted on GeeksforGeeks using """ class Node: def __init__(self, data): self.data = data self.next = None """ class Solution: def reverseKGroup(self, head, k): # Code here def reverse(node): curr = node prev = None l = 0 while curr and l < k: nxt = curr.next curr.next = prev prev = curr curr = nxt l += 1 return prev, curr dummy = Node(0) back = dummy while head: prev, front = reverse(head) back.next = prev back = head head.next = front head = front return dummy.next. The detected topics are Expected Complexities, Company Tags, Paytm, VMWare, Accolite, Amazon, Microsoft, Snapdeal. Review the synced source file for the implementation details.
