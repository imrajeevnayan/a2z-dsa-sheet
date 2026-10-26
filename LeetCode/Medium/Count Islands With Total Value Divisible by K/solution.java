class Solution {

    private int m, n;
    private long sum;

    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] > 0 && !vis[i][j]) {
                    sum = 0;

                    dfs(grid, i, j, vis);

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private void dfs(int[][] grid, int r, int c, boolean[][] vis) {
        if (r < 0 || c < 0 || r >= m || c >= n ||
            grid[r][c] == 0 || vis[r][c]) {
            return;
        }

        vis[r][c] = true;
        sum += grid[r][c];

        dfs(grid, r + 1, c, vis);
        dfs(grid, r - 1, c, vis);
        dfs(grid, r, c + 1, vis);
        dfs(grid, r, c - 1, vis);
    }
}