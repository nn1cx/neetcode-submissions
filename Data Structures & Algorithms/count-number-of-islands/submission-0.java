class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    grid[i][j] = '0';
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (0 <= i - 1) {
            if (grid[i - 1][j] == '1') {
                grid[i - 1][j] = '0';
                dfs(grid, i - 1, j);
            }
        }

        if (0 <= j - 1) {
            if (grid[i][j - 1] == '1') {
                grid[i][j - 1] = '0';
                dfs(grid, i, j - 1);
            }
        }

        if (j + 1 < grid[i].length) {
            if (grid[i][j + 1] == '1') {
                grid[i][j + 1] = '0';
                dfs(grid, i, j + 1);
            }
        }

        if (i + 1 < grid.length) {
            if (grid[i + 1][j] == '1') {
                grid[i + 1][j] = '0';
                dfs(grid, i + 1, j);
            }
        }
    }
}
