# Sort an array of strings according to string lengths

- Platform: GeeksforGeeks
- Language: return str(arr.sort(key=len))
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Sorting, Arrays, Related Articles, Sort Array Strings According String Lengths
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sort-an-array-of-strings-according-to-string-lengths/1
- Synced: 2026-08-06T07:03:00.645Z

## Problem Description

You are given an array arr[] of strings. Your have to sort the array in ascending order based on the lengths of the strings. If two strings have the same length, maintain their original relative order. Examples: Input: arr[] = ["GeeksforGeeeks", "I", "from", "am"] Output: ["I", "am", "from", "GeeksforGeeks"] Explanation: The strings are sorted in increasing order of their lengths, starting from the shortest string "I" to the longest one "GeeksforGeeeks". Input: arr[] = ["You", "are", "beautiful", "looking"] Output: ["You", "are", "looking", "beautiful"] Explanation: The strings are sorted by length: "You", "are", "looking", and then "beautiful", with the shortest words appearing first and the longest last. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i].size() ≤ 100 Each string in arr[i] contains only English letters.

## Explanation

This solution was accepted on GeeksforGeeks using return str(arr.sort(key=len)). The detected topics are Expected Complexities, Topic Tags, Strings, Sorting, Arrays, Related Articles, Sort Array Strings According String Lengths. Review the synced source file for the implementation details.
