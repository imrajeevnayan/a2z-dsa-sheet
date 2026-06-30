# Coin Change (Count Ways)

- Platform: GeeksforGeeks
- Language: class Solution { public: int count(vector<int>& coins, int sum) { // code here. int n=coins.size(); vector<vector<int>> dp(n+1, vector<int> (sum+1, 0)); //sum=0 isme for all 'n' hum empty subset le sakte hai for(int i=0;i<=n;i++) dp[i][0]=1; for(int i=1;i<=n;i++){ for(int j=1;j<=sum;j++){ if(coins[i-1]<=j){ dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]]; //dp[i-1][j] -> dont include and aage check kro more subsets //dp[i][j-coins[i-1]] -> include and same index pr rho or use include kro } else dp[i][j]=dp[i-1][j]; } } return dp[n][sum]; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Paytm, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/coin-change2448/1
- Synced: 2026-06-30T18:59:42.095Z

## Problem Description

Given an integer array coins[ ] representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ]. Note: Assume that you have an infinite supply of each type of coin. Therefore, you can use any coin as many times as you want. Answers are guaranteed to fit into a 32-bit integer. Examples: Input: coins[] = [1, 2, 3], sum = 4 Output: 4 Explanation: Four Possible ways are: [1, 1, 1, 1], [1, 1, 2], [2, 2], [1, 3]. Input: coins[] = [2, 5, 3, 6], sum = 10 Output: 5 Explanation: Five Possible ways are: [2, 2, 2, 2, 2], [2, 2, 3, 3], [2, 2, 6], [2, 3, 5] and [5, 5]. Input: coins[] = [5, 10], sum = 3 Output: 0 Explanation: Since all coin denominations are greater than sum, no combination can make the target sum. Constraints: 1 <= sum <= 103 1 <= coins[i] <= 104 1 <= coins.size() <= 103

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int count(vector<int>& coins, int sum) { // code here. int n=coins.size(); vector<vector<int>> dp(n+1, vector<int> (sum+1, 0)); //sum=0 isme for all 'n' hum empty subset le sakte hai for(int i=0;i<=n;i++) dp[i][0]=1; for(int i=1;i<=n;i++){ for(int j=1;j<=sum;j++){ if(coins[i-1]<=j){ dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]]; //dp[i-1][j] -> dont include and aage check kro more subsets //dp[i][j-coins[i-1]] -> include and same index pr rho or use include kro } else dp[i][j]=dp[i-1][j]; } } return dp[n][sum]; } };. The detected topics are Expected Complexities, Company Tags, Paytm, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft. Review the synced source file for the implementation details.
