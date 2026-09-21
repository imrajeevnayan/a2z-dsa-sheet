# Easy C++ solution with O(n) time and O(n) space

- Platform: GeeksforGeeks
- Language: class Solution { public: int countPairs(vector<int> &arr, int target) { // Code here unordered_map<int, int> myMap; int count = 0; for(int i=0; i<arr.size(); i++){ int reqd = target - arr[i]; if(myMap.find(reqd) != myMap.end()){ count+=myMap[reqd]; } myMap[arr[i]]++; } return count; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Hash, two-pointer-algorithm, Related Articles, Count Pairs With Given Sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum--150253/1
- Synced: 2026-09-20T17:43:20.117Z

## Problem Description

You are given an array arr[] and an integer target. You have to count all pairs in the array such that their sum is equal to the given target. Examples: Input: arr[] = [1, 5, 7, -1, 5], target = 6 Output: 3 Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). Input: arr[] = [1, 1, 1, 1], target = 2 Output: 6 Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1). Input: arr[] = [10, 12, 10, 15, -1], target = 125 Output: 0 Explanation: There is no pair with sum = target

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int countPairs(vector<int> &arr, int target) { // Code here unordered_map<int, int> myMap; int count = 0; for(int i=0; i<arr.size(); i++){ int reqd = target - arr[i]; if(myMap.find(reqd) != myMap.end()){ count+=myMap[reqd]; } myMap[arr[i]]++; } return count; } };. The detected topics are Expected Complexities, Topic Tags, Arrays, Hash, two-pointer-algorithm, Related Articles, Count Pairs With Given Sum. Review the synced source file for the implementation details.
