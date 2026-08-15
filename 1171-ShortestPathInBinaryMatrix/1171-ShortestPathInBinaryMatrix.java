// Last updated: 15/08/2026, 19:56:57
class Solution {
    static class Info
    {
        int first,second,dist;
        Info(int f,int s,int d)
        {
            this.first=f;
            this.second=s;
            this.dist=d;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1)
        return -1;
        Queue<Info> q=new LinkedList<>();
        int n=grid.length;
        int direct[][]={{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
        q.add(new Info(0,0,1));
        grid[0][0]=1;
        
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            int row=curr.first;
            int col=curr.second;
            int dist=curr.dist;
            if(row==n-1 && col==n-1)
            {
                return dist;
            }
            for(int dir[]:direct)
            {
                int newR=row+dir[0];
                int newC=col+dir[1];
                if(newR>=0 && newR<n && newC>=0 && newC<n && grid[newR][newC]==0)
                {
                    q.add(new Info(newR,newC,dist+1));
                    grid[newR][newC]=1;
                    
                }
            }
            
        }
        return -1;
    }
}