# Easy C++ O(n) time and O(n) space solution

- Platform: GeeksforGeeks
- Language: class Solution { public List<Integer> twoSum(int arr[], int target) { // code here Arrays.sort(arr); int i=0; int j=arr.length-1; while( i<j ){ int sum = arr[i] + arr[j]; if(sum == target){ return Arrays.asList(arr[i], arr[j]); }else if( sum < target){ i++; }else{ j--; } } return new ArrayList<>(); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Sorting, two-pointer-algorithm, Arrays, Hash, Related Articles, 2 Sum Print Pair With Given Sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/2-sum-find-a-pair-with-given-sum/1
- Synced: 2026-09-17T17:59:55.568Z

## Problem Description

Given an array arr[] and an integer target, return the pair of elements whose sum equals target. An element cannot be used twice unless it appears multiple times in the array. Note: If no pair exist, return an empty array. Examples: Input: arr[] = [2, 9, 10, 4, 15], target = 12 Output: [2, 10] Explanation: Pair with sum equal to 12 is (2, 10). Input: arr[] = [3, 2, 4], target = 8 Output: [] Explanation: No pair exists with sum equal to 8. Input: arr[] = [1, 4, 5, 6, 1], target = 2 Output: [1, 1] Explanation: Pair with sum equal to 2 is (1, 1). Constraints: 1 ≤ arr.size() ≤ 105 0 ≤ arr[i] ≤ 104 1 ≤ target ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public List<Integer> twoSum(int arr[], int target) { // code here Arrays.sort(arr); int i=0; int j=arr.length-1; while( i<j ){ int sum = arr[i] + arr[j]; if(sum == target){ return Arrays.asList(arr[i], arr[j]); }else if( sum < target){ i++; }else{ j--; } } return new ArrayList<>(); } }. The detected topics are Expected Complexities, Topic Tags, Sorting, two-pointer-algorithm, Arrays, Hash, Related Articles, 2 Sum Print Pair With Given Sum. Review the synced source file for the implementation details.
