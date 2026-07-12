# Simple and Easy JAVA Solution ::

- Platform: GeeksforGeeks
- Language: class Solution { public Node createDLL(int arr[]) { Node head = new Node(arr[0]); Node temp = head; for(int i = 1; i < arr.length; i++) { Node newNode = new Node(arr[i]); newNode.prev = temp; temp.next = newNode; temp = temp.next; } return head; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Data Structures, doubly-linked-list, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/create-a-doubly-linked-list-from-a-given-array/1
- Synced: 2026-07-12T10:56:36.565Z

## Problem Description

Given an array arr[] of integers, the goal is to create a Doubly Linked List (DLL) where each element of the array is represented as a node. The nodes must be linked in the same sequence as the array, maintaining both forward (next) and backward (prev) connections. Return the head of the constructed doubly linked list. Examples: Input: arr[] = [1, 2, 3, 4] Output: 1 <-> 2 <-> 3 <-> 4 Explanation: Each array element becomes a node in the doubly linked list. Node 1 connects forward to 2, and node 2 connects back to 1, and so on. Input: arr[] = [10, 20] Output: 10 <-> 20 Explanation: The list has two nodes. Node 10 points to 20, and node 20 points back to 10. Constraints: 1 ≤ arr.size() ≤ 104 0 ≤ arr[i] ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public Node createDLL(int arr[]) { Node head = new Node(arr[0]); Node temp = head; for(int i = 1; i < arr.length; i++) { Node newNode = new Node(arr[i]); newNode.prev = temp; temp.next = newNode; temp = temp.next; } return head; } }. The detected topics are Expected Complexities, Topic Tags, Data Structures, doubly-linked-list, Related Articles. Review the synced source file for the implementation details.
