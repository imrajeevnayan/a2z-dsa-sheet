# Strong Numbers

- Platform: GeeksforGeeks
- Language: class Solution { public int is_StrongNumber(int n) { int sum = 0, temp = n; while(temp > 0){ int d = temp % 10, f = 1; for(int i = 1; i <= d; i++) f *= i; sum += f; temp /= 10; } return sum == n ? 1 : 0; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Mathematical, factorial, Related Articles, Program To Check Strong Number
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/strong-numbers4336/1
- Synced: 2026-08-03T15:53:50.851Z

## Problem Description

A Strong Number is a number whose value is equal to the sum of the factorials of its digits. Given a positive integer n, determine whether it is a Strong Number. Return true if it is a Strong Number; otherwise, return false. Examples: Input: 145 Output: true Explanation: The sum of the factorials of its digits is: 1! + 4! + 5! = 1 + 24 + 120 = 145. Since the sum equals the original number, 145 is a Strong Number. Input: 5314 Output: false Explanation: The sum of the factorials of its digits is not equal to 5314. Therefore, it is not a Strong Number. Constraints: 1 ≤ n ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int is_StrongNumber(int n) { int sum = 0, temp = n; while(temp > 0){ int d = temp % 10, f = 1; for(int i = 1; i <= d; i++) f *= i; sum += f; temp /= 10; } return sum == n ? 1 : 0; } }. The detected topics are Expected Complexities, Topic Tags, Mathematical, factorial, Related Articles, Program To Check Strong Number. Review the synced source file for the implementation details.
