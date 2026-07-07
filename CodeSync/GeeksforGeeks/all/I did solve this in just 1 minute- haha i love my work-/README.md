# I did solve this in just 1 minute! haha i love my work!

- Platform: GeeksforGeeks
- Language: // User function Template for Java class Solution { String removeSpecialCharacter(String s) { // code here StringBuilder sb = new StringBuilder(); for ( char c : s.toCharArray() ) { if ( Character.isLetter(c) ) { sb.append(c); } } if ( sb.length() == 0 ) return "-1"; return sb.toString(); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Data Structures, Related Articles, Remove Characters Alphabets String
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/remove-all-characters-other-than-alphabets4923/1
- Synced: 2026-07-07T16:54:06.259Z

## Problem Description

Given a string s, remove all characters except lowercase and uppercase alphabets (a-z and A-Z) and return the resulting string. If no alphabetic characters remain after removal, return an empty string. Examples: Input: s = "$Gee*k;s..fo, r'Ge^eks?" Output: "GeeksforGeeks" Explanation: All characters other than alphabets are removed from the string "$Gee*k;s..fo, r'Ge^eks?", resulting in "GeeksforGeeks". Input: s = "{{{}}> *& ^%*)" Output: "" Explanation: The string "{{{}}> *& ^%*)" does not contain any alphabetic characters, so after removing all non-alphabet characters, the resulting string is empty. Constraints: 1 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for Java class Solution { String removeSpecialCharacter(String s) { // code here StringBuilder sb = new StringBuilder(); for ( char c : s.toCharArray() ) { if ( Character.isLetter(c) ) { sb.append(c); } } if ( sb.length() == 0 ) return "-1"; return sb.toString(); } }. The detected topics are Expected Complexities, Topic Tags, Strings, Data Structures, Related Articles, Remove Characters Alphabets String. Review the synced source file for the implementation details.
