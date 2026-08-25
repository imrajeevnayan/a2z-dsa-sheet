# C++ Solution || Easy Approach and Step by Step Explanation

- Platform: GeeksforGeeks
- Language: class Solution { public int minMoves(int[] arr) { HashMap<Integer,Integer> map = new HashMap<>(); int ans = Integer.MIN_VALUE; for(int i=0;i<arr.length;i++){ if(map.containsKey(arr[i]-1)) map.put(arr[i],map.get(arr[i]-1) + 1); else map.put(arr[i],1); ans = Math.max(ans,map.get(arr[i])); } return arr.length - ans; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Hash, Dynamic Programming, Arrays, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/morning-assembly3038/1
- Synced: 2026-08-25T05:12:07.282Z

## Problem Description

Given an array arr[] containing integers from 1 to n exactly once, sort the array in ascending order. In one operation, you can pick any element and move it either to the beginning or to the end of the array. Return the minimum number of operations required to sort the array. Examples: Input: arr[] = [2, 1, 3] Output: 1 Explanation: Move 1 to the beginning. Input: arr[] = [4, 3, 1, 2] Output: 2 Explanation: Move 3 to the end to get [1, 2, 4, 3]. Then move 4 to the end to get [1, 2, 3, 4].

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int minMoves(int[] arr) { HashMap<Integer,Integer> map = new HashMap<>(); int ans = Integer.MIN_VALUE; for(int i=0;i<arr.length;i++){ if(map.containsKey(arr[i]-1)) map.put(arr[i],map.get(arr[i]-1) + 1); else map.put(arr[i],1); ans = Math.max(ans,map.get(arr[i])); } return arr.length - ans; } }. The detected topics are Expected Complexities, Topic Tags, Hash, Dynamic Programming, Arrays, Related Articles. Review the synced source file for the implementation details.
