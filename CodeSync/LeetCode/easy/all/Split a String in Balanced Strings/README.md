# Split a String in Balanced Strings

- Platform: LeetCode
- Language: String
- Difficulty: Easy
- Topics: String, Greedy, Counting
- Runtime: 0 ms
- Memory: 42.73 MB
- Problem URL: https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/2115311628/?envType=problem-list-v2&envId=string
- Synced: 2026-08-21T17:07:05.449Z

## Problem Description

Balanced strings are those that have an equal quantity of 'L' and 'R' characters. Given a balanced string s, split it into some number of substrings such that: Each substring is balanced. Return the maximum number of balanced strings you can obtain. Example 1: Input: s = "RLRRLLRLRL" Output: 4 Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'. Example 2: Input: s = "RLRRRLLRLL" Output: 2 Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'. Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced. Example 3: Input: s = "LLLLRRRR" Output: 1 Explanation: s can be split into "LLLLRRRR". Constraints: 2 <= s.length <= 1000 s[i] is either 'L' or 'R'. s is a balanced string.

## Explanation

This solution was accepted on LeetCode using String. The detected topics are String, Greedy, Counting. Review the synced source file for the implementation details.
