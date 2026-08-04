# Removing K Consecutive Identical

- Platform: GeeksforGeeks
- Language: class Solution { public static String reduced_String(int k, String s) { // Your code goes here if (k == 1) return ""; Stack<Character> charStack = new Stack<>(); Stack<Integer> countStack = new Stack<>(); for (int i = 0; i < s.length(); i++) { char curr = s.charAt(i); if (!charStack.isEmpty() && charStack.peek() == curr) { countStack.push(countStack.peek() +1); } else { countStack.push(1); } charStack.push(curr); if (countStack.peek() == k) { for (int j = 0; j < k; j++) { charStack.pop(); countStack.pop(); } } } StringBuilder sb = new StringBuilder(); while (!charStack.isEmpty()) { sb.append(charStack.pop()); } return sb.reverse().toString(); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Strings, Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/restrictive-candy-crush--141631/1
- Synced: 2026-08-04T16:44:32.549Z

## Problem Description

Given a string s and an integer k, the task is to reduce the string by removing k consecutive identical characters. The removal operation can be performed any number of times until it is no longer possible. Examples: Input: k = 2, s = "geeksforgeeks" Output: gksforgks Explanation: Modified String after each step: "geeksforgeeks" -> "gksforgks" Input: k = 2, s = "geegsforgeeeks" Output: sforgeks Explanation: Modified String after each step: "geegsforgeeeks" -> "ggsforgeks" -> "sforgeks" Input: k = 2, s = "abbac" Output: c Constraints: 1 ≤ s.size() ≤ 105 1 ≤ k ≤ |s|

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static String reduced_String(int k, String s) { // Your code goes here if (k == 1) return ""; Stack<Character> charStack = new Stack<>(); Stack<Integer> countStack = new Stack<>(); for (int i = 0; i < s.length(); i++) { char curr = s.charAt(i); if (!charStack.isEmpty() && charStack.peek() == curr) { countStack.push(countStack.peek() +1); } else { countStack.push(1); } charStack.push(curr); if (countStack.peek() == k) { for (int j = 0; j < k; j++) { charStack.pop(); countStack.pop(); } } } StringBuilder sb = new StringBuilder(); while (!charStack.isEmpty()) { sb.append(charStack.pop()); } return sb.reverse().toString(); } }. The detected topics are Expected Complexities, Company Tags AmazonMicrosoft, Company Tags, Amazon, Microsoft, Topic Tags, Strings, Stack. Review the synced source file for the implementation details.
