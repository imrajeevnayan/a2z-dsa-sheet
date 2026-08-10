# Left View of Binary Tree

- Platform: GeeksforGeeks
- Language: vector<int>chetan_help(Node*root) { //work vector<int>v; // what we will do we will push the first ele of each level in vector if(root==NULL) return v; deque<Node*>ch; ch.push_back(root); while(!ch.empty()) { int size=ch.size(); int j=0; for(int i=0;i<size;i++) { Node*cur=ch.front(); ch.pop_front(); if(j==0) { j=1; v.push_back(cur->data); } if(cur->left) ch.push_back(cur->left); if(cur->right) ch.push_back(cur->right); } } return v; } vector<int> leftView(Node *root) { // code here return chetan_help(root); }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, Flipkart, Accolite, Amazon, OYO Rooms, Samsung
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1
- Synced: 2026-08-10T08:15:13.642Z

## Problem Description

Given the root of a binary tree. Return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side. Note: If the tree is empty, return an empty list. Examples : Input: root = [1, 2, 3, 4, 5, N, N] Output:[1, 2, 4] Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible. Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N] Output: [1, 2, 4, 5] Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible. Constraints: 0 ≤ number of nodes ≤ 105 0 ≤ node -> data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using vector<int>chetan_help(Node*root) { //work vector<int>v; // what we will do we will push the first ele of each level in vector if(root==NULL) return v; deque<Node*>ch; ch.push_back(root); while(!ch.empty()) { int size=ch.size(); int j=0; for(int i=0;i<size;i++) { Node*cur=ch.front(); ch.pop_front(); if(j==0) { j=1; v.push_back(cur->data); } if(cur->left) ch.push_back(cur->left); if(cur->right) ch.push_back(cur->right); } } return v; } vector<int> leftView(Node *root) { // code here return chetan_help(root); }. The detected topics are Expected Complexities, Company Tags, Paytm, Flipkart, Accolite, Amazon, OYO Rooms, Samsung. Review the synced source file for the implementation details.
