# 🔤 Sort Characters in a String | GeeksForGeeks

- Platform: GeeksforGeeks
- Language: string sort(string s) { map<char, int> mpp; string ans = ""; for (char c: s) mpp[c]++; for (auto i: mpp) { ans = ans.append(i.second, i.first); } return ans; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Sorting, Related Articles, Sort String Characters
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sort-a-string2943/1
- Synced: 2026-08-02T11:12:21.561Z

## Problem Description

Given a string consisting of lowercase letters, arrange all its letters in ascending order. Examples: Input: s = "edcab" Output: "abcde" Explanation: characters are in ascending order in "abcde". Input: s = "xzy" Output: "xyz" Explanation: characters are in ascending order in "xyz". Constraints: 1 ≤ |s| ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using string sort(string s) { map<char, int> mpp; string ans = ""; for (char c: s) mpp[c]++; for (auto i: mpp) { ans = ans.append(i.second, i.first); } return ans; }. The detected topics are Expected Complexities, Topic Tags, Strings, Sorting, Related Articles, Sort String Characters. Review the synced source file for the implementation details.
