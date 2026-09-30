/*
 * Platform: LeetCode
 * Problem: 1255. Maximum Score Words Formed by Letters
 * URL: https://leetcode.com/problems/maximum-score-words-formed-by-letters/description/?envType=problem-list-v2&envId=bit-manipulation
 * Language: C
 * Difficulty: Hard
 * Topics: Array, Hash Table, String, Dynamic Programming, Backtracking, Bit Manipulation, Counting, Bitmask
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-30T19:17:05.812Z
 */

Input: words = ["dog","cat","dad","good"], letters = ["a","a","c","d","d","d","g","o","o"], score = [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
Output: 23
Explanation:
Score  a=1, c=9, d=5, g=3, o=2
Given letters, we can form the words "dad" (5+1+5) and "good" (3+2+2+5) with a score of 23.
Words "dad" and "dog" only get a score of 21.
