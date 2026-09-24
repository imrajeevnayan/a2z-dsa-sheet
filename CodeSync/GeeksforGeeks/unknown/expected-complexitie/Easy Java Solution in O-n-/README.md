# Easy Java Solution in O(n) :

- Platform: GeeksforGeeks
- Language: class Solution { /** * Returns the minimum number of parentheses required * to make the given parentheses string balanced. * * Approach: * - Count unmatched opening parentheses using `openC`. * - When a closing parenthesis is encountered: * - If an unmatched opening parenthesis exists, match it. * - Otherwise, count it as an unmatched closing parenthesis. * - The total unmatched opening and closing parentheses * represent the minimum number of insertions required. * * Time Complexity: O(n) * Space Complexity: O(1) * * @param s String containing only '(' and ')' * @return Minimum number of parentheses needed to balance the string */ public int minParentheses(String s) { int openC = 0; int closeC = 0; for (char ch : s.toCharArray()) { if (ch == '(') { openC++; } else if (openC != 0) { openC--; } else { closeC++; } } return openC + closeC; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftTCSAdobeIBM, Company Tags, Amazon, Microsoft, TCS, Adobe, IBM
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/min-add-to-make-parentheses-valid/1
- Synced: 2026-09-24T10:47:39.755Z

## Problem Description

You are given a string s consisting only of the characters '(' and ')'. Your task is to determine the minimum number of parentheses (either '(' or ')') that must be inserted at any positions to make the string s a valid parentheses string. A parentheses string is considered valid if: Every opening parenthesis '(' has a corresponding closing parenthesis ')'. Every closing parenthesis ')' has a corresponding opening parenthesis '('. Parentheses are properly nested. Examples: Input: s = "(()(" Output: 2 Explanation: There are two unmatched '(' at the end, so we need to add two ')' to make the string valid. Input: s = ")))" Output: 3 Explanation: Three '(' need to be added at the start to make the string valid. Input: s = ")()()" Output: 1 Explanation: The very first ')' is unmatched, so we need to add one '(' at the beginning. Constraints: 1 ≤ s.size() ≤ 105 s[i] ∈ { '(' , ')' }

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { /** * Returns the minimum number of parentheses required * to make the given parentheses string balanced. * * Approach: * - Count unmatched opening parentheses using `openC`. * - When a closing parenthesis is encountered: * - If an unmatched opening parenthesis exists, match it. * - Otherwise, count it as an unmatched closing parenthesis. * - The total unmatched opening and closing parentheses * represent the minimum number of insertions required. * * Time Complexity: O(n) * Space Complexity: O(1) * * @param s String containing only '(' and ')' * @return Minimum number of parentheses needed to balance the string */ public int minParentheses(String s) { int openC = 0; int closeC = 0; for (char ch : s.toCharArray()) { if (ch == '(') { openC++; } else if (openC != 0) { openC--; } else { closeC++; } } return openC + closeC; } }. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftTCSAdobeIBM, Company Tags, Amazon, Microsoft, TCS, Adobe, IBM. Review the synced source file for the implementation details.
