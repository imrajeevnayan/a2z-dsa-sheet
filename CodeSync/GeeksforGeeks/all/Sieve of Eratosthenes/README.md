# Sieve of Eratosthenes

- Platform: GeeksforGeeks
- Language: class Solution: def sieve(self, n): # code here primes = [1] * (n+1) # 0 & 1 not a primes primes[0] = primes[1] = 0 # sieve - eliminate mulitiples of primes for i in range(2, int(n**0.5) + 1): if primes[i] == 1: for j in range(i*i, n+1, i): primes[j] = 0 # collect primes return [i for i in range(2, n+1) if primes[i] == 1]
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags VMWareMAQ SoftwareSAP Labs, Company Tags, VMWare, MAQ Software, SAP Labs, Topic Tags, Mathematical
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1
- Synced: 2026-06-30T09:04:32.269Z

## Problem Description

Given a positive integer n, calculate and return all primes less than or equal to n using the Sieve of Eratosthenes algorithm. Examples: Input: n = 10 Output: [2, 3, 5, 7] Explanation: Prime numbers less than equal to 10 are 2, 3, 5 and 7. Input: n = 35 Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31] Explanation: Prime numbers less than equal to 35 are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 and 31. Constraints: 1 ≤ n ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def sieve(self, n): # code here primes = [1] * (n+1) # 0 & 1 not a primes primes[0] = primes[1] = 0 # sieve - eliminate mulitiples of primes for i in range(2, int(n**0.5) + 1): if primes[i] == 1: for j in range(i*i, n+1, i): primes[j] = 0 # collect primes return [i for i in range(2, n+1) if primes[i] == 1]. The detected topics are Expected Complexities, Company Tags VMWareMAQ SoftwareSAP Labs, Company Tags, VMWare, MAQ Software, SAP Labs, Topic Tags, Mathematical. Review the synced source file for the implementation details.
