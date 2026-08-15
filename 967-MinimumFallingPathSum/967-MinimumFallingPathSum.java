// Last updated: 15/08/2026, 19:58:21
class Solution {
    public static int helper1(int i,int j,int mat[][],int dp[][])
    {
        if(j<0 || j>=mat[0].length)
        return (int)(1e9);
        if(i==0)
        return mat[i][j];
        if(dp[i][j]!=-101)
        return dp[i][j];
        int up=mat[i][j]+helper1(i-1,j,mat,dp);
        int ld=mat[i][j]+helper1(i-1,j-1,mat,dp);
        int rd=mat[i][j]+helper1(i-1,j+1,mat,dp);
        return dp[i][j]=Math.min(up,Math.min(ld,rd));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        for(int rows[]:dp)
        Arrays.fill(rows,-101);
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
        {
          int ans=helper1(n-1,j,matrix,dp);
          mini=Math.min(ans,mini);
        }
        return mini;
    }
}