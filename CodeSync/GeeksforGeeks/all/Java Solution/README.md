# Java Solution

- Platform: GeeksforGeeks
- Language: #User function Template for python3 class Solution: def noOfWays(self,i:int, dp)->int: if i == 0 or i == 1 or i == 2 : return i; if dp[i] != -1: return dp[i] dp[i] = self.noOfWays(i-1, dp) + (i-1) * self.noOfWays(i-2, dp) return dp[i] def countFriendsPairings(self, n): # code here # dp = [-1]*(n+1) # return self.noOfWays(n, dp) if n == 0 or n == 1 or n == 2 : return n; dp = [0]*(n+1) dp[0] = 0 dp[1] = 1 dp[2] = 2 for i in range(3, n+1): dp[i] = dp[i-1] + (i-1)*dp[i-2] return dp[n]
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Modular Arithmetic, Algorithms, Recursion, Related Articles, Friends Pairing Problem
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/friends-pairing-problem5425/1
- Synced: 2026-07-06T09:04:25.916Z

## Problem Description

Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. Examples : Input: n = 3 Output: 4 Explanation: {1}, {2}, {3} : All single {1}, {2,3} : 2 and 3 paired but 1 is single. {1,2}, {3} : 1 and 2 are paired but 3 is single. {1,3}, {2} : 1 and 3 are paired but 2 is single. Note that {1,2} and {2,1} are considered same. Input: n = 2 Output: 2 Explanation: {1} , {2} : All single. {1,2} : 1 and 2 are paired. Input: n = 1 Output: 1 Constraints: 1 ≤ n ≤ 18

## Explanation

This solution was accepted on GeeksforGeeks using #User function Template for python3 class Solution: def noOfWays(self,i:int, dp)->int: if i == 0 or i == 1 or i == 2 : return i; if dp[i] != -1: return dp[i] dp[i] = self.noOfWays(i-1, dp) + (i-1) * self.noOfWays(i-2, dp) return dp[i] def countFriendsPairings(self, n): # code here # dp = [-1]*(n+1) # return self.noOfWays(n, dp) if n == 0 or n == 1 or n == 2 : return n; dp = [0]*(n+1) dp[0] = 0 dp[1] = 1 dp[2] = 2 for i in range(3, n+1): dp[i] = dp[i-1] + (i-1)*dp[i-2] return dp[n]. The detected topics are Expected Complexities, Topic Tags, Modular Arithmetic, Algorithms, Recursion, Related Articles, Friends Pairing Problem. Review the synced source file for the implementation details.
