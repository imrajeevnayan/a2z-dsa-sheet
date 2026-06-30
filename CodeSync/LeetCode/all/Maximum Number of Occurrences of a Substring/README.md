# Maximum Number of Occurrences of a Substring

- Platform: LeetCode
- Language: Strings (Copy-ehkbkaxt)
- Difficulty: Medium
- Topics: Hash Table, String, Sliding Window
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/description/?envType=problem-list-v2&envId=da2hb3jj
- Synced: 2026-06-30T18:48:46.094Z

## Problem Description

Given a string s, return the maximum number of occurrences of any substring under the following rules: The number of unique characters in the substring must be less than or equal to maxLetters. The substring size must be between minSize and maxSize inclusive. Example 1: Input: s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4 Output: 2 Explanation: Substring "aab" has 2 occurrences in the original string. It satisfies the conditions, 2 unique letters and size 3 (between minSize and maxSize). Example 2: Input: s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3 Output: 2 Explanation: Substring "aaa" occur 2 times in the string. It can overlap. Constraints: 1 <= s.length <= 105 1 <= maxLetters <= 26 1 <= minSize <= maxSize <= min(26, s.length) s consists of only lowercase English letters.

## Explanation

This solution was accepted on LeetCode using Strings (Copy-ehkbkaxt). The detected topics are Hash Table, String, Sliding Window. Review the synced source file for the implementation details.
