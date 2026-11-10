class Solution {
    public int climbStairs(int n, int[] costs) {
        long[] dp = new long[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            long ans = Long.MAX_VALUE;

            if (i >= 1)
                ans = Math.min(ans, dp[i - 1] + costs[i - 1] + 1);

            if (i >= 2)
                ans = Math.min(ans, dp[i - 2] + costs[i - 1] + 4);

            if (i >= 3)
                ans = Math.min(ans, dp[i - 3] + costs[i - 1] + 9);

            dp[i] = ans;
        }

        return (int) dp[n];
    }
}