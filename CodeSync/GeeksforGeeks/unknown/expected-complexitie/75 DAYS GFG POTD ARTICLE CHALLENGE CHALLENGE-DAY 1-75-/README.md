# 75 DAYS GFG POTD ARTICLE CHALLENGE CHALLENGE(DAY 1/75)

- Platform: GeeksforGeeks
- Language: class Solution: def isPalindrome(self, s): left, right = 0, len(s) - 1 while left < right: if s[left] != s[right]: return 0 left, right = left+1, right-1 return 1
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, Zoho, Morgan Stanley, Amazon, D-E-Shaw, FactSet
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/palindrome-string0817/1
- Synced: 2026-07-15T06:02:58.833Z

## Problem Description

Given a string s, return true if the string is a palindrome. Otherwise, return false. A string is considered a palindrome if it reads the same forwards and backwards. Examples : Input: s = "abba" Output: true Explanation: "abba" reads the same forwards and backwards, so it is a palindrome. Input: s = "abc" Output: false Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome. Constraints: 1 ≤ s.size() ≤ 106 The string s contains only lowercase english letters (a-z).

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def isPalindrome(self, s): left, right = 0, len(s) - 1 while left < right: if s[left] != s[right]: return 0 left, right = left+1, right-1 return 1. The detected topics are Expected Complexities, Company Tags, Paytm, Zoho, Morgan Stanley, Amazon, D-E-Shaw, FactSet. Review the synced source file for the implementation details.
