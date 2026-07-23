# C++ optimized approach

- Platform: GeeksforGeeks
- Language: class Solution { public: int firstRepeated(vector<int> &arr) { // code here unordered_map<int, int> myMap; for(int val: arr) myMap[val]++; for(int i=0; i<arr.size(); i++){ if(myMap[arr[i]] > 1) return i+1; } return -1; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonOracle, Company Tags, Amazon, Oracle, Topic Tags, Arrays, Hash
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/first-repeating-element4018/1
- Synced: 2026-07-23T12:19:27.319Z

## Problem Description

Given an array arr[], find the first repeating element index. The element should occur more than once and the index of its first occurrence should be the smallest. Note:- The position you return should be according to 1-based indexing. Examples: Input: arr[] = [1, 5, 3, 4, 3, 5, 6] Output: 2 Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3. Input: arr[] = [1, 2, 3, 4] Output: -1 Explanation: All elements appear only once so answer is -1.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int firstRepeated(vector<int> &arr) { // code here unordered_map<int, int> myMap; for(int val: arr) myMap[val]++; for(int i=0; i<arr.size(); i++){ if(myMap[arr[i]] > 1) return i+1; } return -1; } };. The detected topics are Expected Complexities, Company Tags AmazonOracle, Company Tags, Amazon, Oracle, Topic Tags, Arrays, Hash. Review the synced source file for the implementation details.
