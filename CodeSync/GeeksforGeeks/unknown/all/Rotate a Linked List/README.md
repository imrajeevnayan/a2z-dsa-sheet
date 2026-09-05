# Rotate a Linked List

- Platform: GeeksforGeeks
- Language: class Solution: def rotate(self, head, k): # code here if head is None or k == 0: return head # find length and tail tail, curr = None, head length = 0 while curr: length += 1 tail = curr curr = curr.next # edge case to avoid loop k = k%length if k == 0: return head # break the LL and make new connections prev, curr = None, head for _ in range(k): prev = curr curr = curr.next prev.next = None tail.next = head return curr
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AccoliteAmazonMicrosoftMakeMyTrip, Company Tags, Accolite, Amazon, Microsoft, MakeMyTrip, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
- Synced: 2026-09-05T12:07:15.622Z

## Problem Description

You are given the head of a singly linked list, you have to left rotate the linked list k times. Return the head of the modified linked list. Examples: Input: k = 4, Output: 50 -> 10 -> 20 -> 30 -> 40 Explanation: Rotate 1: 20 -> 30 -> 40 -> 50 -> 10 Rotate 2: 30 -> 40 -> 50 -> 10 -> 20 Rotate 3: 40 -> 50 -> 10 -> 20 -> 30 Rotate 4: 50 -> 10 -> 20 -> 30 -> 40 Input: k = 6, Output: 30 -> 40 -> 10 -> 20 Constraints: 1 ≤ number of nodes ≤ 105 0 ≤ k ≤ 109 0 ≤ node.data ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def rotate(self, head, k): # code here if head is None or k == 0: return head # find length and tail tail, curr = None, head length = 0 while curr: length += 1 tail = curr curr = curr.next # edge case to avoid loop k = k%length if k == 0: return head # break the LL and make new connections prev, curr = None, head for _ in range(k): prev = curr curr = curr.next prev.next = None tail.next = head return curr. The detected topics are Expected Complexities, Company Tags AccoliteAmazonMicrosoftMakeMyTrip, Company Tags, Accolite, Amazon, Microsoft, MakeMyTrip, Topic Tags. Review the synced source file for the implementation details.
