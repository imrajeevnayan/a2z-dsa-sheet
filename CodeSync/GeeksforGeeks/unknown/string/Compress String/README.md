# Compress String

- Platform: GeeksforGeeks
- Language: string transform(string S) { // complete the function here for(char &x: S){ x=tolower(x); } string res=""; for(int i=0; i<S.length(); i++){ int count=1; while(i+1 < S.length() && S[i] == S[i+1]){ count++; i++; } res+=to_string(count); res+=S[i]; } return res; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Stack, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/easy-string2212/1
- Synced: 2026-07-22T12:39:41.040Z

## Problem Description

Given a string s, compress it by replacing each group of consecutive identical characters with the lowercase character followed by its frequency. Uppercase and lowercase versions of the same letter are treated as identical. If the same character appears again after a different character, it forms a new group. Examples: Input: s = "aaABBb" Output: "a3b3" Explanation: Treating uppercase and lowercase letters as the same, the string becomes "aaabbb". Thus, 'a' appears 3 times consecutively, followed by 'b' appearing 3 times. Input: s = "aaacca" Output: "a3c2a1" Explanation: The first three 'a' characters form one group, followed by two 'c' characters. The last 'a' forms a separate group since it is not consecutive with the first one. Constraints: 1 ≤ |s| ≤ 105 s contains only lowercase and uppercase characters.

## Explanation

This solution was accepted on GeeksforGeeks using string transform(string S) { // complete the function here for(char &x: S){ x=tolower(x); } string res=""; for(int i=0; i<S.length(); i++){ int count=1; while(i+1 < S.length() && S[i] == S[i+1]){ count++; i++; } res+=to_string(count); res+=S[i]; } return res; }. The detected topics are Expected Complexities, Topic Tags, Strings, Stack, Related Articles. Review the synced source file for the implementation details.
