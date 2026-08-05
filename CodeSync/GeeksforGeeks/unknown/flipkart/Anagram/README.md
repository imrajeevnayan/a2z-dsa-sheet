# Anagram

- Platform: GeeksforGeeks
- Language: class Solution { public static boolean areAnagrams(String s1, String s2) { // code here if (s1.length() != s2.length()) { return false; } char[] a = s1.toCharArray(); char[] b = s2.toCharArray(); Arrays.sort(a); Arrays.sort(b); if (Arrays.equals(a, b)) { return true; } else { return false; } } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Directi, Adobe, Google, Nagarro, Media.net
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/anagram-1587115620/1
- Synced: 2026-08-05T11:33:45.650Z

## Problem Description

Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not. Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order. Examples: Input: s1 = "geeks" s2 = "kseeg" Output: true Explanation: Both the string have same characters with same frequency. So, they are anagrams. Input: s1 = "allergy", s2 = "allergyy" Output: false Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. Input: s1 = "listen", s2 = "lists" Output: false Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams. Constraints: 1 ≤ s1.size(), s2.size() ≤ 105 s1, s2 consists of lowercase English letters.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static boolean areAnagrams(String s1, String s2) { // code here if (s1.length() != s2.length()) { return false; } char[] a = s1.toCharArray(); char[] b = s2.toCharArray(); Arrays.sort(a); Arrays.sort(b); if (Arrays.equals(a, b)) { return true; } else { return false; } } }. The detected topics are Expected Complexities, Company Tags, Flipkart, Directi, Adobe, Google, Nagarro, Media.net. Review the synced source file for the implementation details.
