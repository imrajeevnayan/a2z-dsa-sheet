# Palindrome with minimum sum

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Topic Tags Related Articles, Topic Tags, Strings, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/palindrome-with-minimum-sum--170648/1
- Synced: 2026-07-12T11:11:21.869Z

## Problem Description

Given a string, S.The string can contain small case English letters or '?'. You can replace '?' with any small English letter. Now if it is possible to make the string S a palindrome after replacing all '?' then find the palindromic string with a minimum ascii sum of the absolute difference of adjacent characters. Otherwise, return -1. Example 1: Input: S = a???c??c???? Output: 4 Explanation: We can see that we can make the string palindrome. Now to get minimum ascii sum we should replace all the '?' between 'a' and 'c' with 'b' and all the '?' between two 'c' with 'c'. So after replacing all the '?' the string: abbbccccbbba. The sum of differences of adjacent characters is 4. Example 2: Input: S = a???c??c???c Output: -1 Explanation: It is not possible to make the string palindrome. Your Task: You don't need to read input or print anything. Your task is to complete the function minimumSum() which takes a string S input parameter and returns an integer denoting the sum of differences of adjacent characters. If it is not possible to make string palindrome, return -1. Expected Time Complexity: O(N) Expected Auxiliary Space: O(1) Constraints: 1 <= |S| <= 105

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Topic Tags Related Articles, Topic Tags, Strings, Data Structures, Related Articles. Review the synced source file for the implementation details.
