# This is my code i know y its not running all logic are fine then also ...

- Platform: GeeksforGeeks
- Language: #using recursion instead of string building class Solution: def kthCharacter(self, m, n, k): return Solution.solve(bin(m)[2:], n, k-1) #0-based indexing is easier for k @staticmethod def solve(binstr, n, k): #if no more iterations, return k-th bit if n == 0: return int(binstr[k]) #else if k is even, result is the same as k/2-th bit from previous iteration #else if k is odd, the (k-1)/2-th bit from previous iteration gets flipped #use XOR 1 / XOR 0 to magically flip / not flip the result return Solution.solve(binstr, n-1, k // 2) ^ (k & 1)
- Difficulty: Unknown
- Topics: Company Tags Amazon, Company Tags, Amazon, Topic Tags, Strings, Related Interview Experiences, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-k-th-character-in-string3841/1
- Synced: 2026-08-06T07:09:33.367Z

## Problem Description

Given a decimal number m. Convert it into a binary string and apply n iterations. In each iteration, replace the character 0 with the string 01, and 1 with 10. Find the kth (1-based indexing) character in the string after the nth iteration. Example 1: Input: m = 5, n = 2, k = 5 output: 0 Explanation: Binary representation of m is "101", after one iteration binary representation will be "100110", and after second iteration binary representation will be "100101101001". Example 1: Input: m = 5, n = 2, k = 1 output: 1 Explanation: Binary representation of m is "101", after one iteration binary representation will be "100110", and after second iteration binary representation will be "100101101001". Your task: You do not need to read any input or print anything. The task is to complete the function kthCharacter(), which takes 3 integers m, n, and k as input and returns a character. Expected Time Complexity: O(2n) Expected Auxiliary Space: O(2n) Constraints: 0 ≤ m ≤ 50 0 ≤ n ≤ 10 k is a valid index

## Explanation

This solution was accepted on GeeksforGeeks using #using recursion instead of string building class Solution: def kthCharacter(self, m, n, k): return Solution.solve(bin(m)[2:], n, k-1) #0-based indexing is easier for k @staticmethod def solve(binstr, n, k): #if no more iterations, return k-th bit if n == 0: return int(binstr[k]) #else if k is even, result is the same as k/2-th bit from previous iteration #else if k is odd, the (k-1)/2-th bit from previous iteration gets flipped #use XOR 1 / XOR 0 to magically flip / not flip the result return Solution.solve(binstr, n-1, k // 2) ^ (k & 1). The detected topics are Company Tags Amazon, Company Tags, Amazon, Topic Tags, Strings, Related Interview Experiences, Related Articles. Review the synced source file for the implementation details.
