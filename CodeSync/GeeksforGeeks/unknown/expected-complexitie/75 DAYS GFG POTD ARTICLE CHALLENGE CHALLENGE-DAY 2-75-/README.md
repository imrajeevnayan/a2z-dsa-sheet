# 75 DAYS GFG POTD ARTICLE CHALLENGE CHALLENGE(DAY 2/75)

- Platform: GeeksforGeeks
- Language: class Solution: def longestKSubstr(self, s, k): if k == 0: return 0 char_freq = {} max_length = -1 left = 0 for right in range(len(s)): if s[right] not in char_freq: char_freq[s[right]] = 0 char_freq[s[right]] += 1 while len(char_freq) > k: char_freq[s[left]] -= 1 if char_freq[s[left]] == 0: del char_freq[s[left]] left += 1 if len(char_freq)==k: max_length = max(max_length, right - left + 1) return max_length
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonGoogleSAP Labs, Company Tags, Amazon, Google, SAP Labs, Topic Tags, two-pointer-algorithm
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
- Synced: 2026-09-14T17:01:41.506Z

## Problem Description

You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters. Note : If no such substring exists, return -1. Examples: Input: s = "aabacbebebe", k = 3 Output: 7 Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'. Input: s = "aaaa", k = 2 Output: -1 Explanation: There's no substring with 2 distinct characters. Input: s = "aabaaab", k = 2 Output: 7 Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def longestKSubstr(self, s, k): if k == 0: return 0 char_freq = {} max_length = -1 left = 0 for right in range(len(s)): if s[right] not in char_freq: char_freq[s[right]] = 0 char_freq[s[right]] += 1 while len(char_freq) > k: char_freq[s[left]] -= 1 if char_freq[s[left]] == 0: del char_freq[s[left]] left += 1 if len(char_freq)==k: max_length = max(max_length, right - left + 1) return max_length. The detected topics are Expected Complexities, Company Tags AmazonGoogleSAP Labs, Company Tags, Amazon, Google, SAP Labs, Topic Tags, two-pointer-algorithm. Review the synced source file for the implementation details.
