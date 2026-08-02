# Longest Balanced Substring

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, constructive algo, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/longest-even-length-substring--113837/1
- Synced: 2026-08-02T11:18:32.133Z

## Problem Description

Given a string s consisting only of digits, find the length of the longest substring of length 2k (where k ≥ 1) such that the sum of left k digits is equal to the sum of right k digits. If no such valid substring exists, return 0. Examples: Input: s = "1234123" Output: 4 Explanation: The valid substring is s[1..4] = "2341", where the first half "23" has sum 5 and the second half "41" also has sum 5. Therefore, the length of the longest valid substring is 4. Input: s = "0000000" Output: 6 Explanation: The valid substring is s[0..5] = "000000", where both halves "000" have a sum of 0. Therefore, the length of the longest valid substring is 6. Constraints: 1 ≤ s.size() ≤ 2000 s consists only of digits from '0' to '9'.

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, Strings, constructive algo, Related Articles. Review the synced source file for the implementation details.
