# Iterative Postorder

- Platform: GeeksforGeeks
- Language: class Solution: def postOrder(self,node): stack = [node] res = [] while stack: root = stack.pop() res.append(root.data) left = root.left right = root.right if left: stack.append(left) if right: stack.append(right) return res[::-1]
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Stack, Tree, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/postorder-traversal-iterative/1
- Synced: 2026-07-30T11:14:40.107Z

## Problem Description

Given a binary tree. Find the postorder traversal of the tree without using recursion. Return a list containing the postorder traversal of the tree, calculated without using recursion. Examples : Input: 1 / \ 2 3 / \ 4 5 Output: 4 5 2 3 1 Explanation: Postorder traversal (Left->Right->Root) of the tree is 4 5 2 3 1. Input: 8 / \ 1 5 \ / \ 7 10 6 \ / 10 6 Output: 10 7 1 6 10 6 5 8 Explanation: Postorder traversal (Left->Right->Root) of the tree is 10 7 1 6 10 6 5 8 . Expected time complexity: O(n) Expected auxiliary space: O(n) Constraints: 1 <= Number of nodes <= 105 1 <= Data of a node <= 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def postOrder(self,node): stack = [node] res = [] while stack: root = stack.pop() res.append(root.data) left = root.left right = root.right if left: stack.append(left) if right: stack.append(right) return res[::-1]. The detected topics are Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Stack, Tree, Related Articles. Review the synced source file for the implementation details.
