// Last updated: 15/08/2026, 19:54:06
class Solution {
    public static class Info
    {
        int r,c;
        Info(int r,int c)
        {
            this.r=r;
            this.c=c;
        }
    }
    public int numSpecial(int[][] mat) {
        Queue<Info>q=new LinkedList<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                q.add(new Info(i,j));
            }
        }
        int ans=0;
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            int r=curr.r;
            int c=curr.c;
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(mat[i][c]==1)
                count++;
            }
            for(int j=0;j<m;j++)
            {
                if(mat[r][j]==1)
                count++;
            }
            if(count==2)
            ans++;
        }

        return ans;
    }
}