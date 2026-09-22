# Intersection of Two Sorted Linked Lists

- Platform: GeeksforGeeks
- Language: class Solution: def findIntersection(self, head1, head2): intersection = linkedList() while head1 and head2: if head1.data == head2.data: intersection.insert(head1.data) head1, head2 = head1.next, head2.next elif head1.data < head2.data: head1 = head1.next else: head2 = head2.next return intersection.head
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftD-E-ShawZopper, Company Tags, Amazon, Microsoft, D-E-Shaw, Zopper, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
- Synced: 2026-09-21T12:50:59.989Z

## Problem Description

Given two singly linked lists head1 and head2, where both lists are sorted in increasing order, find their intersection and create a new linked list containing all the common elements. If an element occurs multiple times in both lists, it should appear in the intersection as many times as it occurs in both lists. The original linked lists should not be modified. Examples: Input: head1 = 1 -> 2 -> 3 -> 4 -> 6, head2 = 2 -> 4 -> 6 -> 8 Output: 2 -> 4-> 6 Explanation: For the given two linked list, 2, 4 and 6 are the elements in the intersection. Input: head1 = 1 -> 2 -> 2 -> 3 -> 4, head2 = 2 -> 2 -> 2 -> 4 -> 5 Output: 2 -> 2 -> 2 -> 3 -> 4 Explanation: For the given two linked list, 2, 2 and 4 are the elements in the intersection.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def findIntersection(self, head1, head2): intersection = linkedList() while head1 and head2: if head1.data == head2.data: intersection.insert(head1.data) head1, head2 = head1.next, head2.next elif head1.data < head2.data: head1 = head1.next else: head2 = head2.next return intersection.head. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftD-E-ShawZopper, Company Tags, Amazon, Microsoft, D-E-Shaw, Zopper, Topic Tags. Review the synced source file for the implementation details.
