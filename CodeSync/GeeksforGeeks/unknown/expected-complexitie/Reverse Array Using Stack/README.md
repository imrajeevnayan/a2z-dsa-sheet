# Reverse Array Using Stack

- Platform: GeeksforGeeks
- Language: // User function Template for C++ // Complete this function #include <iostream> #include <vector> #include <stack> class Solution { public: void reverseArray(vector<int>& arr) { stack<int>s; // Your code here int n=arr.size(); for(int i=0;i<n;i++){ s.push(arr[i]); } for(int i=0;i<n;i++){ arr[i]=s.top(); s.pop(); // Reverse the array } } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Stack, STL, Related Articles, Reverse An Array Using Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-array-using-stack--143151/1
- Synced: 2026-08-04T16:38:40.127Z

## Problem Description

Given an array arr[], reverse the array elements in-place by using a stack. Examples : Input: arr[] = [1, 2, 3, 4, 5] Output: 5 4 3 2 1 Explanation: After the reverse, array will look like [5, 4, 3, 2, 1]. Input: arr[] = [1] Output: 1 Explanation: After the reverse, array will look like [1]. Constraints: 1 ≤ arr.size() ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for C++ // Complete this function #include <iostream> #include <vector> #include <stack> class Solution { public: void reverseArray(vector<int>& arr) { stack<int>s; // Your code here int n=arr.size(); for(int i=0;i<n;i++){ s.push(arr[i]); } for(int i=0;i<n;i++){ arr[i]=s.top(); s.pop(); // Reverse the array } } };. The detected topics are Expected Complexities, Topic Tags, Stack, STL, Related Articles, Reverse An Array Using Stack. Review the synced source file for the implementation details.
