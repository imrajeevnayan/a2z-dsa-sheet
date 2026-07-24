# Implement Lower Bound

- Platform: GeeksforGeeks
- Language: class Solution { public: int lowerBound(vector<int>& arr, int target) { // code here int low=0; int high=arr.size()-1; int lwb = -1; while(low <= high){ int mid = low + (high-low)/2; if(arr[mid] >= target){ lwb=mid; high=mid-1; } else if(arr[mid] < target){ low=mid+1; lwb=low; } } return lwb; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Binary Search, Arrays, Related Articles, Implement Lower Bound
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/implement-lower-bound/1
- Synced: 2026-07-24T05:14:53.343Z

## Problem Description

Given a sorted array arr[] (following 0-based indexing) and a number target, find the lower bound of the target in this given array. The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the given number. Note: If all the elements in the given array are smaller than the target, the lower bound will be the length of the array. Examples : Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9 Output: 3 Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is greater than or equal to 9. Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 11 Output: 4 Explanation: 4 is the smallest index in arr[] where element (arr[4] = 11) is greater than or equal to 11. Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 100 Output: 7 Explanation: As no element in arr[] is greater than 100, return the length of array. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤ 106 1 ≤ target ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int lowerBound(vector<int>& arr, int target) { // code here int low=0; int high=arr.size()-1; int lwb = -1; while(low <= high){ int mid = low + (high-low)/2; if(arr[mid] >= target){ lwb=mid; high=mid-1; } else if(arr[mid] < target){ low=mid+1; lwb=low; } } return lwb; } };. The detected topics are Expected Complexities, Topic Tags, Binary Search, Arrays, Related Articles, Implement Lower Bound. Review the synced source file for the implementation details.
