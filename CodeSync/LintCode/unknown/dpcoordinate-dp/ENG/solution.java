/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/111/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Dynamic Programming, DPCoordinate DP, DP, Coordinate DP, 366 Fibonacci Naive 392 House Robber Medium, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-02T15:43:46.442Z
 */

public·class·Solution·{
····public·int·climbStairs(int·n)·{
········if(n·<=2)·return·n;
········int·dp[]=new·int[n+1];
········for(int·i=3;i<=n;i++){
········dp[1]=1;
········dp[2]=2;
············dp[i]=dp[i-1]+dp[i-2];
········}
····}
········return·dp[n]
}
