# Previous Greater Element

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> preGreaterEle(vector<int>& arr) { int n = arr.size(); vector<int>v(n, -1); stack<int>st; for(int i = 0; i < n; i++){ while(!st.empty() and arr[i] >= st.top()){ st.pop(); } if(!st.empty()){ v[i] = st.top(); } st.push(arr[i]); } return v; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Stack, Arrays, Related Articles, Previous Greater Element
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/previous-greater-element/1
- Synced: 2026-07-31T19:36:53.154Z

## Problem Description

You are given an integer array arr[]. For every element in the array, determine its Previous Greater Element (PGE). The Previous Greater Element (PGE) of an element x is the first element that appears to the left of x in the array and is strictly greater than x. Note: If no such element exists, assign -1 as the PGE for that position. Examples: Input: arr[] = [10, 4, 2, 20, 40, 12, 30] Output: [-1, 10, 4, -1, -1, 40, 40] Explanation: For 10, no elements on the left, so answer is -1. For 4, previous greater element is 10. For 2, previous greater element is 4. For 20, no element on the left greater than 20, so answer is -1. For 40, no element on the left greater than 40, so answer is -1. For 12, previous greater element is 40. For 30, previous greater element is 40. Input: arr[] = [10, 20, 30, 40] Output: [-1, -1, -1, -1] Explanation: Each element of the array has no previous greater element. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> preGreaterEle(vector<int>& arr) { int n = arr.size(); vector<int>v(n, -1); stack<int>st; for(int i = 0; i < n; i++){ while(!st.empty() and arr[i] >= st.top()){ st.pop(); } if(!st.empty()){ v[i] = st.top(); } st.push(arr[i]); } return v; } };. The detected topics are Expected Complexities, Topic Tags, Stack, Arrays, Related Articles, Previous Greater Element. Review the synced source file for the implementation details.
