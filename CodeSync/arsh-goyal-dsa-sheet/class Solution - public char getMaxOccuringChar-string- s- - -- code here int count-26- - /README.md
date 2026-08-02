# class Solution { public: char getMaxOccuringChar(string& s) { // code here int count[26] = {0}; for(int i=0 ; i<s.size() ; i++) { count[s[i]-'a']++; } int ansIndex = 0; int freq = count[0]; for(int i= 0 ; i<26 ; i++) { if(count[i]>freq) { freq = count[i]; ansIndex = i; } } char ans = 'a' +ansIndex; return ans; }};

- Platform: GeeksforGeeks
- Language: class Solution { public char getMaxOccuringChar(String s) { // code here int[] maxCount = new int[26]; for(int i=0; i<s.length(); i++){ maxCount[s.charAt(i)-'a']++; } int max = Integer.MIN_VALUE; char c = '#'; for(int i=0; i<26; i++){ if(maxCount[i]>max){ max = maxCount[i]; c = (char) ('a' + i); } } return c; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Flipkart, Company Tags, Flipkart, Topic Tags, Strings, Related Interview Experiences, Flipkart Interview Set 2 Sde 2
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
- Synced: 2026-08-02T11:43:00.066Z

## Problem Description

Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character. Examples: Input: s = "testsample" Output: 'e' Explanation: 'e' is the character which is having the highest frequency. Input: s = "output" Output: 't' Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller. Constraints: 1 ≤ |s| ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public char getMaxOccuringChar(String s) { // code here int[] maxCount = new int[26]; for(int i=0; i<s.length(); i++){ maxCount[s.charAt(i)-'a']++; } int max = Integer.MIN_VALUE; char c = '#'; for(int i=0; i<26; i++){ if(maxCount[i]>max){ max = maxCount[i]; c = (char) ('a' + i); } } return c; } }. The detected topics are Expected Complexities, Company Tags Flipkart, Company Tags, Flipkart, Topic Tags, Strings, Related Interview Experiences, Flipkart Interview Set 2 Sde 2. Review the synced source file for the implementation details.
