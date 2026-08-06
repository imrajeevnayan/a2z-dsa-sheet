# Next Greater Element

- Platform: GeeksforGeeks
- Language: vector<int> nextLargerElement(vector<int>& arr) { // code here stack<int>store; vector<int>c; for(int i=arr.size()-1;i>=0;i--) { //check while(store.size()>0 && store.top() <=arr[i]) { store.pop(); } if(store.size()==0)//stack empty to next greater element exist { c.push_back(-1); } else{ c.push_back(store.top()); } store.push(arr[i]); } reverse(c.begin(),c.end()); return c; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, MakeMyTrip, Adobe, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
- Synced: 2026-08-05T20:31:48.650Z

## Problem Description

You are given an array arr[] of integers, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element. If there does not exist next greater of current element, then next greater element for current element is -1. Examples Input: arr[] = [1, 3, 2, 4] Output: [3, 4, 4, -1] Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1. Input: arr[] = [6, 8, 0, 1, 3] Output: [8, -1, 1, 3, -1] Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1, for 1 it is 3 and then for 3 there is no larger element on right and hence -1. Input: arr[] = [1, 2, 3, 5] Output: [2, 3, 5, -1] Explanation: For a sorted array, the next element is next greater element also except for the last element. Input: arr[] = [5, 4, 3, 1] Output: [-1, -1, -1, -1] Explanation: There is no next greater element for any of the elements in the array, so all are -1. Constraints: 1 ≤ arr.size() ≤ 106 0 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using vector<int> nextLargerElement(vector<int>& arr) { // code here stack<int>store; vector<int>c; for(int i=arr.size()-1;i>=0;i--) { //check while(store.size()>0 && store.top() <=arr[i]) { store.pop(); } if(store.size()==0)//stack empty to next greater element exist { c.push_back(-1); } else{ c.push_back(store.top()); } store.push(arr[i]); } reverse(c.begin(),c.end()); return c; }. The detected topics are Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, MakeMyTrip, Adobe, Topic Tags. Review the synced source file for the implementation details.
