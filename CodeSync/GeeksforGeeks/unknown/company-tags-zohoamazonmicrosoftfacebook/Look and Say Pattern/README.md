# Look and Say Pattern

- Platform: GeeksforGeeks
- Language: class Solution { public String countAndSay(int n) { // code here if(n==1) return "1"; String s=countAndSay(n-1); //Preprocessing String res=""; for(int i=0;i<s.length();i++) { int count=1; char ch=s.charAt(i); while(i<s.length()-1 && ch==s.charAt(i+1)) { count++; i++; } res+= Integer.toString(count)+Character.toString(ch); } return res; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags ZohoAmazonMicrosoftFacebook, Company Tags, Zoho, Amazon, Microsoft, Facebook, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/decode-the-pattern1138/1
- Synced: 2026-08-21T09:16:23.429Z

## Problem Description

Given an integer n. Return the nth row of the following look-and-say pattern. 1 11 21 1211 111221 Look-and-Say Pattern: To generate a member of the sequence from the previous member, read off the digits of the previous member, counting the number of digits in groups of the same digit. For example: 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read off as "one 2, then one 1" or 1211. 1211 is read off as "one 1, one 2, then two 1s" or 111221. 111221 is read off as "three 1s, two 2s, then one 1" or 312211. Examples: Input: n = 5 Output: 111221 Explanation: The 5th row of the given pattern will be 111221. Input: n = 3 Output: 21 Explanation: The 3rd row of the given pattern will be 21. Constraints: 1 ≤ n ≤ 30

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public String countAndSay(int n) { // code here if(n==1) return "1"; String s=countAndSay(n-1); //Preprocessing String res=""; for(int i=0;i<s.length();i++) { int count=1; char ch=s.charAt(i); while(i<s.length()-1 && ch==s.charAt(i+1)) { count++; i++; } res+= Integer.toString(count)+Character.toString(ch); } return res; } }. The detected topics are Expected Complexities, Company Tags ZohoAmazonMicrosoftFacebook, Company Tags, Zoho, Amazon, Microsoft, Facebook, Topic Tags. Review the synced source file for the implementation details.
