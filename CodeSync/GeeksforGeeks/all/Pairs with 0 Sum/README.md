# Pairs with 0 Sum

- Platform: GeeksforGeeks
- Language: class Solution { public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) { Arrays.sort(arr); ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); int start = 0; int end = arr.length - 1; while (start < end) { if (arr[start] + arr[end] == 0) { ans.add(new ArrayList<>(Arrays.asList(arr[start], arr[end]))); start++; end--; while (start < end && arr[start] == arr[start - 1]) { start++; } while (start < end && arr[end] == arr[end + 1]) { end--; } } else if (arr[start] + arr[end] < 0) { start++; } else { end--; } } return ans; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Accolite, Amazon, FactSet, Hike, MakeMyTrip
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
- Synced: 2026-09-14T11:16:04.159Z

## Problem Description

Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0. Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs. Examples: Input: arr = [-1, 0, 1, 2, -1, -4] Output: [[-1, 1]] Explanation: arr[0] + arr[2] = (-1)+ 1 = 0. arr[2] + arr[4] = 1 + (-1) = 0. The distinct pair are [-1,1]. Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5] Output: [[-6, 6],[-1, 1]] Explanation: The distinct pairs are [-1, 1] and [-6, 6].

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) { Arrays.sort(arr); ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); int start = 0; int end = arr.length - 1; while (start < end) { if (arr[start] + arr[end] == 0) { ans.add(new ArrayList<>(Arrays.asList(arr[start], arr[end]))); start++; end--; while (start < end && arr[start] == arr[start - 1]) { start++; } while (start < end && arr[end] == arr[end + 1]) { end--; } } else if (arr[start] + arr[end] < 0) { start++; } else { end--; } } return ans; } }. The detected topics are Expected Complexities, Company Tags, Flipkart, Accolite, Amazon, FactSet, Hike, MakeMyTrip. Review the synced source file for the implementation details.
