// Last updated: 15/08/2026, 20:09:01
class Solution {
    Integer dp[][];
    public int helper1(int idx1,int idx2,int grid[][])
    {
        if(idx1==grid.length-1 && idx2==grid[0].length-1 && grid[idx1][idx2]==0)
        {
            return 1;
        }
        if(idx1>=grid.length || idx2>=grid[0].length || grid[idx1][idx2]==1)
        {
            return 0;
        }
        if(dp[idx1][idx2]!=null)
        return dp[idx1][idx2];
        int right=helper1(idx1,idx2+1,grid);
        int down=helper1(idx1+1,idx2,grid);
        return dp[idx1][idx2]=right+down;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        dp=new Integer[grid.length][grid[0].length];
        return helper1(0,0,grid);
    }
}