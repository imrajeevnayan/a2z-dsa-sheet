# Using Hashing

- Platform: GeeksforGeeks
- Language: class Solution { public: bool areKAnagrams(string &s1, string &s2, int k) { // code here if(s1.length() != s2.length()) return false; vector<int> res(26,0); // This will be o(26) space which is equivalent to o(1) int count =0; for(int i=0; i<s1.length(); i++){ res[s1[i] - 'a']+=1; } for(int i=0; i<s2.length(); i++){ if(res[s2[i]-'a'] > 0){ res[s2[i]-'a']--; }else{ count++; } } return count <= k; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AccoliteAmazonMicrosoftGoogle, Company Tags, Accolite, Amazon, Microsoft, Google, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1
- Synced: 2026-08-06T07:03:46.859Z

## Problem Description

Given two strings s1 and s2 consisting of lowercase English alphabets, and an integer value k, return true if two strings are k-anagrams of each other. Otherwise, return false. Two strings are called k-anagrams if both of the below conditions are true. Both have same number of characters. Two strings can become anagram by changing at most k characters in a string. Example: Input: s1 = "fodr", s2 = "gork", k = 2 Output: true Explanation: We can change 'f' -> 'g' and 'd' -> 'k' in s1. Input: s1 = "geeks", s2 = "eggkf", k = 1 Output: false Explanation: We can update or modify only 1 value but there is a need of modifying 2 characters i.e. 'g' and 'f' in s2. Input: s1 = "adb", s2 = "fdab", k = 2 Output: false Explanation: Both the strings have different numbers of characters. Constraints: 1 ≤ s1.size(), s2.size() ≤ 105 1 ≤ k ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: bool areKAnagrams(string &s1, string &s2, int k) { // code here if(s1.length() != s2.length()) return false; vector<int> res(26,0); // This will be o(26) space which is equivalent to o(1) int count =0; for(int i=0; i<s1.length(); i++){ res[s1[i] - 'a']+=1; } for(int i=0; i<s2.length(); i++){ if(res[s2[i]-'a'] > 0){ res[s2[i]-'a']--; }else{ count++; } } return count <= k; } };. The detected topics are Expected Complexities, Company Tags AccoliteAmazonMicrosoftGoogle, Company Tags, Accolite, Amazon, Microsoft, Google, Topic Tags. Review the synced source file for the implementation details.
