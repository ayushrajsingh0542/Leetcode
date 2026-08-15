// Last updated: 15/08/2026, 19:57:26
class Solution {
    static class Info
    {
        int row,col;
        Info(int r,int c)
        {
            this.row=r;
            this.col=c;
        }
    }
    public int numEnclaves(int[][] grid) {
        Queue<Info>q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||j==0||i==n-1||j==m-1)
                {
                    if(grid[i][j]==1)
                    {
                        vis[i][j]=1;
                        q.add(new Info(i,j));
                    }
                }
            }
        }
        int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            int row=curr.row;
            int col=curr.col;
            for(int i=0;i<4;i++)
            {
                int newDir[]=dir[i];
                int newR=newDir[0]+row;
                int newC=newDir[1]+col;
                if(newR>=0 && newR<n && newC>=0 && newC<m && vis[newR][newC]==0 && grid[newR][newC]==1)
                {
                    vis[newR][newC]=1;
                    q.add(new Info(newR,newC));
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==1)
                count++;
            }
        }
        return count;
    }
}