# For Python3 Platform

- Platform: GeeksforGeeks
- Language: static int areAnagram(String S1, String S2) { // code here if (S1 == null || S2 == null || S1.length() != S2.length()) return 0; var alphabet = new int[26]; for (int i = 0; i < S1.length(); i++) { alphabet[S1.charAt(i) - 'a']++; alphabet[S2.charAt(i) - 'a']--; } for (int letter : alphabet) if (letter > 0) return 0; return 1; }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Java, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/java-anagram-strings3549/1
- Synced: 2026-07-07T19:18:21.681Z

## Problem Description

Given two strings S1 and S2 . Return "1" if both strings are anagrams otherwise return "0" . Note: An anagram of a string is another string with exactly the same quantity of each character in it, in any order. Example 1: Input: S1 = "cdbkdub" , S2 = "dsbkcsdn" Output: 0 Explanation: Length of S1 is not same as length of S2. Example 2: Input: S1 = "geeks" , S2 = "skgee" Output: 1 Explanation: S1 has the same quantity of each character in it as S2. Your Task: You don't need to read input or print anything. Your task is to complete the function areAnagram() which takes S1 and S2 as input and returns "1" if both strings are anagrams otherwise returns "0". Expected Time Complexity: O(n) Expected Auxiliary Space: O(K) ,Where K= Contstant Constraints: 1 <= |S1| <= 1000 1 <= |S2| <= 1000

## Explanation

This solution was accepted on GeeksforGeeks using static int areAnagram(String S1, String S2) { // code here if (S1 == null || S2 == null || S1.length() != S2.length()) return 0; var alphabet = new int[26]; for (int i = 0; i < S1.length(); i++) { alphabet[S1.charAt(i) - 'a']++; alphabet[S2.charAt(i) - 'a']--; } for (int letter : alphabet) if (letter > 0) return 0; return 1; }. The detected topics are Expected Complexities, Topic Tags, Strings, Java, Data Structures, Related Articles. Review the synced source file for the implementation details.
