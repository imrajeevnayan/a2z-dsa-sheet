# class Solution { public: bool findTriplet(vector<int>& arr) { // Your code int n = arr.size(); int left=0,mid,right; sort(arr.begin(),arr.end()); while(left<n) { mid=left+1; right=mid+1; while(right<n) { if(arr[left]+arr[mid]>arr[right]) { right++; } else if(arr[left]+arr[mid]<arr[right]) { mid++; } else { return true; } } left++; } return false; }};

- Platform: GeeksforGeeks
- Language: class Solution { public boolean findTriplet(int[] arr) { HashSet<Integer> set = new HashSet<>(); for(int x : arr) set.add(x); for(int i = 0; i < arr.length; i++){ for(int j = i+1 ; j < arr.length; j++){ if(set.contains(arr[i] + arr[j])) return true; } } return false; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Arcesium, Company Tags, Arcesium, Topic Tags, Arrays, Sorting, Related Interview Experiences
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/triplet-family/1
- Synced: 2026-08-05T11:03:22.383Z

## Problem Description

Given an array arr[] of integers, check whether there exist three elements such that the sum of two elements is equal to the third element. Example: Input: arr[] = [1, 2, 2, 3, 4] Output: true Explanation: The pair (2, 2) sums to 4. Input: arr[] = [5, 4, 3] Output: false Explanation: No triplets satisfy the condition. Input: arr[] = [0, 0, 1, 0, 0, 1] Output: true Explanation: The pair(0, 1) sums to 1. Constraints: 1 <= arr.size() <= 103 0 <= arr[i] <= 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public boolean findTriplet(int[] arr) { HashSet<Integer> set = new HashSet<>(); for(int x : arr) set.add(x); for(int i = 0; i < arr.length; i++){ for(int j = i+1 ; j < arr.length; j++){ if(set.contains(arr[i] + arr[j])) return true; } } return false; } }. The detected topics are Expected Complexities, Company Tags Arcesium, Company Tags, Arcesium, Topic Tags, Arrays, Sorting, Related Interview Experiences. Review the synced source file for the implementation details.
