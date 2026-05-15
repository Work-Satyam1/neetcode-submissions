class Solution {

    public int maxAreaOfIsland(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {

                    int area = dfs(grid, i, j);

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j) {

        int rows = grid.length;
        int cols = grid[0].length;

        // Boundary + water check
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0) {
            return 0;
        }

        // Mark visited
        grid[i][j] = 0;

        int area = 1;

        // Explore 4 directions
        area += dfs(grid, i + 1, j); // down
        area += dfs(grid, i - 1, j); // up
        area += dfs(grid, i, j + 1); // right
        area += dfs(grid, i, j - 1); // left

        return area;
    }
}
