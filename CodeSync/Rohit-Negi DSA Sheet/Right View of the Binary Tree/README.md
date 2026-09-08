# ???? Right View of the Binary Tree ????

- Platform: GeeksforGeeks
- Language: vector<int>helpchetan(Node * root) { //impt cse vector<int>ch; deque<Node*>c; if(root==NULL) return ch; c.push_back(root); while(!c.empty()) { int size=c.size(); int hold; for(int i=0;i<size;i++) { Node*cur=c.front(); c.pop_front(); hold=cur->data;//to stor all value but at last it have the rightmost value if(cur->left) { //cur->left !=null c.push_back(cur->left); } if(cur->right) { c.push_back(cur->right); } } ch.push_back(hold); } return ch; } vector<int> rightView(Node *root) { // code here return helpchetan(root); }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Accolite, Amazon, Snapdeal, MakeMyTrip, Adobe, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/right-view-of-binary-tree/1
- Synced: 2026-09-07T08:00:58.620Z

## Problem Description

Given the root of a binary Tree. Return the right view of the binary tree. The right view of a Binary Tree is the set of nodes visible when the tree is viewed from the right side. Examples : Input: root = [1, 2, 3, N, N, 4, 5] Output: [1, 3, 5] Input: root = [1, 2, 3, 4, N, N, N, N, 5] Output: [1, 3, 4, 5] Input: root = [3] Output: [3] Constraints: 1 ≤ number of nodes ≤ 105 0 ≤ node->data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using vector<int>helpchetan(Node * root) { //impt cse vector<int>ch; deque<Node*>c; if(root==NULL) return ch; c.push_back(root); while(!c.empty()) { int size=c.size(); int hold; for(int i=0;i<size;i++) { Node*cur=c.front(); c.pop_front(); hold=cur->data;//to stor all value but at last it have the rightmost value if(cur->left) { //cur->left !=null c.push_back(cur->left); } if(cur->right) { c.push_back(cur->right); } } ch.push_back(hold); } return ch; } vector<int> rightView(Node *root) { // code here return helpchetan(root); }. The detected topics are Expected Complexities, Company Tags, Accolite, Amazon, Snapdeal, MakeMyTrip, Adobe, Topic Tags. Review the synced source file for the implementation details.
