# Inorder Traversal

- Platform: GeeksforGeeks
- Language: public ArrayList<Integer> inOrder(Node root) { // code here if (root == null) return new ArrayList<>(); ArrayList<Integer> result = new ArrayList<>(); Deque<Node> stack = new ArrayDeque<>(); Node current = root; while (current != null || !stack.isEmpty()) { while (current != null) { stack.push(current); current = current.left; } current = stack.pop(); result.add(current.data); current = current.right; } return result; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonSnapdealAdobe, Company Tags, Amazon, Snapdeal, Adobe, Topic Tags, Tree
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/inorder-traversal/1
- Synced: 2026-08-10T08:17:53.399Z

## Problem Description

Given a root of a Binary Tree, your task is to return its Inorder Traversal. Note: An inorder traversal first visits the left child (including its entire subtree), then visits the node, and finally visits the right child (including its entire subtree). Examples: Input: root = [1, 2, 3, 4, 5] Output: [4, 2, 5, 1, 3] Explanation: The inorder traversal of the given binary tree is [4, 2, 5, 1, 3]. Input: root = [8, 1, 5, N, 7, 10, 6, N, 10, 6] Output: [1, 7, 10, 8, 6, 10, 5, 6] Explanation: The inorder traversal of the given binary tree is [1, 7, 10, 8, 6, 10, 5, 6].

## Explanation

This solution was accepted on GeeksforGeeks using public ArrayList<Integer> inOrder(Node root) { // code here if (root == null) return new ArrayList<>(); ArrayList<Integer> result = new ArrayList<>(); Deque<Node> stack = new ArrayDeque<>(); Node current = root; while (current != null || !stack.isEmpty()) { while (current != null) { stack.push(current); current = current.left; } current = stack.pop(); result.add(current.data); current = current.right; } return result; }. The detected topics are Expected Complexities, Company Tags AmazonSnapdealAdobe, Company Tags, Amazon, Snapdeal, Adobe, Topic Tags, Tree. Review the synced source file for the implementation details.
