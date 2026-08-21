# Easy Accepted Java Solution in O(n) :

- Platform: GeeksforGeeks
- Language: class Solution { public int vowelCount(String s) { // code here int n = s.length(); int ans = 1; Map<Character,Integer> map = new HashMap<>(); for(int i = 0; i < n; i++){ char ch = s.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ map.put(ch,map.getOrDefault(ch,0)+1); } } for(char ch : map.keySet()) ans *= map.get(ch); return ans*fact(map.size()); } private int fact(int n){ if(n < 3) return n; if(n == 3) return 6; if(n == 4) return 24; if(n == 5) return 120; return n; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Strings, Combinatorial, Mathematics, Related Articles, Unique Vowel Arrangements
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-unique-vowel-strings/1
- Synced: 2026-08-21T09:18:28.037Z

## Problem Description

You are given a lowercase string s, find the total distinct strings that can be formed using the following rules: Identify all unique vowels (a, e, i, o, u) present in the string. For each distinct vowel, choose exactly one of its occurrences from s. If a vowel appears multiple times, each occurrence represents a unique selection choice. Generate all possible permutations of the selected vowels. Each unique arrangement counts as a distinct string. Return the total number of such distinct strings. Examples: Input: s = "aeiou" Output: 120 Explanation: Each vowel appears once, so different strings are 5! = 120. Input: s = "ae" Output: 2 Explanation: Different strings are "ae" and "ea" Input: s = "aacidf" Output: 4 Explanation: Vowels in s are 'a' and 'i', Pick each 'a' with an 'i' and make two arrangements of all pairs "ai", "ia", "ai", "ia". Constraints: 1 ≤ s.size() ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int vowelCount(String s) { // code here int n = s.length(); int ans = 1; Map<Character,Integer> map = new HashMap<>(); for(int i = 0; i < n; i++){ char ch = s.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ map.put(ch,map.getOrDefault(ch,0)+1); } } for(char ch : map.keySet()) ans *= map.get(ch); return ans*fact(map.size()); } private int fact(int n){ if(n < 3) return n; if(n == 3) return 6; if(n == 4) return 24; if(n == 5) return 120; return n; } }. The detected topics are Expected Complexities, Topic Tags, Strings, Combinatorial, Mathematics, Related Articles, Unique Vowel Arrangements. Review the synced source file for the implementation details.
