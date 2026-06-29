# 🎯 Find the Unique Element | HashMap Approach

- Platform: GeeksforGeeks
- Language: class Solution { public int findUnique(int k, int[] arr) { HashMap<Integer, Integer> mp = new HashMap<>(); for (int num : arr) { mp.put(num, mp.getOrDefault(num, 0) + 1); } // Find element which does NOT occur k times for (int key : mp.keySet()) { if (mp.get(key) % k != 0) { return key; } } return -1; } }
- Difficulty: Unknown
- Topics: Topic Tags Related Articles, Topic Tags, Arrays, Hash, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-unique-element2632/1
- Synced: 2026-06-29T16:30:32.157Z

## Problem Description

Given an array of elements occurring in multiples of k, except one element which doesn't occur in multiple of k. Return the unique element. Examples: Input: k = 3, arr[] = [6, 2, 5, 2, 2, 6, 6] Output: 5 Explanation: Every element appears 3 times except 5. Input: k = 4, arr[] = [2, 2, 2, 10, 2] Output: 10 Explanation: Every element appears 4 times except 10. Expected Time Complexity: O(n* log(arr[i])) Expected Auxiliary Space: O(log(arr[i])) Constraints: 3<= arr.size()<=2*105 2<= k<=2*105 1<= arr[i]<=109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int findUnique(int k, int[] arr) { HashMap<Integer, Integer> mp = new HashMap<>(); for (int num : arr) { mp.put(num, mp.getOrDefault(num, 0) + 1); } // Find element which does NOT occur k times for (int key : mp.keySet()) { if (mp.get(key) % k != 0) { return key; } } return -1; } }. The detected topics are Topic Tags Related Articles, Topic Tags, Arrays, Hash, Data Structures, Related Articles. Review the synced source file for the implementation details.
