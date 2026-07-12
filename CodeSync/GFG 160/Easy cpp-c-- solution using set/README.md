# Easy cpp/c++ solution using set

- Platform: GeeksforGeeks
- Language: class Solution { public: string removeChars(string str1, string str2) { unordered_set<char> h2; for(auto x : str2){ h2.insert(x); } string ans = ""; for(auto x : str1){ if(h2.find(x) == h2.end()){ ans += x; } else{ continue; } } return ans; } };
- Difficulty: Unknown
- Topics: Company Tags ZohoAmazon, Company Tags, Zoho, Amazon, Topic Tags, Strings, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/remove-character3815/1
- Synced: 2026-07-12T11:14:10.504Z

## Problem Description

Given two strings str1 and str2, remove those characters from the first string(str1) which are present in the second string(str2). Both the strings are different and contain only lowercase characters. NOTE: Size of the first string is always greater than the size of the second string( |str1| > |str2|). Example 1: Input: str1 = "computer", str2= "cat" Output: "ompuer" Explanation: After removing characters(c, a, t) from string1 we get "ompuer". Example 2: Input: str1 = "occurrence", str2 = "car" Output: "ouene" Explanation: After removing characters (c, a, r) from string1 we get "ouene". Constraints: 1 <= |Str1| , |Str2| <= 50

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: string removeChars(string str1, string str2) { unordered_set<char> h2; for(auto x : str2){ h2.insert(x); } string ans = ""; for(auto x : str1){ if(h2.find(x) == h2.end()){ ans += x; } else{ continue; } } return ans; } };. The detected topics are Company Tags ZohoAmazon, Company Tags, Zoho, Amazon, Topic Tags, Strings, Data Structures, Related Articles. Review the synced source file for the implementation details.
