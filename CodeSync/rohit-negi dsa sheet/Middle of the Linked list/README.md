# Middle of the Linked list

- Platform: GeeksforGeeks
- Language: class Solution: def find_middle_brute_force(self): if not self.head: return None # Step 1: Count total nodes count = 0 current = self.head while current: count += 1 current = current.next # Step 2: Traverse to the middle mid_index = count // 2 current = self.head for _ in range(mid_index): current = current.next return current.data
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, VMWare, Zoho, Flipkart, Morgan Stanley, Amazon, Microsoft
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
- Synced: 2026-07-22T16:48:32.004Z

## Problem Description

You are given the head of a linked list, You have to return the value of the middle node of the linked list. If the number of nodes is odd, return the middle node value. If the number of nodes is even, there are two middle nodes, so return the second middle node value. Examples: Input: Output: 3 Explanation: The given linked list is 1->2->3->4->5 and its middle is 3. Input: Output: 7 Explanation: The given linked list is 2->4->6->7->5->1 so, there are two middle node 6 and 7, return the second middle node as 7. Constraints: 1 ≤ no. of nodes ≤ 105 1 ≤ node->data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def find_middle_brute_force(self): if not self.head: return None # Step 1: Count total nodes count = 0 current = self.head while current: count += 1 current = current.next # Step 2: Traverse to the middle mid_index = count // 2 current = self.head for _ in range(mid_index): current = current.next return current.data. The detected topics are Expected Complexities, Company Tags, VMWare, Zoho, Flipkart, Morgan Stanley, Amazon, Microsoft. Review the synced source file for the implementation details.
