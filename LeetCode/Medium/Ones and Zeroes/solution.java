class Solution {
    public int findMaxForm(String[] strs, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        for (String str : strs) {

            int zeros = 0;
            int ones = 0;

            // Count zeros and ones
            for (char c : str.toCharArray()) {
                if (c == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }

            // 0/1 Knapsack -> reverse loop
            for (int z = m; z >= zeros; z--) {
                for (int o = n; o >= ones; o--) {

                    dp[z][o] = Math.max(
                        dp[z][o],
                        dp[z - zeros][o - ones] + 1
                    );
                }
            }
        }

        return dp[m][n];
    }
}
