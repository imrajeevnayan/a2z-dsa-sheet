# Hashing for pair - 1

- Platform: GeeksforGeeks
- Language: public static int sumExists(int arr[], int sum) { HashMap<Integer, Integer> hs = new HashMap<>(); for(int num : arr) { hs.put(num, hs.getOrDefault(num , 0) + 1); } for(int num : arr) { if((hs.containsKey(sum - num) && sum - num != num) || (hs.containsKey(sum - num) && sum - num == num && hs.get(sum - num) > 1)) { return 1; } } return 0; }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Hash
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/hashing-for-pair-1--110939/1
- Synced: 2026-08-08T16:35:41.998Z

## Problem Description

You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array. Example : Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], sum = 14 Output: 1 Explanation: There is a pair {4, 10} with sum 14. Input: arr[] = [2, 5], sum = 10 Output: 0 Explanation: There is no pair with sum 10. Constraints: 1 <= arr.size() <= 1000 1 <= arri <= 106 1 <= sum <= 1000

## Explanation

This solution was accepted on GeeksforGeeks using public static int sumExists(int arr[], int sum) { HashMap<Integer, Integer> hs = new HashMap<>(); for(int num : arr) { hs.put(num, hs.getOrDefault(num , 0) + 1); } for(int num : arr) { if((hs.containsKey(sum - num) && sum - num != num) || (hs.containsKey(sum - num) && sum - num == num && hs.get(sum - num) > 1)) { return 1; } } return 0; }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Hash. Review the synced source file for the implementation details.
