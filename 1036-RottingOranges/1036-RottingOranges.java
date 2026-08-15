// Last updated: 15/08/2026, 19:57:44
class Solution {
    static class Info
    {
        int row,col,time;
        Info(int r,int c,int t)
        {
            this.row=r;
            this.col=c;
            this.time=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Info> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int countFr=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Info(i,j,0));
                    vis[i][j]=2;
                }
                else
                {
                    vis[i][j]=0;
                }
                if(grid[i][j]==1)
                {
                    countFr++;
                }
            }
        }
        int tm=0;
        int count=0;
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            int r=curr.row;
            int c=curr.col;
            int t=curr.time;
            tm=Math.max(tm,t);
            for(int i=0;i<4;i++)
            {
                int newR=r+row[i];
                int newC=c+col[i];
                if(newR>=0 && newR<n && newC>=0 && newC<m && vis[newR][newC]==0 && grid[newR][newC]==1)
                {
                    q.add(new Info(newR,newC,t+1));
                    vis[newR][newC]=2;
                    count++;
                }
            }
        }
        if(count==countFr)
        return tm;
        return -1;
        
    }
}