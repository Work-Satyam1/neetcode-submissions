class Solution {

    public void islandsAndTreasure(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        // Store all gates in queue
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // BFS
        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            int r = curr[0];
            int c = curr[1];

            // UP
            if (r - 1 >= 0 && grid[r - 1][c] == Integer.MAX_VALUE) {

                grid[r - 1][c] = grid[r][c] + 1;

                queue.offer(new int[]{r - 1, c});
            }

            // DOWN
            if (r + 1 < rows && grid[r + 1][c] == Integer.MAX_VALUE) {

                grid[r + 1][c] = grid[r][c] + 1;

                queue.offer(new int[]{r + 1, c});
            }

            // LEFT
            if (c - 1 >= 0 && grid[r][c - 1] == Integer.MAX_VALUE) {

                grid[r][c - 1] = grid[r][c] + 1;

                queue.offer(new int[]{r, c - 1});
            }

            // RIGHT
            if (c + 1 < cols && grid[r][c + 1] == Integer.MAX_VALUE) {

                grid[r][c + 1] = grid[r][c] + 1;

                queue.offer(new int[]{r, c + 1});
            }
        }
    }
}
