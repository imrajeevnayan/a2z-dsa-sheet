# Java Solution

- Platform: GeeksforGeeks
- Language: class Solution { public List<Integer> findEvenOccurrences(int[] arr) { HashMap<Integer, Integer> map = new LinkedHashMap<>(); for (int i = 0, n = arr.length; i < n; ++i) map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); List<Integer> res = new ArrayList<>(); for (int val : map.keySet()) if ((map.get(val) & 1) == 0) res.add(val); if (res.isEmpty()) res.add(-1); return res; } } // Solution class
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Arrays, Bit Magic, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/even-occurring-elements4332/1
- Synced: 2026-06-29T16:22:24.720Z

## Problem Description

Given an array arr[] of integers, where most numbers occur an odd number of times, except for a few elements that appear an even number of times. Find and return the elements with even occurrences in the array. If no such element exists, return -1. Note: Elements should be returned in order of occurrence. Examples: Input: arr[] = [9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15] Output: [12, 15, 23] Explanation: The numbers 12, 15, and 23 each appear an even number of times. Input: arr[] = [23, 12, 56, 34, 32] Output: [-1] Explanation: Every number in the array occurs an odd number of times. Constraints: 1 ≤ arr.size() ≤ 106 1 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public List<Integer> findEvenOccurrences(int[] arr) { HashMap<Integer, Integer> map = new LinkedHashMap<>(); for (int i = 0, n = arr.length; i < n; ++i) map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); List<Integer> res = new ArrayList<>(); for (int val : map.keySet()) if ((map.get(val) & 1) == 0) res.add(val); if (res.isEmpty()) res.add(-1); return res; } } // Solution class. The detected topics are Expected Complexities, Topic Tags, Arrays, Bit Magic, Data Structures, Related Articles. Review the synced source file for the implementation details.
