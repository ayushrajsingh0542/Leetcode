// Last updated: 15/08/2026, 20:03:07
class Solution {
    Integer dp[][];
    public int helper1(int i,int buy,int prices[])
    {
        if(i>=prices.length)
        return 0;
        if(dp[i][buy]!=null)
        return dp[i][buy];
        int profit=0;
        if(buy==1)
        {
           profit=Math.max(-prices[i]+helper1(i+1,0,prices),helper1(i+1,1,prices));
        }
        else
        {
            profit=Math.max(prices[i]+helper1(i+2,1,prices),helper1(i+1,0,prices));
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        dp=new Integer[prices.length+1][2];
        return helper1(0,1,prices);
    }
}