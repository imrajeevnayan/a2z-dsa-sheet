# Pyramid Pattern

- Platform: GeeksforGeeks
- Language: class Solution { static void printPyramid(int n) { StringBuilder result = new StringBuilder(); int blankSpaces = n - 1; for(int i = 0; i < n; i++) { result.append(setCharacters(blankSpaces, ' ')); result.append(setCharacters((n * 2 - 1) - blankSpaces * 2, '*')); result.append("\n"); blankSpaces--; } System.out.print(result); } static String setCharacters(int charsNumber, char character) { StringBuilder result = new StringBuilder(); for(int i = 0; i < charsNumber; i++) { result.append(character); } return result.toString(); } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, pattern-printing, Algorithms, Related Articles, Printing Pyramid Patterns
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/pyramid-patterns/1
- Synced: 2026-07-07T12:33:58.272Z

## Problem Description

Given a number n, print pyramid pattern with n lines. Examples: Input: n = 4 Output: * *** ***** ******* Input: n = 5 Output: * *** ***** ******* ********* Constraints: 1 ≤ n ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { static void printPyramid(int n) { StringBuilder result = new StringBuilder(); int blankSpaces = n - 1; for(int i = 0; i < n; i++) { result.append(setCharacters(blankSpaces, ' ')); result.append(setCharacters((n * 2 - 1) - blankSpaces * 2, '*')); result.append("\n"); blankSpaces--; } System.out.print(result); } static String setCharacters(int charsNumber, char character) { StringBuilder result = new StringBuilder(); for(int i = 0; i < charsNumber; i++) { result.append(character); } return result.toString(); } }. The detected topics are Expected Complexities, Topic Tags, pattern-printing, Algorithms, Related Articles, Printing Pyramid Patterns. Review the synced source file for the implementation details.
