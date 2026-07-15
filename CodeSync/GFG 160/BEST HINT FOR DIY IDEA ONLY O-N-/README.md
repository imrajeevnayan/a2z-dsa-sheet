# BEST HINT FOR DIY || IDEA ONLY O(N)

- Platform: GeeksforGeeks
- Language: if N <= 0: return 0 div_sum = 0 for i in range(1, N + 1): k = N // i div_sum += i * k return div_sum
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Mathematical, Algorithms, Related Articles, Sum Divisors 1 N
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
- Synced: 2026-07-15T05:19:33.504Z

## Problem Description

Given a positive integer n, The task is to find the value of Σi F(i) where i is from 1 to n and function F(i) is defined as the sum of all divisors of i. Examples: Input: n = 4 Output: 15 Explanation: F(1) = 1 F(2) = 1 + 2 = 3 F(3) = 1 + 3 = 4 F(4) = 1 + 2 + 4 = 7 So, F(1) + F(2) + F(3) + F(4) = 1 + 3 + 4 + 7 = 15 Input: n = 5 Output: 21 Explanation: F(1) = 1 F(2) = 1 + 2 = 3 F(3) = 1 + 3 = 4 F(4) = 1 + 2 + 4 = 7 F(5) = 1 + 5 = 6 So, F(1) + F(2) + F(3) + F(4) + F(5) = 1 + 3 + 4 + 7 + 6 = 21 Input: n = 1 Output: 1 Explanation: F(1) = 1 So, F(1) = 1 Constraints: 1 <= n <= 105

## Explanation

This solution was accepted on GeeksforGeeks using if N <= 0: return 0 div_sum = 0 for i in range(1, N + 1): k = N // i div_sum += i * k return div_sum. The detected topics are Expected Complexities, Topic Tags, Mathematical, Algorithms, Related Articles, Sum Divisors 1 N. Review the synced source file for the implementation details.
