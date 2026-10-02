class Solution {
    // Method name MUST be getMinSteps to match GFG's driver code
    int getMinSteps(int n) {
        if (n <= 1) return 0;

        int[] dp = new int[n + 1];
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            // Option 1: Subtract 1 (always possible)
            dp[i] = dp[i - 1] + 1;

            // Option 2: Divide by 2
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // Option 3: Divide by 3
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n];
    }
}