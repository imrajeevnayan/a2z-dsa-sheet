# Insertion Sort Linked List

- Platform: GeeksforGeeks
- Language: class Solution { public Node insertionSort(Node head) { ArrayList<Integer> lst = new ArrayList<>(); Node curr = head; while (curr != null) { lst.add(curr.val); curr = curr.next; } // Sorted the List using Collections.sort method Collections.sort(lst); //Boundary Condition:- if (lst.size() == 0) return null; Node newHead = new Node(lst.get(0)); Node dummy = newHead; for (int i = 1; i < lst.size(); i++) { dummy.next = new Node(lst.get(i)); dummy = dummy.next; } return newHead; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Google, Company Tags, Google, Topic Tags, Linked List, Related Articles, Insertion Sort For Singly Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/insertion-sort-list/1
- Synced: 2026-07-22T16:04:11.022Z

## Problem Description

Given the head of a singly linked list, sort the linked list in non-decreasing order using the Insertion Sort algorithm and return the head of the sorted list. Examples: Input: Output: 2 -> 5 -> 8 -> 9 Explanation: After sorting the given linked list, the resultant list will be: Input: Output: 10 -> 20 -> 30 -> 40 -> 50 -> 60 Explanation: After sorting the given linked list, the resultant list will be: Constraints: 1 ≤ number of nodes ≤ 103 1 ≤ node->val ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public Node insertionSort(Node head) { ArrayList<Integer> lst = new ArrayList<>(); Node curr = head; while (curr != null) { lst.add(curr.val); curr = curr.next; } // Sorted the List using Collections.sort method Collections.sort(lst); //Boundary Condition:- if (lst.size() == 0) return null; Node newHead = new Node(lst.get(0)); Node dummy = newHead; for (int i = 1; i < lst.size(); i++) { dummy.next = new Node(lst.get(i)); dummy = dummy.next; } return newHead; } }. The detected topics are Expected Complexities, Company Tags Google, Company Tags, Google, Topic Tags, Linked List, Related Articles, Insertion Sort For Singly Linked List. Review the synced source file for the implementation details.
