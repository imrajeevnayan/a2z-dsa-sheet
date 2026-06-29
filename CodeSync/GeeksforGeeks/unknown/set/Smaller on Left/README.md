# Smaller on Left

- Platform: GeeksforGeeks
- Language: vector<int> Smallestonleft(int arr[], int n) { vector<int> res; set<int> s; for (int i = 0; i < n; i++) { auto it = s.lower_bound(arr[i]); if (it == s.begin()) { res.push_back(-1); } else { it--; res.push_back(*it); } s.insert(arr[i]); } return res; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, set, Arrays, Hash, Map, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/smaller-on-left20360700/1
- Synced: 2026-06-29T16:00:55.457Z

## Problem Description

Given an array arr[ ] of n positive integers, the task is to find the greatest element on the left of every element in the array which is strictly smaller than itself, if this element does not exist for an index print "-1". Examples: Input: n = 5, arr[] = [2, 3, 4, 5, 1] Output: -1 2 3 4 -1 Explanation: Greatest element on the left of 3 smaller than itself is 2, for 4 it is 3 and for 5 it is 1. Since 2 is the first element and no element on its left is present, so it's greatest smaller element will be -1 and for 1 no element smaller than itself is present on its left, so it's greatest smaller element is -1. Input: n = 3, arr[] = [1, 2, 3] Output: -1 1 2 Constraints: 1 ≤ n ≤ 106 1 ≤ arr[i] ≤ 108

## Explanation

This solution was accepted on GeeksforGeeks using vector<int> Smallestonleft(int arr[], int n) { vector<int> res; set<int> s; for (int i = 0; i < n; i++) { auto it = s.lower_bound(arr[i]); if (it == s.begin()) { res.push_back(-1); } else { it--; res.push_back(*it); } s.insert(arr[i]); } return res; }. The detected topics are Expected Complexities, Topic Tags, set, Arrays, Hash, Map, Data Structures, Related Articles. Review the synced source file for the implementation details.
