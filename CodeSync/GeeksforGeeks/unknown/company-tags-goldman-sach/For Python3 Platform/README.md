# For Python3 Platform

- Platform: GeeksforGeeks
- Language: class Solution: def merge(self, S1, S2): l="" i=j=0 while i < len(S1) and j < len(S2): l+=S1[i]+S2[j] i=i+1 j=j+1 if len(S1)>len(S2): l+=S1[j:] else: l+=S2[i:] return l
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Goldman Sachs, Company Tags, Goldman Sachs, Topic Tags, Strings, Related Interview Experiences, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/merge-two-strings2736/1
- Synced: 2026-08-15T08:59:30.093Z

## Problem Description

Given two strings s1 and s2, merge them alternatively i.e. the first character of s1 then the first character of s2 and so on till the strings end. Note: Add the whole string if other string is empty. Examples: Input: s1 = "Hello", s2 = "Bye" Output: HBeylelo Explanation: The characters of both the given strings are arranged alternatlively. Input: s1 = "abc", s2 = "def" Output: adbecf Explanation: The characters of both the given strings are arranged alternatlively. Constraints: 1<=|s1|, |s2| <=103

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def merge(self, S1, S2): l="" i=j=0 while i < len(S1) and j < len(S2): l+=S1[i]+S2[j] i=i+1 j=j+1 if len(S1)>len(S2): l+=S1[j:] else: l+=S2[i:] return l. The detected topics are Expected Complexities, Company Tags Goldman Sachs, Company Tags, Goldman Sachs, Topic Tags, Strings, Related Interview Experiences, Related Articles. Review the synced source file for the implementation details.
