# New Approach in marker Guys Have look

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> inOrder(Node* root) { // code here stack<Node*> s; Node*top; vector<int> ans; s.push(root); while(!s.empty()) { top = s.top(); s.pop(); if(!top) continue; if(!s.empty() && top->right == s.top()) { ans.push_back(top->data); } else { s.push(top->right); s.push(top); s.push(top->left); } } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Stack, Tree, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/inorder-traversal-iterative/1
- Synced: 2026-08-10T08:29:34.080Z

## Problem Description

Given a binary tree. Find the inorder traversal of the tree without using recursion. Examples Input: Output: 4 2 5 1 3 Explanation: Inorder traversal (Left->Root->Right) of the tree is [4, 2, 5, 1, 3]. Input: Output: 1 7 10 8 6 10 5 6 Explanation: Inorder traversal (Left->Root->Right) of the tree is [1, 7, 10, 8, 6, 10, 5, 6]. Constraints: 1 ≤ Number of nodes ≤ 105 1 ≤ Node data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> inOrder(Node* root) { // code here stack<Node*> s; Node*top; vector<int> ans; s.push(root); while(!s.empty()) { top = s.top(); s.pop(); if(!top) continue; if(!s.empty() && top->right == s.top()) { ans.push_back(top->data); } else { s.push(top->right); s.push(top); s.push(top->left); } } return ans; } };. The detected topics are Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Stack, Tree, Related Articles. Review the synced source file for the implementation details.
