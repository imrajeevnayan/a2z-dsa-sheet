# Word Pattern

- Platform: LeetCode
- Language: Top Interview 150
- Difficulty: Easy
- Topics: Hash Table, String
- Runtime: 0 ms
- Memory: 42.97 MB
- Problem URL: https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150
- Synced: 2026-08-17T05:53:51.926Z

## Problem Description

Given a pattern and a string s, find if s follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically: Each letter in pattern maps to exactly one unique word in s. Each unique word in s maps to exactly one letter in pattern. No two letters map to the same word, and no two words map to the same letter. Example 1: Input: pattern = "abba", s = "dog cat cat dog" Output: true Explanation: The bijection can be established as: 'a' maps to "dog". 'b' maps to "cat". Example 2: Input: pattern = "abba", s = "dog cat cat fish" Output: false Example 3: Input: pattern = "aaaa", s = "dog cat cat dog" Output: false Constraints: 1 <= pattern.length <= 300 pattern contains only lower-case English letters. 1 <= s.length <= 3000 s contains only lowercase English letters and spaces ' '. s does not contain any leading or trailing spaces. All the words in s are separated by a single space.

## Explanation

This solution was accepted on LeetCode using Top Interview 150. The detected topics are Hash Table, String. Review the synced source file for the implementation details.
