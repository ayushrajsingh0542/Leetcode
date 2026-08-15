// Last updated: 15/08/2026, 20:01:33
class Solution {

    static class Info
    {
        int r,c,steps;
        Info(int r,int c,int s)
        {
            this.r=r;
            this.c=c;
            this.steps=s;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        int dis[][]=new int[n][m];
        Queue<Info>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                vis[i][j]=0;
                dis[i][j]=1;
                q.add(new Info(i,j,0));
                }
            }
        }
        int dir[][]={{1,0},{0,1},{0,-1},{-1,0}};
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            int r=curr.r;
            int c=curr.c;
            int steps=curr.steps;
            for(int d[]:dir)
            {
                int newr=r+d[0];
                int newc=c+d[1];
                if(newr>=0 && newr<n && newc>=0 && newc<m && mat[newr][newc]!=0)
                {
                    mat[newr][newc]=0;
                    vis[newr][newc]=steps+1;
                    q.add(new Info(newr,newc,steps+1));
                }
            }

        }

        return vis;

    }
}