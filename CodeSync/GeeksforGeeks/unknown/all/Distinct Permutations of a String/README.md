# Distinct Permutations of a String

- Platform: GeeksforGeeks
- Language: class Solution { public ArrayList<String> findPermutation(String s) { // Code here Set<String> ans = new HashSet<>(); genPer(s, "", ans); return new ArrayList<>(ans); } public void genPer(String s, String a, Set<String> result) { if (s.isEmpty()) { result.add(a); return; } for (int i = 0; i < s.length(); i++) { char ch = s.charAt(i); String nq = s.substring(0,i) + s.substring(i + 1); genPer(nq, a + ch, result); } } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Zoho, Accolite, Amazon, Microsoft, OYO Rooms, Samsung
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
- Synced: 2026-07-12T18:41:34.349Z

## Problem Description

Given a string s, which may contain duplicate characters, your task is to generate and return an array of all unique permutations of the string. You can return your answer in any order. Examples: Input: s = "ABC" Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"] Explanation: Given string ABC has 6 unique permutations. Input: s = "ABSG" Output: ["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA", "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA", "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"] Explanation: Given string ABSG has 24 unique permutations. Input: s = "AAA" Output: ["AAA"] Explanation: No other unique permutations can be formed as all the characters are same. Constraints: 1 <= s.size() <= 9 s contains only Uppercase english alphabets

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public ArrayList<String> findPermutation(String s) { // Code here Set<String> ans = new HashSet<>(); genPer(s, "", ans); return new ArrayList<>(ans); } public void genPer(String s, String a, Set<String> result) { if (s.isEmpty()) { result.add(a); return; } for (int i = 0; i < s.length(); i++) { char ch = s.charAt(i); String nq = s.substring(0,i) + s.substring(i + 1); genPer(nq, a + ch, result); } } }. The detected topics are Expected Complexities, Company Tags, Zoho, Accolite, Amazon, Microsoft, OYO Rooms, Samsung. Review the synced source file for the implementation details.
