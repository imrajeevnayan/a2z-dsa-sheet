# Problem Solved Successfully

- Platform: GeeksforGeeks
- Language: vector<int>chetan_help(Node*root) { //work vector<int>v; // what we will do we will push the first ele of each level in vector if(root==NULL) return v; deque<Node*>ch; ch.push_back(root); while(!ch.empty()) { int size=ch.size(); int j=0; for(int i=0;i<size;i++) { Node*cur=ch.front(); ch.pop_front(); if(j==0) { j=1; v.push_back(cur->data); } if(cur->left) ch.push_back(cur->left); if(cur->right) ch.push_back(cur->right); } } return v; } vector<int> leftView(Node *root) { // code here return chetan_help(root); }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1
- Synced: 2026-09-18T06:37:31.756Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using vector<int>chetan_help(Node*root) { //work vector<int>v; // what we will do we will push the first ele of each level in vector if(root==NULL) return v; deque<Node*>ch; ch.push_back(root); while(!ch.empty()) { int size=ch.size(); int j=0; for(int i=0;i<size;i++) { Node*cur=ch.front(); ch.pop_front(); if(j==0) { j=1; v.push_back(cur->data); } if(cur->left) ch.push_back(cur->left); if(cur->right) ch.push_back(cur->right); } } return v; } vector<int> leftView(Node *root) { // code here return chetan_help(root); }. Review the synced source file for the implementation details.
