# Remove Consonants from a String (Java)

- Platform: GeeksforGeeks
- Language: class Solution: def removeConsonants(self, s): vowels = "aeiou" res = "" for i in s: if(i.lower() in vowels): res = res + i return res if res else "No Vowel"
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Searching, Strings, Data Structures, Algorithms, Related Articles, Program To Remove Consonants From A String
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/c-program-to-remove-consonants-from-a-string1945/1
- Synced: 2026-06-29T18:05:11.582Z

## Problem Description

Given a string s, remove all consonants and return the modified string containing only vowels. If the string does not contain any vowels, return an empty string. Examples: Input: s = "abEkipo" Output: "aEio" Explanation: a, E, i, o are only vowels in the string. Input: s = "rrty" Output: "" Explanation: There are no vowels. Constraints 1 ≤ n ≤ 105, n is length of the string The string should consist of only alphabets.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def removeConsonants(self, s): vowels = "aeiou" res = "" for i in s: if(i.lower() in vowels): res = res + i return res if res else "No Vowel". The detected topics are Expected Complexities, Topic Tags, Searching, Strings, Data Structures, Algorithms, Related Articles, Program To Remove Consonants From A String. Review the synced source file for the implementation details.
