// Last updated: 15/08/2026, 19:59:36
class Solution {
    Integer dp[];
    public int helper(int cost[],int idx)
    {
        if(idx==cost.length-1)
        return cost[cost.length-1];
        if(idx>cost.length-1)
        return 0;
        if(dp[idx]!=null)
        return dp[idx];
        int first=cost[idx]+helper(cost,idx+1);
        int second=cost[idx]+helper(cost,idx+2);
        return dp[idx]=Math.min(first,second);
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new Integer[n+1];
        int ans=helper(cost,0);
        int ans2=helper(cost,1);
        return Math.min(ans,ans2);

    }
}