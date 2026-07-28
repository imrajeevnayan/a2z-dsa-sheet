# Complete Binary Tree Traversal with Array Input

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<vector<int>> levelSort(vector<int>& arr) { // code here int n=arr.size(); int cnt=1; vector<vector<int>>ans; priority_queue<int>pq; for(int i=0;i<n;){ while(i<n && pq.size()<cnt){ pq.push(-1*arr[i]); i++; } vector<int>ds; while(!pq.empty()){ ds.push_back(-1*pq.top()); pq.pop(); } ans.push_back(ds); cnt=(cnt<<1); } return ans; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Sorting, Queue, Tree, priority-queue, Related Articles, Print Binary Tree Levels Sorted Order
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/print-binary-tree-levels-in-sorted-order3241/1
- Synced: 2026-07-28T08:52:52.395Z

## Problem Description

Given an integer array arr[] representing the nodes of a Complete Binary Tree in level order traversal, return the nodes at each level in sorted ascending order. For every level of the binary tree, sort the values present at that level independently and return the resulting levels as a 2D array, where the i-th row contains the sorted values of the i-th level. Examples: Input: arr[] = [7, 6, 5, 4, 3, 2, 1] Output: [[7], [5, 6], [1, 2, 3, 4]] Explanation: The complete binary tree formed from the given level order traversal is: The nodes at each level after sorting are: Level 0: [7] Level 1: [5, 6] Level 2: [1, 2, 3, 4] Input: arr[] = [7, 16, 1, 4, 13] Output: [[7], [1, 16], [4, 13]] Explanation: The complete binary tree formed from the given level order traversal is: The nodes at each level after sorting are: Level 0: [7] Level 1: [1, 16] Level 2: [4, 13]

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<vector<int>> levelSort(vector<int>& arr) { // code here int n=arr.size(); int cnt=1; vector<vector<int>>ans; priority_queue<int>pq; for(int i=0;i<n;){ while(i<n && pq.size()<cnt){ pq.push(-1*arr[i]); i++; } vector<int>ds; while(!pq.empty()){ ds.push_back(-1*pq.top()); pq.pop(); } ans.push_back(ds); cnt=(cnt<<1); } return ans; } };. The detected topics are Expected Complexities, Topic Tags, Sorting, Queue, Tree, priority-queue, Related Articles, Print Binary Tree Levels Sorted Order. Review the synced source file for the implementation details.
