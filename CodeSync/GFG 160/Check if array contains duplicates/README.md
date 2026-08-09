# Check if array contains duplicates

- Platform: GeeksforGeeks
- Language: class Solution { public: bool checkDuplicates(vector<int> &arr) { // code here unordered_set<int> mySet; for(int i=0; i<arr.size(); i++){ if(mySet.find(arr[i])!= mySet.end()){ return true; } mySet.insert(arr[i]); } return false; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, Check If The Given Input Contains Duplicates
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/check-if-array-contains-duplicates/1
- Synced: 2026-08-08T19:14:13.749Z

## Problem Description

Given an integer array arr[], check if the array contains any duplicate value. Examples: Input: arr = [4, 5, 6, 4] Output: true Explaination: 4 is the duplicate value. Input: arr = [1, 2, 3, 4] Output: false Explaination: All values are distinct. Constraint: 1<=arr.size()<=105 0<=arr[i]<=104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: bool checkDuplicates(vector<int> &arr) { // code here unordered_set<int> mySet; for(int i=0; i<arr.size(); i++){ if(mySet.find(arr[i])!= mySet.end()){ return true; } mySet.insert(arr[i]); } return false; } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, Check If The Given Input Contains Duplicates. Review the synced source file for the implementation details.
