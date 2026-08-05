# Sort the Two Parts Sorted

- Platform: GeeksforGeeks
- Language: void sortHalves (int arr[], int n) { // your code here int mid = 0; for(int i=1;i<n;++i){ if(arr[i] < arr[i-1]) mid = i-1; } int i = 0, j = mid+1; int tmp[n]; for(int k=0;k<=n-1;++k){ if(i > mid){ tmp[k] = arr[j++]; continue; } if(j > n-1){ tmp[k] = arr[i++]; continue; } tmp[k] = (arr[i] < arr[j] ? arr[i++] : arr[j++]); } for(int k=0;k<=n-1;++k){ arr[k] = tmp[k]; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, two-pointer-algorithm, Sorting, Related Articles, Sort Array Two Halves Sorted
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sort-the-half-sorted2157/1
- Synced: 2026-08-05T11:25:47.115Z

## Problem Description

Given an integer array of which both the first halve and second halve are sorted. The task is to merge these two sorted halves of the array into a single sorted array. Note: The two halves can be of arbitrary sizes (i.e. if first halve of size k then the second halve is of size n-k where 0 ≤ k ≤ n) , where n is the length of array . Examples: Input: arr[] = {2 3 8 -1 7 10} Output: [-1, 2, 3, 7, 8, 10] Explanation: {2 3 8} and {-1 7 10} are sorted in the original array. The overall sorted version is {-1 2 3 7 8 10} Input: arr[] = {-4 6 9 -1 3} Output: [-4, -1, 3, 6, 9] Explanation: {-4 -1} and {3 6 9} are sorted in the original array. The overall sorted version is {-4 -1 3 6 9} Constraints: 1 ≤ arr.size() ≤ 106 -105≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using void sortHalves (int arr[], int n) { // your code here int mid = 0; for(int i=1;i<n;++i){ if(arr[i] < arr[i-1]) mid = i-1; } int i = 0, j = mid+1; int tmp[n]; for(int k=0;k<=n-1;++k){ if(i > mid){ tmp[k] = arr[j++]; continue; } if(j > n-1){ tmp[k] = arr[i++]; continue; } tmp[k] = (arr[i] < arr[j] ? arr[i++] : arr[j++]); } for(int k=0;k<=n-1;++k){ arr[k] = tmp[k]; } }. The detected topics are Expected Complexities, Topic Tags, two-pointer-algorithm, Sorting, Related Articles, Sort Array Two Halves Sorted. Review the synced source file for the implementation details.
