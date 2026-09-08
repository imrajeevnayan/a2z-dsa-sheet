# Solution Discussion: Reverse Level Order Traversal | C++ | Approach + Intuition ✅✅

- Platform: GeeksforGeeks
- Language: vector<int> reverseLevelOrder(Node *root) { // Initialize an empty vector to store the reverse level order traversal vector<int> ans; // Initialize a queue to perform level order traversal queue<Node*> q; q.push(root); // Enqueue the root node // Perform level order traversal while(!q.empty()){ int sz = q.size(); // Get the current size of the queue (number of nodes in the current level) for(int i = 0; i < sz; ++i){ Node* node = q.front(); q.pop(); // Dequeue the front node ans.push_back(node->data); // Push the data of the dequeued node into the vector // Enqueue the right child before the left child to maintain reverse level order if(node->right) q.push(node->right); if(node->left) q.push(node->left); } } // Reverse the vector to obtain the elements in reverse level order reverse(ans.begin(), ans.end()); // Return the vector containing the reverse level order traversal return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, FactSet, Adobe, Cisco
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-level-order-traversal/1
- Synced: 2026-09-07T09:03:58.470Z

## Problem Description

Given a binary tree, find its reverse level order traversal. i.e., the traversal begins from the last level. Examples : Input: root = [1, 3, 2] Output: [3, 2, 1] Explanation: Traversing level 1 : 3 2, Traversing level 0 : 1 Input: root = [10, 20, 30, 40, 60] Output: [40, 60, 20, 30, 10] Explanation: Traversing level 2 : 40 60, Traversing level 1 : 20 30, Traversing level 0 : 10 Input: root = [1, 2, 3] Output: [2, 3, 1] Constraints: 1 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using vector<int> reverseLevelOrder(Node *root) { // Initialize an empty vector to store the reverse level order traversal vector<int> ans; // Initialize a queue to perform level order traversal queue<Node*> q; q.push(root); // Enqueue the root node // Perform level order traversal while(!q.empty()){ int sz = q.size(); // Get the current size of the queue (number of nodes in the current level) for(int i = 0; i < sz; ++i){ Node* node = q.front(); q.pop(); // Dequeue the front node ans.push_back(node->data); // Push the data of the dequeued node into the vector // Enqueue the right child before the left child to maintain reverse level order if(node->right) q.push(node->right); if(node->left) q.push(node->left); } } // Reverse the vector to obtain the elements in reverse level order reverse(ans.begin(), ans.end()); // Return the vector containing the reverse level order traversal return ans; }. The detected topics are Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, FactSet, Adobe, Cisco. Review the synced source file for the implementation details.
