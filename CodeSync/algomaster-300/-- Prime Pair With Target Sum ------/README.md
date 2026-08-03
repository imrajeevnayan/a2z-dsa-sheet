# 🔍 Prime Pair With Target Sum || 🕵️‍♂️

- Platform: GeeksforGeeks
- Language: Function sieve(isPrime, n) // Mark 0 and 1 as not prime isPrime[0] = False isPrime[1] = False // Loop from 2 to square root of n For i from 2 to √n If isPrime[i] is True // Mark all multiples of i as not prime For j from i*i to n step by i isPrime[j] = False End For End If End For End Function Function getPrimes(n) // Create a boolean array to mark prime numbers isPrime = array of size (n + 1) initialized to True // Call the sieve function to mark non-prime numbers Call sieve(isPrime, n) // Loop from 2 to n/2 to find the prime pair For i from 2 to n/2 If isPrime[i] is True and isPrime[n - i] is True // Return the prime pair Return [i, n - i] End If End For // If no prime pair is found, return [-1, -1] Return [-1, -1] End Function
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags ZohoYahoo, Company Tags, Zoho, Yahoo, Topic Tags, number-theory, constructive algo
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-of-prime4751/1
- Synced: 2026-08-03T17:09:44.676Z

## Problem Description

Given a number n, determine whether it can be expressed as a + b, where both a and b are prime numbers. If such a pair exists, return the pair (a, b) such that a ≤ b. If multiple pairs are possible, return the pair with the smallest value of a. If no such pair exists, return [-1, -1]. Examples: Input: n = 10 Output: [3 7] Explanation: There are two possiblities 3, 7 & 5, 5 are both prime & their sum is 10, but we'll pick 3, 7 as 3 < 5. Input: n = 3 Output: [-1 -1] Explanation: There are no solutions to the number 3. Constraints: 2 <= n <= 106

## Explanation

This solution was accepted on GeeksforGeeks using Function sieve(isPrime, n) // Mark 0 and 1 as not prime isPrime[0] = False isPrime[1] = False // Loop from 2 to square root of n For i from 2 to √n If isPrime[i] is True // Mark all multiples of i as not prime For j from i*i to n step by i isPrime[j] = False End For End If End For End Function Function getPrimes(n) // Create a boolean array to mark prime numbers isPrime = array of size (n + 1) initialized to True // Call the sieve function to mark non-prime numbers Call sieve(isPrime, n) // Loop from 2 to n/2 to find the prime pair For i from 2 to n/2 If isPrime[i] is True and isPrime[n - i] is True // Return the prime pair Return [i, n - i] End If End For // If no prime pair is found, return [-1, -1] Return [-1, -1] End Function. The detected topics are Expected Complexities, Company Tags ZohoYahoo, Company Tags, Zoho, Yahoo, Topic Tags, number-theory, constructive algo. Review the synced source file for the implementation details.
