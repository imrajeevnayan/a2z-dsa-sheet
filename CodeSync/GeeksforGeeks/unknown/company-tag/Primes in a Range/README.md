# Primes in a Range

- Platform: GeeksforGeeks
- Language: **JAVA** class Solution { ArrayList<Integer> primeRange(int M, int N) { ArrayList<Integer> al = new ArrayList<>(); // Create a boolean array for marking non-prime numbers boolean arr[] = new boolean[N + 1]; // Mark 1 as non-prime explicitly arr[1] = true; // Implement Sieve of Eratosthenes for (int i = 2; i<=Math.sqrt(N); i++) { if (!arr[i]) { // If i is prime for (int j = i * i; j <= N; j += i) { arr[j] = true; // Mark multiples of i as non-prime } } } // Collect primes in the range [M, N] for (int i = M; i <= N; i++) { if (!arr[i]) { al.add(i); } } return al; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags VMWareQualcommGEWalmart, Company Tags, VMWare, Qualcomm, GE, Walmart, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1
- Synced: 2026-06-28T12:22:22.404Z

## Problem Description

Given two integers l and r, find and return all prime numbers in the range [l, r] (inclusive). Examples: Input: l = 1, r = 10 Output: [2, 3, 5, 7] Explanation: The prime numbers between 1 and 10 are 2, 3, 5 and 7. Input: l = 2, r = 5 Output: [2, 3, 5] Explanation: The prime numbers between 2 and 5 are 2, 3 and 5. Constraints: 1≤ l ≤ r ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using **JAVA** class Solution { ArrayList<Integer> primeRange(int M, int N) { ArrayList<Integer> al = new ArrayList<>(); // Create a boolean array for marking non-prime numbers boolean arr[] = new boolean[N + 1]; // Mark 1 as non-prime explicitly arr[1] = true; // Implement Sieve of Eratosthenes for (int i = 2; i<=Math.sqrt(N); i++) { if (!arr[i]) { // If i is prime for (int j = i * i; j <= N; j += i) { arr[j] = true; // Mark multiples of i as non-prime } } } // Collect primes in the range [M, N] for (int i = M; i <= N; i++) { if (!arr[i]) { al.add(i); } } return al; } }. The detected topics are Expected Complexities, Company Tags VMWareQualcommGEWalmart, Company Tags, VMWare, Qualcomm, GE, Walmart, Topic Tags. Review the synced source file for the implementation details.
