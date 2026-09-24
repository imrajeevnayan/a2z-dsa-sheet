# Remove All Adjacent Duplicates in String II

- Platform: LeetCode
- Language: Problem List
- Difficulty: Medium
- Topics: String, Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/description/
- Synced: 2026-09-23T19:33:35.004Z

## Problem Description

You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together. We repeatedly make k duplicate removals on s until we no longer can. Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique. Example 1: Input: s = "abcd", k = 2 Output: "abcd" Explanation: There's nothing to delete. Example 2: Input: s = "deeedbbcccbdaa", k = 3 Output: "aa" Explanation: First delete "eee" and "ccc", get "ddbbbdaa" Then delete "bbb", get "dddaa" Finally delete "ddd", get "aa" Example 3: Input: s = "pbbcggttciiippooaais", k = 2 Output: "ps" Constraints: 1 <= s.length <= 105 2 <= k <= 104 s only contains lowercase English letters.

## Explanation

This solution was accepted on LeetCode using Problem List. The detected topics are String, Stack. Review the synced source file for the implementation details.
