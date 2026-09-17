# Problem Solved Successfully

- Platform: GeeksforGeeks
- Language: class Solution { public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) { Arrays.sort(arr); ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); int start = 0; int end = arr.length - 1; while (start < end) { if (arr[start] + arr[end] == 0) { ans.add(new ArrayList<>(Arrays.asList(arr[start], arr[end]))); start++; end--; while (start < end && arr[start] == arr[start - 1]) { start++; } while (start < end && arr[end] == arr[end + 1]) { end--; } } else if (arr[start] + arr[end] < 0) { start++; } else { end--; } } return ans; } }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
- Synced: 2026-09-17T04:46:19.848Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) { Arrays.sort(arr); ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); int start = 0; int end = arr.length - 1; while (start < end) { if (arr[start] + arr[end] == 0) { ans.add(new ArrayList<>(Arrays.asList(arr[start], arr[end]))); start++; end--; while (start < end && arr[start] == arr[start - 1]) { start++; } while (start < end && arr[end] == arr[end + 1]) { end--; } } else if (arr[start] + arr[end] < 0) { start++; } else { end--; } } return ans; } }. Review the synced source file for the implementation details.
