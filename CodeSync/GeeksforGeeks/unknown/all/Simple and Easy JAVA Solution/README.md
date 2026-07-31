# Simple and Easy JAVA Solution ::

- Platform: GeeksforGeeks
- Language: class Solution { public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) { ArrayList<Integer> res = new ArrayList<>(); int prefSum[] = new int[arr.length]; prefSum[0] = arr[0]; for(int i = 1; i < arr.length; i++) prefSum[i] = arr[i] + prefSum[i-1]; for(int i = 0; i < queries.length; i++) { int l = queries[i][0]; int r = queries[i][1]; int sum = 0; if(l == 0) sum = prefSum[r]; else sum = prefSum[r] - prefSum[l-1]; res.add(sum); } return res; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, prefix-sum, Arrays, Related Articles, Understanding Prefix Sums
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/prefix-sum-range-query/1
- Synced: 2026-07-31T18:15:51.974Z

## Problem Description

Given an array arr[] of integers and a list of q queries queries[][], where each query is in the form [L, R], compute the sum of elements from index L to R (both inclusive) for each query. Examples: Input: arr[] = [2, 4, 6, 8, 10], queries[][] = [[1, 3], [0, 2]] Output: [18, 12] Explanation: Query [1, 3] -> 4 + 6 + 8 = 18 Query [0, 2] -> 2 + 4 + 6 = 12 Input: arr[] = [5, 1, 3, 2], queries[][] = [[0, 1], [2, 3]] Output: [6, 5] Explanation: Query [0, 1] -> 5 + 1 = 6 Query [2, 3] -> 3 + 2 = 5

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) { ArrayList<Integer> res = new ArrayList<>(); int prefSum[] = new int[arr.length]; prefSum[0] = arr[0]; for(int i = 1; i < arr.length; i++) prefSum[i] = arr[i] + prefSum[i-1]; for(int i = 0; i < queries.length; i++) { int l = queries[i][0]; int r = queries[i][1]; int sum = 0; if(l == 0) sum = prefSum[r]; else sum = prefSum[r] - prefSum[l-1]; res.add(sum); } return res; } }. The detected topics are Expected Complexities, Topic Tags, prefix-sum, Arrays, Related Articles, Understanding Prefix Sums. Review the synced source file for the implementation details.
