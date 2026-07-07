# Butterfly Pattern

- Platform: GeeksforGeeks
- Language: n = int(input()) max_stars = 2*n - 1 for i in range(1, n): stars = i*2 spaces = max_stars - stars print('*'*(stars//2),end = "") print(" "*spaces, end = "") print('*'*(stars//2)) print('*'*max_stars) for i in range(n-1,0,-1): stars = i*2 spaces = max_stars - stars print('*'*(stars//2),end = "") print(" "*spaces, end = "") print('*'*(stars//2))
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, pattern-printing, Algorithms, Related Articles, Program To Print Butterfly Pattern Star Pattern
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/butterfly-pattern/1
- Synced: 2026-07-07T12:08:44.311Z

## Problem Description

Given a number n. Print Butterfly Pattern with n lines. Examples: Input: n = 4 Output: * * ** ** *** *** ******* *** *** ** ** * * Input: n = 5 Output: * * ** ** *** *** **** **** ********* **** **** *** *** ** ** * * Constraints: 1 ≤ n ≤ 100

## Explanation

This solution was accepted on GeeksforGeeks using n = int(input()) max_stars = 2*n - 1 for i in range(1, n): stars = i*2 spaces = max_stars - stars print('*'*(stars//2),end = "") print(" "*spaces, end = "") print('*'*(stars//2)) print('*'*max_stars) for i in range(n-1,0,-1): stars = i*2 spaces = max_stars - stars print('*'*(stars//2),end = "") print(" "*spaces, end = "") print('*'*(stars//2)). The detected topics are Expected Complexities, Topic Tags, pattern-printing, Algorithms, Related Articles, Program To Print Butterfly Pattern Star Pattern. Review the synced source file for the implementation details.
