# UNIQUE NUMBER - JAVA SOLUTION! OPTIMAL APPROACH!🧠 Intuition

- Platform: GeeksforGeeks
- Language: class Solution { public static ArrayList<Integer> uniqueNumbers(int L, int R) { ArrayList<Integer> result = new ArrayList<>(); for (int i=L; i<=R; i++) { if (hasUniqueDigits(i)) { result.add(i); } } return result; } private static boolean hasUniqueDigits(int n) { int[] digits = new int[10]; while(n>0) { int digit = n%10; if (digits[digit] > 0) { return false; } digits[digit]++; n = n/10; } return true; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Hash, Related Interview Experiences, Amazon Interview Experience Set 315
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/unique-numbers3019/1
- Synced: 2026-08-13T17:18:12.304Z

## Problem Description

Given two positive integers l and r, find all numbers in the range [l, r] whose digits are all distinct, with no digit repeated. return them in ascending order. Examples: Input: l = 10, r = 20 Output: [10, 12, 13, 14, 15, 16, 17, 18, 19, 20] Explanation: Every number from 10 to 20 has all distinct digits, except 11, since its digit 1 repeats. so 11 is excluded from the result. Input: l = 1, r = 9 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] Explanation: Every number from 1 to 9 is a single digit, so each one trivially has all distinct digits. none are excluded. Constraints: 1 ≤ l ≤ r ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static ArrayList<Integer> uniqueNumbers(int L, int R) { ArrayList<Integer> result = new ArrayList<>(); for (int i=L; i<=R; i++) { if (hasUniqueDigits(i)) { result.add(i); } } return result; } private static boolean hasUniqueDigits(int n) { int[] digits = new int[10]; while(n>0) { int digit = n%10; if (digits[digit] > 0) { return false; } digits[digit]++; n = n/10; } return true; } }. The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Hash, Related Interview Experiences, Amazon Interview Experience Set 315. Review the synced source file for the implementation details.
