# Python

- Platform: GeeksforGeeks
- Language: class Solution: def missingPanagram(self, s): alpha = 'abcdefghijklmnopqrstuvwxyz' panagram = dict.fromkeys(s.lower(),0) missing = '' for c in alpha: if c not in panagram: missing += c return missing if len(missing) else -1
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Strings, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/missing-characters-in-panagram/1
- Synced: 2026-07-07T19:22:46.734Z

## Problem Description

Given a string s, find the missing characters required to make it a pangram (a sentence containing every letter of the English alphabet at least once). Return all missing characters in lowercase and in lexicographical order. If the given string is already a pangram, return -1. Examples: Input: s = Abcdefghijklmnopqrstuvwxy Output: z Explanation: All alphabets except "z" are present in the string. Input: s = Abc Output: defghijklmnopqrstuvwxyz Constraints: 1 <= |s| <= 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def missingPanagram(self, s): alpha = 'abcdefghijklmnopqrstuvwxyz' panagram = dict.fromkeys(s.lower(),0) missing = '' for c in alpha: if c not in panagram: missing += c return missing if len(missing) else -1. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Strings, Data Structures. Review the synced source file for the implementation details.
