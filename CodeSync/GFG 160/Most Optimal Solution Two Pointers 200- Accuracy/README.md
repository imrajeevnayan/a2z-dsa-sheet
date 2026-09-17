# Most Optimal Solution | Two Pointers | 200% Accuracy

- Platform: GeeksforGeeks
- Language: class Solution { public ArrayList<Integer> twoSum(int[] arr, int target) { // code here ArrayList<Integer> list = new ArrayList<>(); int n = arr.length; int i = 0; int j = n - 1; while(i < j) { if(arr[i] + arr[j] < target) { i++; } else if(arr[i] + arr[j] > target) { j--; } else { list.add(i+1); list.add(j+1); return list; } } list.add(-1); list.add(-1); return list; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, two-pointer-algorithm, Arrays, Related Articles, Pair With Given Sum In Sorted Array Two Sum Ii
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/two-sum-in-sorted-array/1
- Synced: 2026-09-17T17:42:11.341Z

## Problem Description

You are given a 1-based indexed integer array arr[] that is sorted in non-decreasing order, along with an integer target. Your task is to find two elements in the array such that their sum is equal to target. If such a pair exists, return the indices of the two elements in increasing order. If no such pair exists, return [-1, -1]. Note: If your answer is correct then the driver code will print "true" otherwise "false". Examples: Input: arr[] = [2, 7, 11, 15], target = 9 Output: [1, 2] Explanation: Since arr[0] + arr[1] = 2 + 7 = 9 equals the target, return their 1-based indices : [1, 2] Input: arr[] = [1, 3, 4, 6, 8, 11], target = 10 Output: [3, 4] Explanation: Since arr[2] + arr[3] = 4 + 6 = 10 equals the target, return their 1-based indices : [3, 4] Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i], target ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public ArrayList<Integer> twoSum(int[] arr, int target) { // code here ArrayList<Integer> list = new ArrayList<>(); int n = arr.length; int i = 0; int j = n - 1; while(i < j) { if(arr[i] + arr[j] < target) { i++; } else if(arr[i] + arr[j] > target) { j--; } else { list.add(i+1); list.add(j+1); return list; } } list.add(-1); list.add(-1); return list; } }. The detected topics are Expected Complexities, Topic Tags, two-pointer-algorithm, Arrays, Related Articles, Pair With Given Sum In Sorted Array Two Sum Ii. Review the synced source file for the implementation details.
