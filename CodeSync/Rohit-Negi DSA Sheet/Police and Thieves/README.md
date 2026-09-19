# Police and Thieves

- Platform: GeeksforGeeks
- Language: class Solution { public: static int catchThieves(vector<char> &arr, int k) { // Code here int n=arr.size(); int p=0,t=0,cnt=0; while(p<n && t<n){ while(p<n && arr[p]!='P') p++; while(t<n && arr[t]!='T') t++; if(p<n && t<n){ if(p-t>k){ t++; } else if(t-p>k) { p++; } else { t++,p++; cnt++; } } } return cnt; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Greedy, two-pointer-algorithm, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/police-and-thieves--141631/1
- Synced: 2026-09-18T19:09:50.561Z

## Problem Description

Given an array arr[], where each element contains either a 'P' for policeman or a 'T' for thief. Find the maximum number of thieves that can be caught by the police. Keep in mind the following conditions : Each policeman can catch only one thief. A policeman cannot catch a thief who is more than k units away from him. Examples: Input: arr[] = ['P', 'T', 'T', 'P', 'T'], k = 1 Output: 2 Explanation: Maximum 2 thieves can be caught. First policeman catches first thief and second police man can catch either second or third thief. Input: arr[] = ['T', 'T', 'P', 'P', 'T', 'P'], k = 2 Output: 3 Explanation: Maximum 3 thieves can be caught. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ k ≤ 1000 arr[i] = 'P' or 'T'

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: static int catchThieves(vector<char> &arr, int k) { // Code here int n=arr.size(); int p=0,t=0,cnt=0; while(p<n && t<n){ while(p<n && arr[p]!='P') p++; while(t<n && arr[t]!='T') t++; if(p<n && t<n){ if(p-t>k){ t++; } else if(t-p>k) { p++; } else { t++,p++; cnt++; } } } return cnt; } };. The detected topics are Expected Complexities, Company Tags Microsoft, Company Tags, Microsoft, Topic Tags, Greedy, two-pointer-algorithm, Related Articles. Review the synced source file for the implementation details.
