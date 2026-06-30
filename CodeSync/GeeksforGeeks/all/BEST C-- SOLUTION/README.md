# BEST C++ SOLUTION

- Platform: GeeksforGeeks
- Language: class Solution { public: string maximumFrequency(string& s) { vector<string> words; string temp = ""; for (char c : s) { if (c == ' ') { if (!temp.empty()) { words.push_back(temp); temp = ""; } } else { temp += c; } } if (!temp.empty()) { words.push_back(temp); } unordered_map<string, int> mp; for (string w : words) { mp[w]++; } int maxFreq = 0; string ans = ""; for (string w : words) { if (mp[w] > maxFreq) { maxFreq = mp[w]; ans = w; } } return ans + " " + to_string(maxFreq); } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonAdobeMicrosoftCitrix, Company Tags, Amazon, Adobe, Microsoft, Citrix, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/word-with-maximum-frequency0120/1
- Synced: 2026-06-30T12:08:29.182Z

## Problem Description

You are given a string s that is made up of words separated by spaces. Your task is to find the word with the highest frequency, i.e. it appears the most times in the sentence. If multiple words have maximum frequency, then print the word that occurs first in the sentence. Examples: Input: s = "the devil in the sky" Output: "the 2" Explanation: The frequency of "the" is 2, so we return "the" and its frequency "2" i.e., "the 2" Input: s = "this is not right" Output: "this 1" Explanation: Every word has the frequency of "1", so we return "this 1" as this occurs first in the sentence. Constraints: 1 ≤ s.size() ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: string maximumFrequency(string& s) { vector<string> words; string temp = ""; for (char c : s) { if (c == ' ') { if (!temp.empty()) { words.push_back(temp); temp = ""; } } else { temp += c; } } if (!temp.empty()) { words.push_back(temp); } unordered_map<string, int> mp; for (string w : words) { mp[w]++; } int maxFreq = 0; string ans = ""; for (string w : words) { if (mp[w] > maxFreq) { maxFreq = mp[w]; ans = w; } } return ans + " " + to_string(maxFreq); } };. The detected topics are Expected Complexities, Company Tags AmazonAdobeMicrosoftCitrix, Company Tags, Amazon, Adobe, Microsoft, Citrix, Topic Tags. Review the synced source file for the implementation details.
