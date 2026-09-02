# Square Root

- Platform: GeeksforGeeks
- Language: class Solution { int floorSqrt(int n) { int ans=0; for(int i=1;i*i<=n;i++){ ans=i; } return ans; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, VMWare, Flipkart, Accolite, Amazon, Microsoft, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/square-root/1
- Synced: 2026-09-02T17:08:26.489Z

## Problem Description

Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value. Floor value of any number is the greatest Integer which is less than or equal to that number. Examples: Input: n = 4 Output: 2 Explanation: Since, 4 is a perfect square, so its square root is 2. Input: n = 11 Output: 3 Explanation: Since, 11 is not a perfect square, floor of square root of 11 is 3. Input: n = 1 Output: 1 Explanation: 1 is a perfect square, so its square root is 1.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { int floorSqrt(int n) { int ans=0; for(int i=1;i*i<=n;i++){ ans=i; } return ans; } }. The detected topics are Expected Complexities, Company Tags, VMWare, Flipkart, Accolite, Amazon, Microsoft, Topic Tags. Review the synced source file for the implementation details.
