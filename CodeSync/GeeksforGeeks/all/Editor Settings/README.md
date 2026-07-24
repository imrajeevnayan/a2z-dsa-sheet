# Editor Settings

- Platform: GeeksforGeeks
- Language: class Solution { public: int lowerBound(vector<int>& arr, int target) { // code here int low=0; int high=arr.size()-1; int lwb = -1; while(low <= high){ int mid = low + (high-low)/2; if(arr[mid] >= target){ lwb=mid; high=mid-1; } else if(arr[mid] < target){ low=mid+1; lwb=low; } } return lwb; } };
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/implement-lower-bound/1
- Synced: 2026-07-24T08:58:33.176Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int lowerBound(vector<int>& arr, int target) { // code here int low=0; int high=arr.size()-1; int lwb = -1; while(low <= high){ int mid = low + (high-low)/2; if(arr[mid] >= target){ lwb=mid; high=mid-1; } else if(arr[mid] < target){ low=mid+1; lwb=low; } } return lwb; } };. Review the synced source file for the implementation details.
