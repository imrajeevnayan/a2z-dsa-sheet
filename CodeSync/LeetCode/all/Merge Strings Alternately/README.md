# Merge Strings Alternately

- Platform: LeetCode
- Language: LeetCode 75
- Difficulty: Easy
- Topics: Two Pointers, String
- Runtime: 0 ms
- Memory: 42.82 MB
- Problem URL: https://leetcode.com/problems/merge-strings-alternately/submissions/2032452273/?envType=study-plan-v2&envId=leetcode-75
- Synced: 2026-06-14T05:16:47.156Z

## Problem Description

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string. Return the merged string. Example 1: Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged string will be merged as so: word1: a b c word2: p q r merged: a p b q c r Example 2: Input: word1 = "ab", word2 = "pqrs" Output: "apbqrs" Explanation: Notice that as word2 is longer, "rs" is appended to the end. word1: a b word2: p q r s merged: a p b q r s Example 3: Input: word1 = "abcd", word2 = "pq" Output: "apbqcd" Explanation: Notice that as word1 is longer, "cd" is appended to the end. word1: a b c d word2: p q merged: a p b q c d Constraints: 1 <= word1.length, word2.length <= 100 word1 and word2 consist of lowercase English letters.

## Explanation

This solution was accepted on LeetCode using LeetCode 75. The detected topics are Two Pointers, String. Review the synced source file for the implementation details.
