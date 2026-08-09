# First with K Occurrences

- Platform: GeeksforGeeks
- Language: class Solution { public: int firstElement(vector<int>& arr, int k) { // code here unordered_map<int, int> mp; for(int i=0; i<arr.size(); i++){ mp[arr[i]]++; } for(int i=0; i<arr.size(); i++){ if(mp[arr[i]] == k){ return arr[i]; } } return -1; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, First Element Occurring K Times Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/first-come-first-serve1328/1
- Synced: 2026-08-09T17:23:50.372Z

## Problem Description

Given an array arr[] representing user IDs in chronological order of their occurrences, and an integer k, find the first user whose ID occurs exactly k times in the array. If no such user exists, return -1. Examples: Input: arr[] = [1, 7, 4, 3, 4, 8, 7], k = 2 Output: 7 Explanation: Both 7 and 4 occur exactly 2 times. Since 7 appears before 4 in the array, 7 is the required answer. Input: arr[] = [4, 1, 6, 1, 6, 4], k = 1 Output: -1 Explanation: Every element occurs 2 times, so no element occurs exactly 1 time. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int firstElement(vector<int>& arr, int k) { // code here unordered_map<int, int> mp; for(int i=0; i<arr.size(); i++){ mp[arr[i]]++; } for(int i=0; i<arr.size(); i++){ if(mp[arr[i]] == k){ return arr[i]; } } return -1; } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, Related Articles, First Element Occurring K Times Array. Review the synced source file for the implementation details.
