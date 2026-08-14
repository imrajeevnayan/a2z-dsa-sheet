# Maximum Sum Problem

- Platform: GeeksforGeeks
- Language: class Solution: def maxSum(self, n): # code here def getMax(n): n3= n//3 n2= n//2 n4= n//4 if n3 + n2+ n4 <= n: return n else: return getMax(n2) + getMax(n3)+ getMax(n4) return getMax(n)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Morgan Stanley, Company Tags, Morgan Stanley, Topic Tags, Dynamic Programming, Related Articles, Recursively Break Number 3 Parts Get Maximum Sum
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/maximum-sum-problem2211/1
- Synced: 2026-08-14T17:47:09.190Z

## Problem Description

Given a number n, find its maximum sum value with 3 recursive breaks described below. Break into three parts n/2, n/3, and n/4 (consider only the integer part or floor value). Each number obtained in this process can be divided further recursively. At every step, we can take the max of current value of n or the max value obtained with recursive process. It is possible that we don't divide the number at all and choose it as final answer. Examples: Input: n = 12 Output: 13 Explanation: Break n = 12 in three parts [12/2, 12/3, 12/4] = [6, 4, 3], now current sum is = (6 + 4 + 3) = 13. Further breaking 6, 4 and 3 into parts will produce sum less than or equal to 6, 4 and 3 respectively. Input: n = 24 Output: 27 Explanation: Break n = 24 in three parts [24/2, 24/3, 24/4] = [12, 8, 6], now current sum is = (12 + 8 + 6) = 26 . But recursively breaking 12 would produce value 13. So our maximum sum is 13 + 8 + 6 = 27. Constraints: 0 ≤ n ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def maxSum(self, n): # code here def getMax(n): n3= n//3 n2= n//2 n4= n//4 if n3 + n2+ n4 <= n: return n else: return getMax(n2) + getMax(n3)+ getMax(n4) return getMax(n). The detected topics are Expected Complexities, Company Tags Morgan Stanley, Company Tags, Morgan Stanley, Topic Tags, Dynamic Programming, Related Articles, Recursively Break Number 3 Parts Get Maximum Sum. Review the synced source file for the implementation details.
