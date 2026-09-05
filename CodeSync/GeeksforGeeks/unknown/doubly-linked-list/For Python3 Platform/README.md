# For Python3 Platform

- Platform: GeeksforGeeks
- Language: /* Structure of doubly linked list Node class Node { public int data; public Node next; public Node prev; public Node(int x) { data = x; next = null; prev = null; } };*/ class Solution { public List<List<Integer>> displayList(Node head) { // code here List<Integer> list1 = new ArrayList<>(); List<Integer> list2 = new ArrayList<>(); List< List<Integer> > list = new ArrayList<>(); Node curr = head; while(true){ if(curr.next == null){ list1.add(curr.data); break; } list1.add(curr.data); curr = curr.next; } while(curr !=head.prev ){ list2.add(curr.data); curr = curr.prev; } list.add(list1); list.add(list2); return list; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Doubly Linked List, Linked List, Related Articles, Traversal In Doubly Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/display-doubly-linked-list--154650/1
- Synced: 2026-09-05T17:25:59.960Z

## Problem Description

Given head of a doubly linked list containing n nodes, return a 2D array where: The first row contains the elements obtained by traversing the linked list in forward direction. The second row contains the elements obtained by traversing the linked list in backward direction. Examples: Input: head: 1 <-> 2 <-> 3 <-> 4 <-> 5 Output: [[1, 2, 3, 4, 5], [5, 4, 3, 2, 1]] Explanation: After traversing forward the linked list will look like 1 -> 2 -> 3 -> 4 -> 5 and from backward will 5 -> 4 -> 3 -> 2 -> 1. Input: head: 34 <-> 22 Output: [[34, 22], [22, 34]] Explanation: After traversing forward the linked list will look like 34 -> 22 and from backward will 22 -> 34. Constraints: 1 ≤ n ≤ 105 0 ≤ data of nodes ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using /* Structure of doubly linked list Node class Node { public int data; public Node next; public Node prev; public Node(int x) { data = x; next = null; prev = null; } };*/ class Solution { public List<List<Integer>> displayList(Node head) { // code here List<Integer> list1 = new ArrayList<>(); List<Integer> list2 = new ArrayList<>(); List< List<Integer> > list = new ArrayList<>(); Node curr = head; while(true){ if(curr.next == null){ list1.add(curr.data); break; } list1.add(curr.data); curr = curr.next; } while(curr !=head.prev ){ list2.add(curr.data); curr = curr.prev; } list.add(list1); list.add(list2); return list; } }. The detected topics are Expected Complexities, Topic Tags, Doubly Linked List, Linked List, Related Articles, Traversal In Doubly Linked List. Review the synced source file for the implementation details.
