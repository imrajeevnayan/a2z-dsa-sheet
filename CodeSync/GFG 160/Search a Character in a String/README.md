# Search a Character in a String

- Platform: GeeksforGeeks
- Language: class Solution { // Function to search for a character in the string public int searchCharacter(String s, char ch) { // code here for(int i=0;i<s.length();i++){ if(s.charAt(i)==ch){ return i; } } return -1; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Related Articles, Program To Search A Character In A String
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/search-a-character-in-a-string/1
- Synced: 2026-07-18T18:24:31.104Z

## Problem Description

Write a program to search for a given character in a string. If the character is found, print the index/position where it first appears in the string. If the character is not found, print -1. Examples: Input: s = "geeksforgeeks" , ch = 'k' Output: 3 Explanation: The character 'k' is present at index 3 and 11 in "geeksforgeeks" , so the first index is 3. Input: s = "geeksforgeeks" , ch = 'z' Output: -1 Explanation: The character 'z' is not present in "geeksforgeeks". Constraints: 1 ≤ |s| ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { // Function to search for a character in the string public int searchCharacter(String s, char ch) { // code here for(int i=0;i<s.length();i++){ if(s.charAt(i)==ch){ return i; } } return -1; } }. The detected topics are Expected Complexities, Topic Tags, Strings, Related Articles, Program To Search A Character In A String. Review the synced source file for the implementation details.
