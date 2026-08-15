// Last updated: 15/08/2026, 20:07:02
class Solution {
    Integer dp[][];
    public int helper1(int idx1,int idx2,List<List<Integer>> triangle)
    {
        if(idx1==triangle.size())
        {
           return 0;
        }
        if(dp[idx1][idx2]!=null)
        return dp[idx1][idx2];
        List<Integer>list=triangle.get(idx1);
        int min=Integer.MAX_VALUE;
        for(int i=idx2;i<list.size();i++)
        {
           int down=list.get(idx2)+helper1(idx1+1,idx2,triangle);
           int dnl=list.get(idx2)+helper1(idx1+1,idx2+1,triangle);
           min=Math.min(down,dnl);
        }
        return dp[idx1][idx2]=min;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        dp=new Integer[n][n];
        return helper1(0,0,triangle);
    }
}