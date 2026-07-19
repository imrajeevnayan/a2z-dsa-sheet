# DP Approach (Tabulation) using 1D Array (Space Optimized)! - Java

- Platform: GeeksforGeeks
- Language: class Solution: def minCoins(self, coins, sum): # code here n = len(coins) dp = [float('inf')]*(sum+1) dp[0] = 0 for s in range(1, sum+1): for c in coins: if s - c >= 0: dp[s] = min(dp[s], 1 + dp[s-c]) return dp[sum] if dp[sum] != float('inf') else -1
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, Morgan Stanley, Accolite, Amazon, Microsoft, Samsung
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/number-of-coins1824/1
- Synced: 2026-07-19T05:25:48.668Z

## Problem Description

You are given an array coins[], where each element represents a coin of a different denomination, and a target value sum. You have an unlimited supply of each coin type. Your task is to determine the minimum number of coins needed to obtain the target sum. If it is not possible to form the sum using the given coins, return -1. Examples: Input: coins[] = [25, 10, 5], sum = 30 Output: 2 Explanation: Minimum 2 coins needed, 25 and 5 Input: coins[] = [9, 6, 5, 1], sum = 19 Output: 3 Explanation: 19 = 9 + 9 + 1 Input: coins[] = [5, 1], sum = 0 Output: 0 Explanation: For 0 sum, we do not need a coin Input: coins[] = [4, 6, 2], sum = 5 Output: -1 Explanation: Not possible to make the given sum. Constraints: 1 ≤ sum * coins.size() ≤ 106 0 ≤ sum ≤ 104 1 ≤ coins[i] ≤ 104 1 ≤ coins.size() ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def minCoins(self, coins, sum): # code here n = len(coins) dp = [float('inf')]*(sum+1) dp[0] = 0 for s in range(1, sum+1): for c in coins: if s - c >= 0: dp[s] = min(dp[s], 1 + dp[s-c]) return dp[sum] if dp[sum] != float('inf') else -1. The detected topics are Expected Complexities, Company Tags, Paytm, Morgan Stanley, Accolite, Amazon, Microsoft, Samsung. Review the synced source file for the implementation details.
