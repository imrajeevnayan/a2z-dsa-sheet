# Smaller and Larger in Sorted

- Platform: GeeksforGeeks
- Language: class Solution { int[] getMoreAndLess(int[] arr, int target) { int countL = 0, countG = 0; for(int i=0;i<arr.length;i++){ if(arr[i]<=target){ countL++; } if(arr[i]>=target){ countG++; } } int[] result = new int[]{countL, countG}; return result; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Related Articles, Count Smaller Equal Elements Sorted Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/smaller-and-larger4005/1
- Synced: 2026-08-03T16:48:22.178Z

## Problem Description

Given a sorted array arr[] and a value target, return an array of size 2. The first value is the number of elements less than or equal to the target, and the second value is the number of elements greater than or equal to the target. Examples: Input: arr[] = [1, 2, 8, 10, 11, 12, 19], target = 0 Output: [0, 7] Explanation: There are no elements less or equal to 0 and 7 elements greater to 0. Input: arr[] = [1, 5, 8, 12, 12, 12, 19], target = 12 Output: [6, 4] Explanation: There are 6 elements less or equal to 12 and 4 elements greater or equal to 12. Constraints: 1 ≤ arr.size ≤ 105 0 ≤ arr[i], target ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int[] getMoreAndLess(int[] arr, int target) { int countL = 0, countG = 0; for(int i=0;i<arr.length;i++){ if(arr[i]<=target){ countL++; } if(arr[i]>=target){ countG++; } } int[] result = new int[]{countL, countG}; return result; } }. The detected topics are Expected Complexities, Topic Tags, Arrays, Related Articles, Count Smaller Equal Elements Sorted Array. Review the synced source file for the implementation details.
