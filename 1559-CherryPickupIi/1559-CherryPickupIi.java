// Last updated: 15/08/2026, 19:54:43
class Solution {
    Integer dp[][][];
    public int helper1(int i,int j1,int j2,int n,int m,int grid[][])
    {
        if(j1<0 || j1>=m || j2<0 || j2>=m)
        return (int)(-1e9);
        if(i==n-1)
        {
            if(j1==j2)
            return grid[i][j1];
            else
            return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=null)
        return dp[i][j1][j2];
        int maxi=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++)
        {
            for(int dj2=-1;dj2<=1;dj2++)
            {
              if(j1==j2)
              maxi=Math.max(maxi,grid[i][j1]+helper1(i+1,j1+dj1,j2+dj2,n,m,grid));
              else
              maxi=Math.max(maxi,grid[i][j1]+grid[i][j2]+helper1(i+1,j1+dj1,j2+dj2,n,m,grid));
            }
        }
        return dp[i][j1][j2]=maxi;
    }
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new Integer[n][m][m];
        return helper1(0,0,m-1,n,m,grid);
    }
}