class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int count = 0;

                if (grid[i][j] == 1) {
                    grid[i][j] = 0;

                    count = 1 + dfs(grid, i, j);
                }

                maxArea = Math.max(maxArea, count);
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int i , int j) {
        int area = 0;

        if (0 <= i - 1) {
            if (grid[i - 1][j] == 1) {
                grid[i - 1][j] = 0;
                area += 1 + dfs(grid, i - 1, j);
            }
        }

        if (0 <= j - 1) {
            if (grid[i][j - 1] == 1) {
                grid[i][j - 1] = 0;
                area += 1 + dfs(grid, i, j - 1);
            }
        }

        if (j + 1 < grid[i].length) {
            if (grid[i][j + 1] == 1) {
                grid[i][j + 1] = 0;
                area += 1 + dfs(grid, i, j + 1);
            }
        }

        if (i + 1 < grid.length) {
            if (grid[i + 1][j] == 1) {
                grid[i + 1][j] = 0;
                area += 1 + dfs(grid, i + 1, j);
            }
        }

        return area;
    }
}
