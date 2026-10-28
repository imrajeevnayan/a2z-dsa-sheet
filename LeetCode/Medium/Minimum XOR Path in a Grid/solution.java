class Solution {
    public int minCost(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][][] dp = new boolean[m][n][1024];

        dp[0][0][grid[0][0]] = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int x = 0; x < 1024; x++) {

                    if (!dp[i][j][x]) continue;

                    if (i + 1 < m) {
                        dp[i + 1][j][x ^ grid[i + 1][j]] = true;
                    }

                    if (j + 1 < n) {
                        dp[i][j + 1][x ^ grid[i][j + 1]] = true;
                    }
                }
            }
        }

        for (int x = 0; x < 1024; x++) {
            if (dp[m - 1][n - 1][x]) {
                return x;
            }
        }

        return 0;
    }
}