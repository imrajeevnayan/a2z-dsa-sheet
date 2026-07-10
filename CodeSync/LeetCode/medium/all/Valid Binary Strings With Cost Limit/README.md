# Valid Binary Strings With Cost Limit

- Platform: LeetCode
- Language: Weekly Contest 505
- Difficulty: Medium
- Topics: Uncategorized
- Runtime: 0 ms
- Memory: 0.00 MB
- Problem URL: https://leetcode.com/contest/weekly-contest-505/problems/valid-binary-strings-with-cost-limit/submissions/2061780959/
- Synced: 2026-07-09T13:42:04.218Z

## Problem Description

You are given two integers n and k. The cost of a binary string s is defined as the sum of all indices i (0-based) such that s[i] == '1'. A binary string is considered valid if: It does not contain two consecutive '1' characters. Its cost is less than or equal to k. Return a list of all valid binary strings of length n in any order. Example 1: Input: n = 3, k = 1 Output: ["000","010","100"] Explanation: The binary strings of length 3 without consecutive '1' characters are: "000" : cost = 0 "100" : cost = 0 "010" : cost = 1 "001" : cost = 2 "101" : cost = 0 + 2 = 2 Among these, the strings with cost less than or equal to k = 1 are "000", "010" and "100". Thus, the valid strings are ["000", "010", "100"]. Example 2: Input: n = 1, k = 0 Output: ["0","1"] Explanation: The valid binary strings of length 1 are "0" and "1". Thus the answer is ["0", "1"]. Constraints: 1 <= n <= 12 0 <= k <= n * (n - 1) / 2

## Explanation

This solution was accepted on LeetCode using Weekly Contest 505. Review the synced source file for the implementation details.
