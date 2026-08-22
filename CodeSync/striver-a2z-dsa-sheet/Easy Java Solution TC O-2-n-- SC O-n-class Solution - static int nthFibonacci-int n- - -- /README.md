# Easy Java Solution: TC: O(2^n), SC: O(n)class Solution { static int nthFibonacci(int n) { // code here if(n==0 || n==1) { return n; } int fnm1 = nthFibonacci(n-1); int fnm2 = nthFibonacci(n-2); return fnm1 + fnm2; }}#kmpro

- Platform: GeeksforGeeks
- Language: class Solution: def nthFibonacci(self, n): if(n==0 or n==1): return n else: return self.nthFibonacci(n-1) + self.nthFibonacci(n-2)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Recursion, Related Articles, Fibonacci Using Recursion
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/fibonacci-using-recursion/1
- Synced: 2026-08-22T15:01:07.280Z

## Problem Description

Given a number n, return the nth Fibonacci number. Note: If F(n) is nth fibonacci number then , F(n) = F(n-1) + F(n-2) ; where F(0) = 0 and F(1) = 1 Example: Input: n = 3 Output: 2 Explanation: The Fibonacci sequence starts as 0, 1, 1, 2, 3, 5... The 3rd Fibonacci number is 2. Input: n = 5 Output: 5 Explanation: The sequence is 0, 1, 1, 2, 3, 5... The 5th Fibonacci number is 5. Constraints: 1 ≤ n ≤ 20

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def nthFibonacci(self, n): if(n==0 or n==1): return n else: return self.nthFibonacci(n-1) + self.nthFibonacci(n-2). The detected topics are Expected Complexities, Topic Tags, Recursion, Related Articles, Fibonacci Using Recursion. Review the synced source file for the implementation details.
