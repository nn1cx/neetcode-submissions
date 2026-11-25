class Solution {
    private final int INF = 2147483647;

    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    queue.add(new int[] {i,  j});
                }
            }
        }

        if (queue.size() == 0) {
            return;
        }

        int[][] directions = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

        while (!queue.isEmpty()) {
            int[] room = queue.remove();
            int row = room[0];
            int col = room[1];

            for (int[] direction: directions) {
                int r = row + direction[0];
                int c = col + direction[1];

                if (r >= rows || c >= cols || r < 0 || c < 0 || grid[r][c] != INF) {
                    continue;
                }
                
                queue.add(new int[] {r, c});

                grid[r][c] = grid[row][col] + 1;
            }
        }

    }
}
