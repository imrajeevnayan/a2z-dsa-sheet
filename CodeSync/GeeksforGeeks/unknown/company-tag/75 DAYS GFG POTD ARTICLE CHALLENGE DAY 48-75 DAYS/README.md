# 75 DAYS GFG POTD ARTICLE CHALLENGE DAY 48/75 DAYS

- Platform: GeeksforGeeks
- Language: from collections import deque class Solution: def height(self, node): if not node: return 0 return 1 + max(self.height(node.left), self.height(node.right)) def isBalanced(self, root): if not root: return True if abs(self.height(root.left) - self.height(root.right)) > 1: return False return self.isBalanced(root.left) and self.isBalanced(root.right)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftWalmart, Company Tags, Amazon, Microsoft, Walmart, Topic Tags, Tree
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1
- Synced: 2026-09-18T12:29:36.833Z

## Problem Description

Given the root of a binary tree, determine if it is height-balanced or not. Note: A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree. Examples: Input: root = [10, 20, 30, 40, 60] Output: true Explanation: The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced. Input: root = [1, 2, 3, 4, N, N, N, 5] Output: false Explanation: The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.

## Explanation

This solution was accepted on GeeksforGeeks using from collections import deque class Solution: def height(self, node): if not node: return 0 return 1 + max(self.height(node.left), self.height(node.right)) def isBalanced(self, root): if not root: return True if abs(self.height(root.left) - self.height(root.right)) > 1: return False return self.isBalanced(root.left) and self.isBalanced(root.right). The detected topics are Expected Complexities, Company Tags AmazonMicrosoftWalmart, Company Tags, Amazon, Microsoft, Walmart, Topic Tags, Tree. Review the synced source file for the implementation details.
