# // Easiest Solution Ever🐱‍🐉, I'm 4 Years Old! 🌈🦄

- Platform: GeeksforGeeks
- Language: int maxIndexDiff(vector<int>& arr) { // Your code here int n = arr.size(); vector<int> leftMin(n), rightMax(n); leftMin[0] = arr[0]; for(int i = 1; i < n; i++){ leftMin[i] = min(arr[i], leftMin[i - 1]); } rightMax[n - 1] = arr[n - 1]; for(int i = n - 2; i > -1; i--){ rightMax[i] = max(arr[i], rightMax[i + 1]); } int left = 0, right = 0, ans = -1; while(left < n && right < n){ if(leftMin[left] <= rightMax[right]){ ans = max(ans, right - left); right++; //To maximize j - i, we try to push j forward (larger j means bigger range) } else left++; } return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, VMWare, Amazon, Microsoft, MakeMyTrip, Google, Snapdeal
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/maximum-index-1587115620/1
- Synced: 2026-07-11T06:47:06.533Z

## Problem Description

Given an array arr[] of positive integers, return the maximum difference between two indices j and i (i.e., j - i) such that arr[i] ≤ arr[j] and i ≤ j. Examples: Input: arr[] = [1, 10] Output: 1 Explanation: arr[0] ≤ arr[1] so (j-i) is 1-0 = 1. Input: arr[] = [5, 4, 3] Output: 0 Explanation: There is no pair that satisfies the given condition. Input: arr[] = [34, 8, 10, 3, 2, 80, 30, 33, 1] Output: 6 Explanation: In the given array arr[1] < arr[7] satisfying the required condition(arr[i] ≤ arr[j]) thus giving the maximum difference of j - i which is 6(7-1). Constraints: 1 ≤ arr.size ≤ 105 0 ≤ arr[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using int maxIndexDiff(vector<int>& arr) { // Your code here int n = arr.size(); vector<int> leftMin(n), rightMax(n); leftMin[0] = arr[0]; for(int i = 1; i < n; i++){ leftMin[i] = min(arr[i], leftMin[i - 1]); } rightMax[n - 1] = arr[n - 1]; for(int i = n - 2; i > -1; i--){ rightMax[i] = max(arr[i], rightMax[i + 1]); } int left = 0, right = 0, ans = -1; while(left < n && right < n){ if(leftMin[left] <= rightMax[right]){ ans = max(ans, right - left); right++; //To maximize j - i, we try to push j forward (larger j means bigger range) } else left++; } return ans; }. The detected topics are Expected Complexities, Company Tags, VMWare, Amazon, Microsoft, MakeMyTrip, Google, Snapdeal. Review the synced source file for the implementation details.
