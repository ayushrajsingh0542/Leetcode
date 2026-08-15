// Last updated: 15/08/2026, 20:06:37
class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(board,visited,i,0,n,m);
            }
            if(board[n-i-1][m-1] == 'O')
                dfs(board,visited,n-i-1,m-1,n,m);
        }

        for(int i = 0;i<m;i++){
            if(board[n-1][i] == 'O')
                dfs(board,visited,n-1,i,n,m);
            if(board[0][m-i-1] == 'O'){
                dfs(board,visited,0,m-i-1,n,m);
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!visited[i][j] && board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
    void dfs(char[][] board,boolean[][] visited,int row,int col,int n,int m){
        int[] temprow = {1,-1,0,0};
        int[] tempcol = {0,0,1,-1};

        visited[row][col] = true;

        for(int i = 0;i<4;i++){
            int nrow = row+temprow[i];
            int ncol = col+tempcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !visited[nrow][ncol] && board[nrow][ncol] == 'O'){
                dfs(board,visited,nrow,ncol,n,m);
            }
        }
    }
}