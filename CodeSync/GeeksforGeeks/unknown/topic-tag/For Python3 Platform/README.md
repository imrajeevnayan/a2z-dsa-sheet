# For Python3 Platform

- Platform: GeeksforGeeks
- Language: class Solution: def RedOrGreen(self, N, S): green = S.count("G") red = S.count("R") return min(red, green)
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Strings
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/red-or-green5711/1
- Synced: 2026-08-02T11:06:30.993Z

## Problem Description

Given a string s of length n, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green.Find the minimum number of characters need to be changed so that the entire string becomes of the same colour. Examples: Input: s = "RGRGR" Output: 2 Explanation: We need to change only the 2nd and 4th(1-index based) characters to 'R', so that the whole string becomes the same colour. Input: s = "GGGGGGR" Output: 1 Explanation: We need to change only the last character to 'G' to make the string same-coloured. Constraints: 1 ≤ |s| ≤ 105 s consists only of characters 'R' and 'G'.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def RedOrGreen(self, N, S): green = S.count("G") red = S.count("R") return min(red, green). The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Strings. Review the synced source file for the implementation details.
