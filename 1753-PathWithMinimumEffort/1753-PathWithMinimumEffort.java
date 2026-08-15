// Last updated: 15/08/2026, 19:53:56
class Solution {
    static class Info implements Comparable<Info>
    {
        int distance,row,col;
        Info(int d,int r,int c)
        {
            this.distance=d;
            this.row=r;
            this.col=c;
        }
        @Override
        public int compareTo(Info p2)
        {
            return this.distance-p2.distance;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int dist[][]=new int[n][m];
        PriorityQueue<Info> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[0][0]=0;
        pq.add(new Info(0,0,0));
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        while(!pq.isEmpty())
        {
            Info curr=pq.remove();
            int r=curr.row;
            int c=curr.col;
            int dis=curr.distance;
            
            for(int i=0;i<4;i++)
            {
                int newR=r+row[i];
                int newC=c+col[i];
                if(newR>=0 && newR<n && newC>=0 && newC<m)
                {
                    int newDiff=Math.max(Math.abs(heights[r][c]-heights[newR][newC]),dis);
                    if(newDiff<dist[newR][newC])
                    {
                        dist[newR][newC]=newDiff;
                        pq.add(new Info(newDiff,newR,newC));
                    }
                }
            }
           
        }
        return dist[n-1][m-1];
        
    }
}