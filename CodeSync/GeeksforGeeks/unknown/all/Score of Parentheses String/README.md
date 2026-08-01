# Score of Parentheses String

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Stack, Strings, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/score-of-parentheses-string/1
- Synced: 2026-08-01T18:25:17.813Z

## Problem Description

Given a string s consisting of balanced parentheses, calculate the score of the string based on the following rules: "()" has a score of 1. "AB" has a score of A + B, where A and B are balanced parentheses strings. "(A)" has a score of 2 × score(A), where A is a balanced parentheses string. Note: Test cases are generated such that the score will fit within a 32-bit integer. Examples: Input: s = "()()" Output: 2 Explanation: The string str is of the form "ab", that makes the total score = (score of a) + (score of b) = 1 + 1 = 2. Input: s = "(()(()))" Output: 6 Explanation: The string str is of the form "(a(b))" which makes the total score = 2 × ((score of a) + 2 × (score of b)) = 2 × (1 + 2 × (1)) = 6. Input: s = "((()))" Output: 4 Explanation: The string str is of the form "((a))" which makes the total score = 2 × (2 × (score of a)) = 2 × (2 × (1)) = 4. Constraints: 1 ≤ s.size() ≤ 105 s[i] ∈ { '(' , ')' }

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, Stack, Strings, Related Articles. Review the synced source file for the implementation details.
