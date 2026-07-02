# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/366
# Language: Python
# Difficulty: Unknown
# Topics: EnumerateArraySimulation, Enumerate, Array, Simulation, NetEase, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-07-02T15:48:37.292Z

public·class·Solution·{
····public·int·fibonacci(int·n)·{
·········if(n·<1)return·0;
········int·dp[]=new·int[n+1];
········dp[0]=0;
········dp[1]=1;
········for(int·i=2;i<=n;i++){
············dp[i]=dp[i-1]+dp[i-2];
········}
····}
········return·dp[n];
········if·(n·==·1)·return·0;
········if·(n·==·2)·return·1;
}
