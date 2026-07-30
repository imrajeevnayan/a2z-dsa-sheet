# Hey Guys New Approach In Market

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> preOrder(Node* root) { // code here stack<Node *> s; Node *top; vector<int> ans; bool shouldPush = 1; s.push(root); while(!s.empty()) { top = s.top(); if(shouldPush) ans.push_back(top->data); if(top->left) { s.push(top->left); top->left = NULL; shouldPush = 1; continue; } if(top->right) { s.push(top->right); top->right = NULL; shouldPush = 1; continue; } shouldPush=0; s.pop(); } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags MicrosoftNPCI, Company Tags, Microsoft, NPCI, Topic Tags, Stack, Tree
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/1
- Synced: 2026-07-30T11:11:44.515Z

## Problem Description

Given a Binary tree. Find the preorder traversal of the tree without using recursion. Follow up: Try solving this with O(1) auxiliary space. Examples: Input: root = [1, 2, 3, 4, 5] Output: [1, 2, 4, 5, 3] Explanation: Preorder traversal (Root->Left->Right) of the tree is 1 2 4 5 3. Input: root = [8, 1, 5, N, 7, 10, 6, N, 10, 6] Output: [8, 1, 7, 10, 5, 10, 6, 6] Explanation: Preorder traversal (Root->Left->Right) of the tree is 8 1 7 10 5 10 6 6. Constraints: 1 ≤ Number of nodes ≤ 105 0 ≤ node->data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> preOrder(Node* root) { // code here stack<Node *> s; Node *top; vector<int> ans; bool shouldPush = 1; s.push(root); while(!s.empty()) { top = s.top(); if(shouldPush) ans.push_back(top->data); if(top->left) { s.push(top->left); top->left = NULL; shouldPush = 1; continue; } if(top->right) { s.push(top->right); top->right = NULL; shouldPush = 1; continue; } shouldPush=0; s.pop(); } return ans; } };. The detected topics are Expected Complexities, Company Tags MicrosoftNPCI, Company Tags, Microsoft, NPCI, Topic Tags, Stack, Tree. Review the synced source file for the implementation details.
