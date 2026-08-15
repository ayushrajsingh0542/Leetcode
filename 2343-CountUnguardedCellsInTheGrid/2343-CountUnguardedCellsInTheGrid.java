// Last updated: 15/08/2026, 19:51:58
class Solution {
    static class Info {
        int x, y;
        Info(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        int vis[][] = new int[m][n];
        Queue<Info> q = new LinkedList<>();

        for (int g[] : guards) {
            q.add(new Info(g[0], g[1]));
            vis[g[0]][g[1]] = 2; 
        }
        for (int w[] : walls) {
            vis[w[0]][w[1]] = 2;
        }

        while (!q.isEmpty()) {
            Info curr = q.remove();
            int row = curr.x;
            int col = curr.y;

           
            for (int i = row + 1; i < m; i++) {
                if (vis[i][col] == 2) 
                break;
                vis[i][col] = 3;
            }
           
            for (int i = row - 1; i >= 0; i--) {
                if (vis[i][col] == 2) 
                break;
                vis[i][col] = 3;
            }
          
            for (int j = col - 1; j >= 0; j--) {
                if (vis[row][j] == 2) 
                break;
                vis[row][j] = 3;
            }
            
            for (int j = col + 1; j < n; j++) {
                if (vis[row][j] == 2) 
                break;
                vis[row][j] = 3;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j] == 0) count++;
            }
        }
        return count;
    }
}
