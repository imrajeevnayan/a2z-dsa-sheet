# Simple and Easy JAVA Solution ::

- Platform: GeeksforGeeks
- Language: class Solution { repeatedCharacter(s) { // 1) count frequencies const freq = new Map(); for (const ch of s) { freq.set(ch, (freq.get(ch) || 0) + 1); } // 2) find leftmost character whose frequency > 1 for (let i = 0; i < s.length; ++i) { if (freq.get(s[i]) > 1) return i; } return -1; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Goldman Sachs, Company Tags, Goldman Sachs, Topic Tags, Strings, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/repeating-character-first-appearance-leftmost/1
- Synced: 2026-07-12T11:09:46.922Z

## Problem Description

Given a string s, return the index of the first character that appears more than once in the string. If there is no repeated character, return -1. Examples: Input: s = "geeksforgeeks" Output: 0 Explanation: We see that both 'e' and 'g' repeat as we move from left to right.But the leftmost is 'g' so we return leftmost index of 'g' that is 0. Input: s = "abcd" Output: -1 Explanation: No character repeats so we return -1. Constraints: 1 ≤ |s| ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { repeatedCharacter(s) { // 1) count frequencies const freq = new Map(); for (const ch of s) { freq.set(ch, (freq.get(ch) || 0) + 1); } // 2) find leftmost character whose frequency > 1 for (let i = 0; i < s.length; ++i) { if (freq.get(s[i]) > 1) return i; } return -1; } }. The detected topics are Expected Complexities, Company Tags Goldman Sachs, Company Tags, Goldman Sachs, Topic Tags, Strings, Data Structures, Related Articles. Review the synced source file for the implementation details.
