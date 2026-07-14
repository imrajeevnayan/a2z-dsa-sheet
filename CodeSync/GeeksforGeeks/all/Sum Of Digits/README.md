# Sum Of Digits

- Platform: GeeksforGeeks
- Language: class Solution { static int sumOfDigits(int n) { // code here int sum = 0; while(n != 0){ sum += n % 10; n = n / 10; } return sum; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Drishti-Soft, Company Tags, Drishti-Soft, Topic Tags, number-theory, Related Articles, Program For Sum Of The Digits Of A Given Number
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
- Synced: 2026-07-14T15:21:58.351Z

## Problem Description

Given a positive number n. Find the sum of all the digits of n. Examples: Input: n = 687 Output: 21 Explanation: Sum of 687's digits: 6 + 8 + 7 = 21 Input: n = 12 Output 3 Explanation: Sum of 12's digits: 1 + 2 = 3 Constraints: 1 <= n <= 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { static int sumOfDigits(int n) { // code here int sum = 0; while(n != 0){ sum += n % 10; n = n / 10; } return sum; } }. The detected topics are Expected Complexities, Company Tags Drishti-Soft, Company Tags, Drishti-Soft, Topic Tags, number-theory, Related Articles, Program For Sum Of The Digits Of A Given Number. Review the synced source file for the implementation details.
