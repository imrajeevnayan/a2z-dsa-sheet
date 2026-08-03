# Smallest Divisible by 1 to n

- Platform: GeeksforGeeks
- Language: long long getSmallestDivNum( long long n ) { long long r{ 1 }; do r = r * n / __gcd( r, n ); while ( --n > 1 ); return r; } // 0.01+
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Mathematical, Related Articles, Lcm First N Natural Numbers, Smallest Number Divisible First N Numbers
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/smallest-divisible-number/1
- Synced: 2026-08-03T15:55:40.615Z

## Problem Description

Given a number n, find an integer denoting the smallest number evenly divisible by each number from 1 to n. Examples: Input: n = 3 Output: 6 Explanation: 6 is the smallest number divisible by 1, 2 and 3. Input: n = 6 Output: 60 Explanation: 60 is the smallest number divisible by all from 1 to 6. Constraints: 1 ≤ n ≤ 25

## Explanation

This solution was accepted on GeeksforGeeks using long long getSmallestDivNum( long long n ) { long long r{ 1 }; do r = r * n / __gcd( r, n ); while ( --n > 1 ); return r; } // 0.01+. The detected topics are Expected Complexities, Topic Tags, Mathematical, Related Articles, Lcm First N Natural Numbers, Smallest Number Divisible First N Numbers. Review the synced source file for the implementation details.
