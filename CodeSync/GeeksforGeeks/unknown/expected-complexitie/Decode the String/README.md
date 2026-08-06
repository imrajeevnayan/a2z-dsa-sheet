# Decode the String

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags MicrosoftFacebook, Company Tags, Microsoft, Facebook, Topic Tags, Recursion, Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/decode-the-string2444/1
- Synced: 2026-08-06T06:55:02.351Z

## Problem Description

Given an encoded string s, decode it by expanding the pattern k[substring], where the substring inside brackets is written k times. k is guaranteed to be a positive integer, and encodedString contains only lowercase english alphabets. Return the final decoded string. Note: The test cases are generated so that the length of the output string will never exceed 105 . Examples: Input: s = "3[b2[ca]]" Output: "bcacabcacabcaca" Explanation: Inner substring “2[ca]” breakdown into “caca”. Now, new string becomes “3[bcaca]” Similarly “3[bcaca]” becomes “bcacabcacabcaca” which is final result. Input: s = "3[ab]" Output: "ababab" Explanation: The substring "ab" is repeated 3 times giving "ababab". Constraints: 1 ≤ |s| ≤ 105 1 ≤ k ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Company Tags MicrosoftFacebook, Company Tags, Microsoft, Facebook, Topic Tags, Recursion, Stack. Review the synced source file for the implementation details.
