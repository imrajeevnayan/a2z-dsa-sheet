# Make all Substrings Distinct

- Platform: GeeksforGeeks
- Language: class Solution: def minChange(self,S): # Code here return len(S) - len(set(S))
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/minimum-changes-to-make-all-substrings-distinct4722/1
- Synced: 2026-08-02T11:15:44.293Z

## Problem Description

Given a string s consisting of lowercase English letters, determine the minimum number of character modifications required so that every substring of the resulting string is unique. A modification consists of replacing any character with another lowercase English letter. Examples : Input: s = "aab" Output: 1 Explanation: By changing one occurrence of 'a' to a different letter, the string can be transformed into "acb", where all the substrings are distinct. Input: s = "ab" Output: 0 Explanation: All substrings of "ab" are: "a", "b", and "ab". Since every substring is distinct, no modifications are required. Constraints: 1 ≤ s.size() ≤ 26

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def minChange(self,S): # Code here return len(S) - len(set(S)). The detected topics are Expected Complexities, Topic Tags, Strings, Related Articles. Review the synced source file for the implementation details.
