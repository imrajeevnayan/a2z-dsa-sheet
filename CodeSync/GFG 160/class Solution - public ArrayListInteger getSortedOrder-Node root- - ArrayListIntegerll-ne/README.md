# class Solution { public ArrayList<Integer> getSortedOrder(Node root) { ArrayList<Integer>ll=new ArrayList<>(); if(root!=null){ ll.addAll(getSortedOrder(root.left)); ll.add(root.data); ll.addAll(getSortedOrder(root.right)); } Collections.sort(ll); return ll; }}

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Binary Search Tree, Related Articles, Traverse Bst In Sorted Order
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sorted-elements-of-bst/1
- Synced: 2026-07-30T11:08:31.646Z

## Problem Description

You are given the root node of a Binary Search Tree (BST), Return the elements of the tree in sorted order. Examples : Input: root = [10, 5, 18, N, N, 12] Output: [5, 10, 12, 18] Explanation: The Sorted order of BST is 5, 10, 12, 18. Input: root = [22, 12, 30, 8, 20] Output: [8, 12, 20, 22, 30] Explanation: The Sorted order of BST is 8, 12, 20, 22, 30. Constraints: 1 ≤ number of nodes ≤ 105 1 ≤ node->data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, Binary Search Tree, Related Articles, Traverse Bst In Sorted Order. Review the synced source file for the implementation details.
