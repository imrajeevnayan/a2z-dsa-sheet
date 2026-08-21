# C++ Solution || Easy Approach and Step by Step Explanation

- Platform: GeeksforGeeks
- Language: class Solution { int transform(String s1, String s2) { int n = s1.length(); if (n != s2.length()) { return -1; } int[] freq = new int[256]; for (int i = 0; i < n; i++) { freq[s1.charAt(i)]++; freq[s2.charAt(i)]--; } for (int f : freq) { if (f != 0) { return -1; } } int i = n - 1; int j = n - 1; int ops = 0; while (i >= 0) { while (i >= 0 && s1.charAt(i) != s2.charAt(j)) { ops++; i--; } if (i >= 0) { i--; j--; } } return ops; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Directi, Company Tags, Directi, Topic Tags, Hash, Strings, Map
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/transform-string5648/1
- Synced: 2026-08-21T06:21:45.282Z

## Problem Description

Given two strings s1 and s2. Find the minimum number of steps required to transform string s1 into string s2. The only allowed operation for the transformation is selecting a character from string s1 and inserting it in the beginning of string s1. If transformation is not possible return -1. Examples: Input: s1 = "abd", s2 = "bad" Output: 1 Explanation: The conversion can take place in 1 operation: Pick 'b' and place it at the front. Input: s1 = "GeeksForGeeks", s2 = "ForGeeksGeeks" Output: 3 Explanation: The conversion can take place in 3 operations: Pick 'r' and place it at the front. s1 = "rGeeksFoGeeks" Pick 'o' and place it at the front. s1 = "orGeeksFGeeks" Pick 'F' and place it at the front. s1 = "ForGeeksGeeks" Constraints: 1<= s1.length(), s2.length() <= 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int transform(String s1, String s2) { int n = s1.length(); if (n != s2.length()) { return -1; } int[] freq = new int[256]; for (int i = 0; i < n; i++) { freq[s1.charAt(i)]++; freq[s2.charAt(i)]--; } for (int f : freq) { if (f != 0) { return -1; } } int i = n - 1; int j = n - 1; int ops = 0; while (i >= 0) { while (i >= 0 && s1.charAt(i) != s2.charAt(j)) { ops++; i--; } if (i >= 0) { i--; j--; } } return ops; } }. The detected topics are Expected Complexities, Company Tags Directi, Company Tags, Directi, Topic Tags, Hash, Strings, Map. Review the synced source file for the implementation details.
