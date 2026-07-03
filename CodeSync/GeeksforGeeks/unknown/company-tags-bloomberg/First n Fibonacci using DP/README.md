# First n Fibonacci using DP

- Platform: GeeksforGeeks
- Language: class Solution: def series(self, n): fibonacci_series = [0, 1] # Initialize the series with first two terms. # Generate the series up to the nth term. for _ in range(n - 1): next_term = (fibonacci_series[-1] + fibonacci_series[-2]) % (10**9 + 7) fibonacci_series.append(next_term) return fibonacci_series
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Bloomberg, Company Tags, Bloomberg, Topic Tags, Recursion, Fibonacci, Algorithms
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1
- Synced: 2026-07-03T09:09:57.112Z

## Problem Description

You are given an integer n, return the fibonacci series till the nth(0-based indexing) term. Since the terms can become very large return the terms modulo 109+7. Examples: Input: n = 5 Output: [0, 1, 1, 2, 3, 5] Input: n = 10 Output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55] Constraint: 1 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def series(self, n): fibonacci_series = [0, 1] # Initialize the series with first two terms. # Generate the series up to the nth term. for _ in range(n - 1): next_term = (fibonacci_series[-1] + fibonacci_series[-2]) % (10**9 + 7) fibonacci_series.append(next_term) return fibonacci_series. The detected topics are Expected Complexities, Company Tags Bloomberg, Company Tags, Bloomberg, Topic Tags, Recursion, Fibonacci, Algorithms. Review the synced source file for the implementation details.
