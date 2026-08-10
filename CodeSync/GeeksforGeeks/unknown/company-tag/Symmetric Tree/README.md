# Symmetric Tree

- Platform: GeeksforGeeks
- Language: class Solution: def isSymmetric(self, root): if not root: return True def fun(node1, node2): if not node1 and not node2: return True elif (not node1 or not node2) or (node1.data!=node2.data): return False return fun(node1.left, node2.right) and fun(node1.right, node2.left) return fun(root.left, root.right)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Tree, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/symmetric-tree/1
- Synced: 2026-08-10T08:19:55.196Z

## Problem Description

Given the root of a binary tree, check whether it is symmetric, i.e., whether the tree is a mirror image of itself. Note: A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree. Examples: Input: root = [10, 5, 5, 2, N, N, 2] Output: True Explanation: As the left and right half of the above tree is mirror image, the tree is symmetric. Input: root = [8, 4, 4, N, 6, N, 6] Output: False Explanation: As the left and right half of the above tree is not the mirror image, the tree is not symmetric. Constraints: 0 ≤ number of nodes ≤ 2000 1 ≤ node->data ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def isSymmetric(self, root): if not root: return True def fun(node1, node2): if not node1 and not node2: return True elif (not node1 or not node2) or (node1.data!=node2.data): return False return fun(node1.left, node2.right) and fun(node1.right, node2.left) return fun(root.left, root.right). The detected topics are Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Tree, Related Articles. Review the synced source file for the implementation details.
