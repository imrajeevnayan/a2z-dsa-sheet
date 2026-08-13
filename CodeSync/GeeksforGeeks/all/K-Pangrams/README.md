# K-Pangrams

- Platform: GeeksforGeeks
- Language: class Solution { public: bool kPangram(string str, int k) { unordered_set<char> mySet; int totalAlphabets = 0; for (char ch : str) { if (ch >= 'a' && ch <= 'z') { mySet.insert(ch); totalAlphabets++; } } if (totalAlphabets < 26) return false; int missingChars = 26 - mySet.size(); return missingChars <= k; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags ZohoSnapdeal, Company Tags, Zoho, Snapdeal, Topic Tags, Hash, Strings
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/k-pangrams0909/1
- Synced: 2026-08-13T17:23:30.404Z

## Problem Description

Given a string str and an integer k, return true if the string can be changed into a pangram after at most k operations, else return false. A panagram consists of all 26 lowercase English alphabet caharaters at least once. The string may contain duplicate characters. A single operation consists of swapping an existing alphabetic character with any other lowercase alphabetic character or spaces. Note: A pangram is a sentence containing every letter in the English alphabet. Examples : Input: str = "the quick brown fox jumps over the lazy dog", k = 0 Output: true Explanation: the sentence contains all 26 characters and is already a pangram. Input: str = "aaaaaaaaaaaaaaaaaaaaaaaaaa", k = 25 Output: true Explanation: The word contains 26 instances of 'a'. Since only 25 operations are allowed. We can keep 1 instance and change all others to make str a pangram. Input: str = "a b c d e f g h i j k l m", k = 20 Output: false Explanation: Since there are only 13 alphabetic characters in this case, no amount of swapping can produce a panagram here. Constraints: 1 ≤ str.size() ≤ 105 0 ≤ k ≤ 50

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: bool kPangram(string str, int k) { unordered_set<char> mySet; int totalAlphabets = 0; for (char ch : str) { if (ch >= 'a' && ch <= 'z') { mySet.insert(ch); totalAlphabets++; } } if (totalAlphabets < 26) return false; int missingChars = 26 - mySet.size(); return missingChars <= k; } };. The detected topics are Expected Complexities, Company Tags ZohoSnapdeal, Company Tags, Zoho, Snapdeal, Topic Tags, Hash, Strings. Review the synced source file for the implementation details.
