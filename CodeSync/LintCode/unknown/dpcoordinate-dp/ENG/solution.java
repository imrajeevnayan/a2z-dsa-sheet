/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/111/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Dynamic Programming, DPCoordinate DP, DP, Coordinate DP, 366 Fibonacci Naive 392 House Robber Medium, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-02T15:42:15.610Z
 */

public·class·Solution·{
····public·int·climbStairs(int·n)·{
········if(n·<=2)·return·n;
········int·a=1;
········int·b=2;
········for(int·i=3;i<=n;i++){
············int·c=a+b;
············a=b;
············b=c;
········}
········return·b;
····}
}
