# C++ Solution || Easy Approach and Step by Step Explanation

- Platform: GeeksforGeeks
- Language: class Solution: def canRepresentBST(self, arr): # code here s = [(-sys.maxsize, sys.maxsize)] for i in arr: while s: pop = s.pop() if pop[0] < i < pop[1]: s.append((i, pop[1])) s.append((pop[0], i)) break return s != []
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Morgan StanleyMicrosoftAdobe, Company Tags, Morgan Stanley, Microsoft, Adobe, Topic Tags, Binary Search Tree
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/preorder-traversal-and-bst4006/1
- Synced: 2026-07-23T11:24:44.149Z

## Problem Description

Given an array arr[ ] consisting of distinct integers, check if the given array can represent preorder traversal of a BST. Examples : Input: arr[] = [2, 4, 3] Output: true Explaination: Given arr[] can represent preorder traversal of following BST: Input: arr[] = [2, 4, 1] Output: false Explaination: Given arr[] cannot represent preorder traversal of a BST. Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def canRepresentBST(self, arr): # code here s = [(-sys.maxsize, sys.maxsize)] for i in arr: while s: pop = s.pop() if pop[0] < i < pop[1]: s.append((i, pop[1])) s.append((pop[0], i)) break return s != []. The detected topics are Expected Complexities, Company Tags Morgan StanleyMicrosoftAdobe, Company Tags, Morgan Stanley, Microsoft, Adobe, Topic Tags, Binary Search Tree. Review the synced source file for the implementation details.
