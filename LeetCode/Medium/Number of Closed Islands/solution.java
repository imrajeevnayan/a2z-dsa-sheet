class Solution {
    public int closedIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        
        // Step 1: Boundary walon ko eliminate karo (Mark as visited/invalid)
        for (int i = 0; i < rows; i++) {
            dfs(grid, i, 0);         // Left boundary
            dfs(grid, i, cols - 1);  // Right boundary
        }
        for (int j = 0; j < cols; j++) {
            dfs(grid, 0, j);         // Top boundary
            dfs(grid, rows - 1, j);  // Bottom boundary
        }
        
        // Step 2: Ab jo land (0) bacha hai, wo closed island hai
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (grid[i][j] == 0) {
                    dfs(grid, i, j); // Mark entire island
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs(int[][] grid, int r, int c) {
        // Base cases: Out of bounds OR already visited/water
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 0) {
            return;
        }
        
        // Mark current land as visited (using -1 to distinguish from water '1')
        grid[r][c] = -1;
        
        // Explore 4 directions
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}