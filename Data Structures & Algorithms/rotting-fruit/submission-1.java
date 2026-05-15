

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>(); //Because Queue is an interface in Java, not a concrete class.
        int fresh = 0;

        // Count fresh oranges and store rotten ones
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;
        int minutes = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rottenThisMinute = false;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                // UP
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    fresh--;
                    queue.offer(new int[]{r - 1, c});
                    rottenThisMinute = true;
                }

                // DOWN
                if (r + 1 < rows && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    fresh--;
                    queue.offer(new int[]{r + 1, c});
                    rottenThisMinute = true;
                }

                // LEFT
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    fresh--;
                    queue.offer(new int[]{r, c - 1});
                    rottenThisMinute = true;
                }

                // RIGHT
                if (c + 1 < cols && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    fresh--;
                    queue.offer(new int[]{r, c + 1});
                    rottenThisMinute = true;
                }
            }

            if (rottenThisMinute) {
                minutes++;
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}