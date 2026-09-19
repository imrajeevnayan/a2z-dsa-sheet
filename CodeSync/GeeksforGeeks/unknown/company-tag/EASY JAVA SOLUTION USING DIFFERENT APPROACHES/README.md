# EASY JAVA SOLUTION USING DIFFERENT APPROACHES

- Platform: GeeksforGeeks
- Language: class Solution { public Node removeAllDuplicates(Node head) { if (head == null || head.next == null) { return head; } HashMap<Integer, Integer> frequencyMap = new HashMap<>(); Node current = head; while (current != null) { frequencyMap.put(current.data, frequencyMap.getOrDefault(current.data, 0) + 1); current = current.next; } Node dummy = new Node(0); Node newCurrent = dummy; current = head; while (current != null) { if (frequencyMap.get(current.data) == 1) { newCurrent.next = new Node(current.data); newCurrent = newCurrent.next; } current = current.next; } return dummy.next; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Linked List, Related Articles, Remove Occurrences Duplicates Sorted Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/remove-all-occurences-of-duplicates-in-a-linked-list/1
- Synced: 2026-09-18T19:15:46.569Z

## Problem Description

Given the head of a sorted linked list, remove all nodes that have duplicate values, retaining only nodes whose values appear exactly once. Return the head of the updated linked list. Examples: Input: head = 23 -> 28 -> 28 -> 35 -> 49 -> 49 Output: 23 35 Explanation: The duplicate numbers are 28 and 49 which are removed from the list. Input: head = 11 -> 11 -> 75 -> 75 Output: Empty list Explanation: All the nodes in the linked list have duplicates. Hence the resultant list would be empty. Constraints: 1 ≤ node->data ≤ 109 1 ≤ number of nodes ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public Node removeAllDuplicates(Node head) { if (head == null || head.next == null) { return head; } HashMap<Integer, Integer> frequencyMap = new HashMap<>(); Node current = head; while (current != null) { frequencyMap.put(current.data, frequencyMap.getOrDefault(current.data, 0) + 1); current = current.next; } Node dummy = new Node(0); Node newCurrent = dummy; current = head; while (current != null) { if (frequencyMap.get(current.data) == 1) { newCurrent.next = new Node(current.data); newCurrent = newCurrent.next; } current = current.next; } return dummy.next; } }. The detected topics are Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Linked List, Related Articles, Remove Occurrences Duplicates Sorted Linked List. Review the synced source file for the implementation details.
