// Last updated: 15/08/2026, 20:09:04
class Solution {
    Integer dp[][];
    public int helper1(int r,int c,int n,int m)
    {
        if(r==n-1 && c==m-1)
        {
            return 1;
        }
        else if(r>=n || c>=m)
        return 0;
        if(dp[r][c]!=null)
        return dp[r][c];
        int right=helper1(r,c+1,n,m);
        int down=helper1(r+1,c,n,m);
        return dp[r][c]=right+down;
    }
    public int uniquePaths(int n, int m) {
        dp=new Integer[n][m];
        return helper1(0,0,n,m);
    }
}