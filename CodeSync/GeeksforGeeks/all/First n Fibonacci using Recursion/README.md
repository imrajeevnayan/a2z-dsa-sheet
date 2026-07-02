# First n Fibonacci using Recursion

- Platform: GeeksforGeeks
- Language: class Solution { // Function to return list containing first n fibonacci numbers. public static int[] fibonacciNumbers(int n) { int[] fib=new int[n]; fib[0]=0; if(n==1) return fib; fib[1]=1; for(int i=2;i<n;i++){ fib[i]=fib[i-1]+fib[i-2]; } return fib; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags InfosysWiproTCSAccenture, Company Tags, Infosys, Wipro, TCS, Accenture, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1
- Synced: 2026-07-02T18:18:38.264Z

## Problem Description

Given a number n, return an array containing the first n Fibonacci numbers. Note: The first two numbers of the series are 0 and 1. Examples: Input: n = 5 Output: [0, 1, 1, 2, 3] Input: n = 7 Output: [0, 1, 1, 2, 3, 5, 8] Input: n = 2 Output: [0, 1] Constraints: 1 <= n <= 30

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { // Function to return list containing first n fibonacci numbers. public static int[] fibonacciNumbers(int n) { int[] fib=new int[n]; fib[0]=0; if(n==1) return fib; fib[1]=1; for(int i=2;i<n;i++){ fib[i]=fib[i-1]+fib[i-2]; } return fib; } }. The detected topics are Expected Complexities, Company Tags InfosysWiproTCSAccenture, Company Tags, Infosys, Wipro, TCS, Accenture, Topic Tags. Review the synced source file for the implementation details.
