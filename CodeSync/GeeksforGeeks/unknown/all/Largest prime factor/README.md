# Largest prime factor

- Platform: GeeksforGeeks
- Language: def largestPrimeFactor(self, n): largest = 1 while n % 2 == 0: largest = 2 n //= 2 for i in range(3, int(n**0.5) + 1, 2): while n % i == 0: largest = i n //= i if n > 1: largest = n return largest
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Yahoo, Company Tags, Yahoo, Topic Tags, Mathematical, Prime Number, sieve
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/largest-prime-factor2601/1
- Synced: 2026-06-28T12:20:27.723Z

## Problem Description

Given a number n, your task is to find the largest prime factor of n. Examples: Input: n = 5 Output: 5 Explanation: The prime factorization of 5 is just 5. Therefore, the largest prime factor is 5. Input: n = 24 Output: 3 Explanation: The prime factorization of 24 is 23×3. Among the prime factors (2, 3), the largest is 3. Input: n = 13195 Output: 29 Explanation: The prime factorization of 13195 is 5×7×13×29. The largest prime factor is 29. Constraints: 2 <= n <= 109

## Explanation

This solution was accepted on GeeksforGeeks using def largestPrimeFactor(self, n): largest = 1 while n % 2 == 0: largest = 2 n //= 2 for i in range(3, int(n**0.5) + 1, 2): while n % i == 0: largest = i n //= i if n > 1: largest = n return largest. The detected topics are Expected Complexities, Company Tags Yahoo, Company Tags, Yahoo, Topic Tags, Mathematical, Prime Number, sieve. Review the synced source file for the implementation details.
