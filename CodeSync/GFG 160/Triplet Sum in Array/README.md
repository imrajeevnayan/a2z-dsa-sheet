# Triplet Sum in Array

- Platform: GeeksforGeeks
- Language: class Solution { public boolean hasTripletSum(int arr[], int target) { Arrays.sort(arr); for(int i=0;i<arr.length-2;i++){ int left = i+1; int right = arr.length-1; while(left<right){ int sum = arr[i]+arr[left]+arr[right]; if(sum == target){ return true; } else if(sum<target){ left++; } else right--; } } return false; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Accolite, Amazon, Microsoft, OYO Rooms, Samsung, CarWale
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
- Synced: 2026-06-18T17:31:39.440Z

## Problem Description

Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target. Return true if such a triplet exists, otherwise, return false. Examples: Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13 Output: true Explanation: The triplet {1, 4, 8} sums up to 13. Input: arr[] = [1, 2, 4, 3, 6, 7], target = 10 Output: true Explanation: The triplets {1, 3, 6} and {1, 2, 7} both sum to 10. Input: arr[] = [40, 20, 10, 3, 6, 7], target = 24 Output: false Explanation: No triplet in the array sums to 24. Constraints: 3 ≤ arr.size() ≤ 5*103 0 ≤ arr[i], target ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public boolean hasTripletSum(int arr[], int target) { Arrays.sort(arr); for(int i=0;i<arr.length-2;i++){ int left = i+1; int right = arr.length-1; while(left<right){ int sum = arr[i]+arr[left]+arr[right]; if(sum == target){ return true; } else if(sum<target){ left++; } else right--; } } return false; } }. The detected topics are Expected Complexities, Company Tags, Accolite, Amazon, Microsoft, OYO Rooms, Samsung, CarWale. Review the synced source file for the implementation details.
