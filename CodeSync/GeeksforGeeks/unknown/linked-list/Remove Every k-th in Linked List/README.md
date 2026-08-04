# Remove Every k'th in Linked List

- Platform: GeeksforGeeks
- Language: class Solution { public: Node* deleteK(Node* head, int k) { if (head == NULL) return NULL; if (k == 1) return NULL; Node* curr = head; Node* prev = NULL; int count = 1; while (curr != NULL) { if (count % k == 0) { prev->next = curr->next; Node* temp = curr; curr = curr->next; delete temp; } else { prev = curr; curr = curr->next; } count++; } return head; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Related Articles, Remove Every K Th Node Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/remove-every-kth-node/1
- Synced: 2026-08-04T11:00:59.344Z

## Problem Description

Given a singly linked list head , your task is to remove every kth node from the linked list. Examples: Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8, k = 2 Output: 1 -> 3 -> 5 -> 7 Explanation: After removing every 2nd node of the linked list, the resultant linked list will be: 1 -> 3 -> 5 -> 7. Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10, k = 3 Output: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10 Explanation: After removing every 3rd node of the linked list, the resultant linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10. Constraints: 1 ≤ size of linked list ≤ 106 1 ≤ node->data ≤ 106 1 ≤ k ≤ size of linked list

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: Node* deleteK(Node* head, int k) { if (head == NULL) return NULL; if (k == 1) return NULL; Node* curr = head; Node* prev = NULL; int count = 1; while (curr != NULL) { if (count % k == 0) { prev->next = curr->next; Node* temp = curr; curr = curr->next; delete temp; } else { prev = curr; curr = curr->next; } count++; } return head; } };. The detected topics are Expected Complexities, Topic Tags, Linked List, Related Articles, Remove Every K Th Node Linked List. Review the synced source file for the implementation details.
