// Last updated: 15/08/2026, 19:58:57
class Solution {
    public int numMagicSquaresInside(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {

                

                boolean vis[] = new boolean[10];
                boolean ok = true;

                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        int num = grid[x][y];
                        if (num < 1 || num > 9 || vis[num]) {
                            ok = false;
                            break;
                        }
                        vis[num] = true;
                    }
                    if (!ok) break;
                }

                if (!ok) continue;

                int s =
                    grid[i][j] + grid[i][j+1] + grid[i][j+2];

                if (
                    grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2] != s ||
                    grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2] != s ||

                    grid[i][j] + grid[i+1][j] + grid[i+2][j] != s ||
                    grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1] != s ||
                    grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2] != s ||

                    grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] != s ||
                    grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] != s
                ) continue;

                ans++;
            }
        }
        return ans;
    }
}
