# For Python3 Platform

- Platform: GeeksforGeeks
- Language: ''' class node: def __init__(self): self.data = None self.next = None ''' class Solution: def multiply_two_lists(self, first, second): n1 = n2 = '' while(first is not None): n1 = n1 + str(first.data) first = first.next while(second is not None): n2 = n2 + str(second.data) second = second.next return (int(n1) * int(n2)) % (pow(10, 9) + 7)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Linked List, Modular Arithmetic, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1
- Synced: 2026-08-04T11:01:56.812Z

## Problem Description

Given the heads of two singly linked lists L1 and L2, where each node stores a single digit of a non-negative integer, return the product of the two numbers represented by the linked lists. Since the answer can be very large, return it modulo 10^9 + 7. Note: The digits are stored in the same order as the number (most significant digit first). Examples : Input: L1 = 3 -> 2 , L2 = 2 Output: 64 Explanation: Multiplication of 32 and 2 gives 64. Input: L1 = 1 -> 0 -> 0, L2 = 1 -> 0 Output: 1000 Explanation: Multiplication of 100 and 10 gives 1000. Constraints: 1 ≤ number of nodes ≤ 10^5 0 ≤ node->data ≤ 9

## Explanation

This solution was accepted on GeeksforGeeks using ''' class node: def __init__(self): self.data = None self.next = None ''' class Solution: def multiply_two_lists(self, first, second): n1 = n2 = '' while(first is not None): n1 = n1 + str(first.data) first = first.next while(second is not None): n2 = n2 + str(second.data) second = second.next return (int(n1) * int(n2)) % (pow(10, 9) + 7). The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Linked List, Modular Arithmetic, Related Articles. Review the synced source file for the implementation details.
