# class Solution { public int minValueToBalance(List<Integer> arr) { // code here int sum1=0; int sum2=0; int n=arr.size(); for(int i=0;i<n/2;i++){ sum1=sum1+arr.get(i); } for(int i=n/2;i<n;i++){ sum2=sum2+arr.get(i); } return Math.abs(sum2-sum1); }};

- Platform: GeeksforGeeks
- Language: class Solution { public: int minValueToBalance(vector<int> &arr) { // code here int ans = 0; int mid = arr.size() / 2; for (int i = 0; i < mid; i++) { ans += arr[i] - arr[i + mid]; } return std::abs(ans); } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/balanced-array07200720/1
- Synced: 2026-08-13T18:36:39.893Z

## Problem Description

Given an array arr[] of even size, find the minimum value that needs to be added to any one element so that the array becomes balanced. An array is considered balanced when the sum of elements in the left half is equal to the sum of elements in the right half. Examples : Input: arr = [1, 5, 3, 2] Output: 1 Explanation: Sum of first 2 elements is 1 + 5 = 6, Sum of last 2 elements is 3 + 2 = 5, To make the array balanced you can add 1. Input: arr = [1, 2, 1, 2, 1, 3] Output: 2 Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4, Sum of last three elements is 2 + 1 + 3 = 6, To make the array balanced you can add 2. Constraints: 2<=arr.size()<=107 where arr.size() is even. 1<=arr[i]<=105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int minValueToBalance(vector<int> &arr) { // code here int ans = 0; int mid = arr.size() / 2; for (int i = 0; i < mid; i++) { ans += arr[i] - arr[i + mid]; } return std::abs(ans); } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles. Review the synced source file for the implementation details.
