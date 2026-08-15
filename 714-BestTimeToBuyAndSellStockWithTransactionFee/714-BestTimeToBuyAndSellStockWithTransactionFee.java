// Last updated: 15/08/2026, 19:59:53
class Solution {
    Integer dp[][];
    public int helper1(int i,int buy,int fee,int prices[])
    {
        if(i>=prices.length)
        return 0;
        if(dp[i][buy]!=null)
        return dp[i][buy];
        int profit=0;
        if(buy==1)
        {
           profit=Math.max(-prices[i]+helper1(i+1,0,fee,prices),helper1(i+1,1,fee,prices));
        }
        else
        {
            profit=Math.max(prices[i]+helper1(i+1,1,fee,prices)-fee,helper1(i+1,0,fee,prices));
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] prices, int fee) {
        dp=new Integer[prices.length+1][2];
        return helper1(0,1,fee,prices);
    }
}