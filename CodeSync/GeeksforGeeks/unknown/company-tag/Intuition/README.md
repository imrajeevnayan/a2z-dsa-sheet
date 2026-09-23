# Intuition

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> nextSmallerEle(vector<int>& arr) { // code here vector<int> nse; int n=arr.size(); vector<int> res(n,-1); for(int i=n-1; i>=0; i--) { while(nse.size() && nse.back()>=arr[i]) nse.pop_back(); if(!nse.size()) res[i]=-1; else res[i]=nse.back(); nse.push_back(arr[i]); } return res; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags FlipkartAmazon, Company Tags, Flipkart, Amazon, Topic Tags, Arrays, Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1
- Synced: 2026-09-22T18:26:40.488Z

## Problem Description

You are given an integer array arr[ ]. For every element in the array, your task is to determine its Next Smaller Element (NSE). The Next Smaller Element (NSE) of an element x is the first element that appears to the right of x in the array and is strictly smaller than x. If no such element exists, assign -1 as the NSE for that position. Examples: Input: arr[] = [4, 8, 5, 2, 25] Output: [2, 5, 2, -1, -1] Explanation: The first element smaller than 4 having index > 0 is 2. The first element smaller than 8 having index > 1 is 5. The first element smaller than 5 having index > 2 is 2. There are no elements smaller than 4 having index > 3. There are no elements smaller than 4 having index > 4. Input: arr[] = [13, 7, 6, 12] Output: [7, 6, -1, -1] Explanation: The first element smaller than 13 having index > 0 is 7. The first element smaller than 7 having index > 1 is 6. There are no elements smaller than 6 having index > 2. There are no elements smaller than 12 having index > 3. Input: arr[] = [4, 1] Output: [1, -1] Explanation: 4 will be updated to 1 and 1 will be updated to -1.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> nextSmallerEle(vector<int>& arr) { // code here vector<int> nse; int n=arr.size(); vector<int> res(n,-1); for(int i=n-1; i>=0; i--) { while(nse.size() && nse.back()>=arr[i]) nse.pop_back(); if(!nse.size()) res[i]=-1; else res[i]=nse.back(); nse.push_back(arr[i]); } return res; } };. The detected topics are Expected Complexities, Company Tags FlipkartAmazon, Company Tags, Flipkart, Amazon, Topic Tags, Arrays, Stack. Review the synced source file for the implementation details.
