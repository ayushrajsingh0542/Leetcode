// Last updated: 15/08/2026, 19:54:57
class Solution {
    static int[] canReceive = new int[]{0,6,35,14,21,10,15};
    public boolean hasValidPath(int[][] grid) {
        int p = 1;
        return dfs(grid, new boolean[grid.length][grid[0].length], 0, 0, p);
    }
    private boolean dfs(int[][] grid, boolean[][] vis, int r, int c, int p) {
        int n = grid.length, m = grid[0].length;
        if (r < 0 || c < 0 || r >= n || c >= m || vis[r][c] || canReceive[grid[r][c]]%p != 0) return false;
        if (r == n-1 && c == m-1) return true;
        vis[r][c] = true;
        
        if (grid[r][c] == 1) {
            return dfs(grid,vis,r,c+1, 2) || dfs(grid,vis,r,c-1, 3);
        }
        else if (grid[r][c] == 2) {
            return dfs(grid, vis, r+1, c, 5) || dfs(grid, vis, r-1, c, 7);
        }
        else if (grid[r][c] == 3) {
            return dfs(grid, vis, r, c-1, 3) || dfs(grid, vis, r+1, c, 5);
        }
        else if (grid[r][c] == 4) {
            return dfs(grid, vis, r+1, c, 5) ||  dfs(grid, vis, r, c+1, 2);
        }
        else if (grid[r][c] == 5) {
            return  dfs(grid, vis, r-1, c, 7) || dfs(grid, vis, r, c-1, 3);
        }
        else {
            return dfs(grid, vis, r-1, c, 7) || dfs(grid, vis, r, c+1, 2);
        }
    }
}