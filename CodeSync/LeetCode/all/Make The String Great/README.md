# Make The String Great

- Platform: LeetCode
- Language: Problem List
- Difficulty: Easy
- Topics: String, Stack
- Runtime: 0 ms
- Memory: 43.73 MB
- Problem URL: https://leetcode.com/problems/make-the-string-great/submissions/2151918544/
- Synced: 2026-09-24T11:22:33.763Z

## Problem Description

Given a string s of lower and upper case English letters. A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where: 0 <= i <= s.length - 2 s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa. To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good. Return the string after making it good. The answer is guaranteed to be unique under the given constraints. Notice that an empty string is also good. Example 1: Input: s = "leEeetcode" Output: "leetcode" Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode". Example 2: Input: s = "abBAcC" Output: "" Explanation: We have many possible scenarios, and all lead to the same answer. For example: "abBAcC" --> "aAcC" --> "cC" --> "" "abBAcC" --> "abBA" --> "aA" --> "" Example 3: Input: s = "s" Output: "s" Constraints: 1 <= s.length <= 100 s contains only lower and upper case English letters.

## Explanation

This solution was accepted on LeetCode using Problem List. The detected topics are String, Stack. Review the synced source file for the implementation details.
