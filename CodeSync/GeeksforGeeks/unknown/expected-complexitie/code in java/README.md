# code in java

- Platform: GeeksforGeeks
- Language: class Sol { int getCount(String s, int n) { Map<Character, Integer> map = new HashMap<>(); int count = 0; for (int i=0; i<s.length(); i++) { Character c = s.charAt(i); if (i < s.length()-1 && c == s.charAt(i+1)) { continue; } int charCount = map.getOrDefault(c, 0); charCount++; map.put(c, charCount); } for (int frequency : map.values()) { if (frequency == n) { count++; } } return count; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags ZohoAmazon, Company Tags, Zoho, Amazon, Topic Tags, Hash, Strings
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-the-characters1821/1
- Synced: 2026-08-09T17:24:00.387Z

## Problem Description

Given a string s. Count the characters that have ‘k’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence. Examples: Input: s = "abc", k = 1 Output: 3 Explanation: 'a', 'b' and 'c' all have 1 occurrence. Input: s = "geeksforgeeks", k = 2 Output: 4 Explanation: 'g', 'e', 'k' and 's' have 2 occurrences. Input: s = "aaaaa", k = 2 Output: 0 Explanation: There is only one group occurrence of 'a' Constraints: 1<=s.length()<=105 1<=k<=103

## Explanation

This solution was accepted on GeeksforGeeks using class Sol { int getCount(String s, int n) { Map<Character, Integer> map = new HashMap<>(); int count = 0; for (int i=0; i<s.length(); i++) { Character c = s.charAt(i); if (i < s.length()-1 && c == s.charAt(i+1)) { continue; } int charCount = map.getOrDefault(c, 0); charCount++; map.put(c, charCount); } for (int frequency : map.values()) { if (frequency == n) { count++; } } return count; } }. The detected topics are Expected Complexities, Company Tags ZohoAmazon, Company Tags, Zoho, Amazon, Topic Tags, Hash, Strings. Review the synced source file for the implementation details.
