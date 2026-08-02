# 🎯 Display Longest Name | GFG Problem Solved ✅

- Platform: GeeksforGeeks
- Language: class Solution: def longest(self, arr): longest = arr[0] longest_length = len(arr[0]) for i in range(1, len(arr)): if(len(arr[i]) > longest_length): longest = arr[i] longest_length = len(arr[i]) return longest
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Strings, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/display-longest-name0853/1
- Synced: 2026-08-02T11:09:36.106Z

## Problem Description

Given an array arr[] containing strings of names. Your task is to return the longest string. If there are multiple names of the longest size, return the first occurring name. Examples : Input: arr[] = ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"] Output: "GeeksforGeeks" Explanation: Name "GeeksforGeeks" has maximum length among all names. Input: arr[] = ["Apple", "Mango", "Orange", "Banana"] Output: "Orange" Explanation: Names "Orange" and "Banana" both have maximum length among all names but Orange comes first so answer will be "Orange". Constraints: 1 ≤ arr.size() ≤ 1000 1 ≤ arr[i] ≤ 1000 arr[i] has only lowercase and uppercase letters

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def longest(self, arr): longest = arr[0] longest_length = len(arr[0]) for i in range(1, len(arr)): if(len(arr[i]) > longest_length): longest = arr[i] longest_length = len(arr[i]) return longest. The detected topics are Expected Complexities, Topic Tags, Arrays, Strings, Related Articles. Review the synced source file for the implementation details.
