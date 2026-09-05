# 🔥🔥🔥Easiest Code 3 lines C++🔥🔥🔥

- Platform: GeeksforGeeks
- Language: bool areIdentical(struct Node *head1, struct Node *head2) { if(!head1 && !head2)return true; if(!head1 || !head2)return false; return head1->data==head2->data && areIdentical(head1->next,head2->next); }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Related Articles, Identical Linked Lists
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/identical-linked-lists/1
- Synced: 2026-09-05T13:18:36.426Z

## Problem Description

Given the heads of two singly linked lists, head1 and head2, the task is to determine whether the two linked lists are identical. Two linked lists are considered identical if they have the same number of nodes and each corresponding node contains the same data in the same order. Return true if both lists are identical; otherwise, return false. Examples: Input: head1: 1->2->3->4->5->6, head2: 99->59->42->20 Output: false Explanation: As shown in figure the two lists are not identical. Input: head1: 1->2->3->4->5, head2: 1->2->3->4->5 Output: true Explanation: As shown in figure both are identical. Constraints: 1 ≤ length of lists ≤ 105 1 ≤ elements of lists ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using bool areIdentical(struct Node *head1, struct Node *head2) { if(!head1 && !head2)return true; if(!head1 || !head2)return false; return head1->data==head2->data && areIdentical(head1->next,head2->next); }. The detected topics are Expected Complexities, Topic Tags, Linked List, Related Articles, Identical Linked Lists. Review the synced source file for the implementation details.
