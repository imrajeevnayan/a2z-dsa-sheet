# neoNitya

- Platform: Coding Ninjas (Code360)
- Language: import java.util.* ; import java.io.*; public class Solution { public static boolean checkUnique(String s){ // Write your code here. char[] ch = s.toCharArray(); int[] ans = new int[256]; for(int i = 0; i < ch.length; i++) { ans[ch[i]]++; if(ans[ch[i]]>1) return false; } return true; } }
- Difficulty: Hard
- Topics: Interview problems
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.naukri.com/code360/profile/neoNitya
- Synced: 2026-06-19T03:56:23.811Z

## Problem Description

import java.util.* ; import java.io.*; public class Solution { public static boolean checkUnique(String s){ // Write your code here. char[] ch = s.toCharArray(); int[] ans = new int[256]; for(int i = 0; i < ch.length; i++) { ans[ch[i]]++; if(ans[ch[i]]>1) return false; } return true; } }

## Explanation

This solution was accepted on Coding Ninjas (Code360) using import java.util.* ; import java.io.*; public class Solution { public static boolean checkUnique(String s){ // Write your code here. char[] ch = s.toCharArray(); int[] ans = new int[256]; for(int i = 0; i < ch.length; i++) { ans[ch[i]]++; if(ans[ch[i]]>1) return false; } return true; } }. The detected topics are Interview problems. Review the synced source file for the implementation details.
