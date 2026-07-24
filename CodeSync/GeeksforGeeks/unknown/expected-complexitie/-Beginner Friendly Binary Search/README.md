# ✅Beginner Friendly | Binary Search

- Platform: GeeksforGeeks
- Language: // User function Template for C++ class Solution { public: int findTarget(vector<int>& arr, int target) { int l = 0; // Left pointer int h = arr.size() - 1; // Right pointer int n = arr.size(); // Array size // Binary search until only 2 elements remain while (h > l + 1) { int mid = l + (h - l) / 2; // Check if target found at mid position if (arr[mid] == target) { return mid; } // Check if target found at mid-1 position (almost sorted property) else if (arr[mid - 1] == target && mid - 1 >= 0) { return mid - 1; } // Check if target found at mid+1 position (almost sorted property) else if (arr[mid + 1] == target && mid + 1 < n) { return mid + 1; } // Standard binary search logic else if (arr[mid] < target) { l = mid; // Target in right half } else { h = mid; // Target in left half } } // Check final 2 candidates if (arr[l] == target) { return l; } if (arr[h] == target) { return h; } return -1; // Target not found } }; /* Problem: Search in almost sorted array using binary search Template: while (h > l + 1) with neighbor checking Time: O(log n), Space: O(1) */
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Binary Search, Sorting, Arrays, Related Articles, Search Almost Sorted Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/search-in-an-almost-sorted-array/1
- Synced: 2026-07-24T12:30:59.403Z

## Problem Description

Given a sorted integer array arr[] consisting of distinct elements, where some elements of the array are moved to either of the adjacent positions, i.e. arr[i] may be present at arr[i-1] or arr[i+1]. Given an integer target. You have to return the index ( 0-based ) of the target in the array. If target is not present return -1. Examples: Input: arr[] = [10, 3, 40, 20, 50, 80, 70], target = 40 Output: 2 Explanation: Index of 40 in the given array is 2. Input: arr[] = [10, 3, 40, 20, 50, 80, 70], target = 90 Output: -1 Explanation: 90 is not present in the array. Input: arr[] = [-20], target = -20 Output: 0 Explanation: -20 is the only element present in the array. Constraints: 1 <= arr.size() <= 105 -109 <= arr[i] <= 109

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for C++ class Solution { public: int findTarget(vector<int>& arr, int target) { int l = 0; // Left pointer int h = arr.size() - 1; // Right pointer int n = arr.size(); // Array size // Binary search until only 2 elements remain while (h > l + 1) { int mid = l + (h - l) / 2; // Check if target found at mid position if (arr[mid] == target) { return mid; } // Check if target found at mid-1 position (almost sorted property) else if (arr[mid - 1] == target && mid - 1 >= 0) { return mid - 1; } // Check if target found at mid+1 position (almost sorted property) else if (arr[mid + 1] == target && mid + 1 < n) { return mid + 1; } // Standard binary search logic else if (arr[mid] < target) { l = mid; // Target in right half } else { h = mid; // Target in left half } } // Check final 2 candidates if (arr[l] == target) { return l; } if (arr[h] == target) { return h; } return -1; // Target not found } }; /* Problem: Search in almost sorted array using binary search Template: while (h > l + 1) with neighbor checking Time: O(log n), Space: O(1) */. The detected topics are Expected Complexities, Topic Tags, Binary Search, Sorting, Arrays, Related Articles, Search Almost Sorted Array. Review the synced source file for the implementation details.
