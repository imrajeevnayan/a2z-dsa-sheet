# Easy to understand soln in c++.....

- Platform: GeeksforGeeks
- Language: int firstSearch(vector<int> &arr, int k) { // code here int lo=0,hi=arr.size()-1; int ari=-1; while(lo<=hi)//binary search { int mid=lo+(hi-lo)/2; if(arr[mid]==k) { ari=mid; hi=mid-1;//keep searching left side } else if(arr[mid]<k) lo=mid+1; else hi=mid-1; } return ari; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Infosys, Oracle, Wipro, Linkedin, Qualcomm, TCS
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
- Synced: 2026-07-23T13:15:39.780Z

## Problem Description

Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. Note: If multiple occurrences are there, please return the smallest index. Examples: Input: arr[] = [1, 2, 3, 4, 5], k = 4 Output: 3 Explanation: 4 appears at index 3. Input: arr[] = [11, 22, 33, 44, 55], k = 445 Output: -1 Explanation: 445 is not present. Input: arr[] = [1, 1, 1, 1, 2], k = 1 Output: 0 Explanation: 1 appears at index 0. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 106 1 ≤ k ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using int firstSearch(vector<int> &arr, int k) { // code here int lo=0,hi=arr.size()-1; int ari=-1; while(lo<=hi)//binary search { int mid=lo+(hi-lo)/2; if(arr[mid]==k) { ari=mid; hi=mid-1;//keep searching left side } else if(arr[mid]<k) lo=mid+1; else hi=mid-1; } return ari; }. The detected topics are Expected Complexities, Company Tags, Infosys, Oracle, Wipro, Linkedin, Qualcomm, TCS. Review the synced source file for the implementation details.
