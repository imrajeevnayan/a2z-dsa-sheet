# Extract Integers from String

- Platform: GeeksforGeeks
- Language: // User function Template for Java import java.util.*; class Solution { ArrayList<String> extractIntegerWords(String s) { ArrayList<String> res = new ArrayList<>(); String temp=""; for(int i=0;i<s.length();i++){ char ch=s.charAt(i); if(Character.isDigit(ch)){ temp+=ch; }else{ if(!temp.isEmpty()){ res.add(temp); temp=""; } } } if(!temp.isEmpty()){ res.add(temp); } return res; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, two-pointer-algorithm, Strings, Related Articles, Extract All Integers From A Given String
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/extract-the-integers4428/1
- Synced: 2026-09-14T11:06:05.603Z

## Problem Description

Given a string s consisting of lowercase letters, uppercase letters, digits, and special characters, extract all the integers present in the string and return them in the order they appear. If no integers are present in the string, return an empty array. Examples: Input: s = "1: Geeks for geeks, 2: geeksfor geeks, 3: forGeeksgeeks 56" Output: [1, 2, 3, 56] Explanation: 1, 2, 3, 56 are the integers present in s. Input: s = "geeksforgeeks" Output: [] Explanation: No integers present in the string. Constraints: 1 ≤ n ≤ 105, n is size of the string.

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for Java import java.util.*; class Solution { ArrayList<String> extractIntegerWords(String s) { ArrayList<String> res = new ArrayList<>(); String temp=""; for(int i=0;i<s.length();i++){ char ch=s.charAt(i); if(Character.isDigit(ch)){ temp+=ch; }else{ if(!temp.isEmpty()){ res.add(temp); temp=""; } } } if(!temp.isEmpty()){ res.add(temp); } return res; } }. The detected topics are Expected Complexities, Topic Tags, two-pointer-algorithm, Strings, Related Articles, Extract All Integers From A Given String. Review the synced source file for the implementation details.
