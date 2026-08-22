# Generating All Subarrays

- Platform: GeeksforGeeks
- Language: public List<List<Integer>> getSubArrays(int[] arr) { List<List<Integer>> ans = new ArrayList<>(); for (int i = 0; i < arr.length; i++) { List<Integer> current = new ArrayList<>(); for (int j = i; j < arr.length; j++) { current.add(arr[j]); ans.add(new ArrayList<>(current)); } } return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Recursion, Related Articles, Generating Subarrays Using Recursion
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/generating-all-subarrays/1
- Synced: 2026-08-22T15:07:29.968Z

## Problem Description

Given an array arr[], generate and return all possible subarrays. The subarrays must be returned in the following order: 1. Subarrays starting from the first element, followed by subarrays starting from the second element, and so on. 2. For each starting index, subarrays should be in increasing length. Examples: Input: arr[] = [1, 2, 3] Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]] Explanation: Starting with the first element, we generate subarrays [1], [1, 2], and [1, 2, 3]. Then, starting from the second element, we get [2] and [2, 3]. Finally, starting from the third element, we only get [3]. Input: arr[] = [1, 2] Output: [[1], [1, 2], [2]] Explanation: Starting with the first element, we generate subarrays [1] and [1, 2]. Then, starting from the second element, we get [2]. Input: arr[] = [1, 1] Output: [[1], [1, 1], [1]] Explanation: Starting with the first element, we generate subarrays [1] and [1, 1] (including both elements). Starting from the second element, we only get the subarray [1]. Constraints: 1 ≤ arr.size() ≤ 200 1 ≤ arr[i] ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using public List<List<Integer>> getSubArrays(int[] arr) { List<List<Integer>> ans = new ArrayList<>(); for (int i = 0; i < arr.length; i++) { List<Integer> current = new ArrayList<>(); for (int j = i; j < arr.length; j++) { current.add(arr[j]); ans.add(new ArrayList<>(current)); } } return ans; }. The detected topics are Expected Complexities, Topic Tags, Recursion, Related Articles, Generating Subarrays Using Recursion. Review the synced source file for the implementation details.
