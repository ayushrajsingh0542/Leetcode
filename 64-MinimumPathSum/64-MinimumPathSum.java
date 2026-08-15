// Last updated: 15/08/2026, 20:08:59
class Solution {
    Integer dp[][];
    public int helper1(int idx1,int idx2,int grid[][])
    {
        if(idx1==grid.length-1 && idx2==grid[0].length-1)
        {
            return grid[idx1][idx2];
        }
        if(idx1>=grid.length || idx2>=grid[0].length)
        {
            return (int)(1e9);
        }
        if(dp[idx1][idx2]!=null)
        return dp[idx1][idx2];
        int down=grid[idx1][idx2]+helper1(idx1+1,idx2,grid);
        int right=grid[idx1][idx2]+helper1(idx1,idx2+1,grid);
        return dp[idx1][idx2]=Math.min(down,right);
    }
    public int minPathSum(int[][] grid) {
        dp=new Integer[grid.length][grid[0].length];
        return helper1(0,0,grid);
    }
}