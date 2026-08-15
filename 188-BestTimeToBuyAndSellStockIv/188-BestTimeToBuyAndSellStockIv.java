// Last updated: 15/08/2026, 20:05:01
class Solution {
    Integer dp[][][];
    public int helper1(int i,int buy,int t,int k,int prices[])
    {
        if(i==prices.length || t==k)
        return 0;
        if(dp[i][buy][t]!=null)
        return dp[i][buy][t];
        int profit=0;
        if(buy==1)
        {
            profit=Math.max(-prices[i]+helper1(i+1,0,t,k,prices),helper1(i+1,1,t,k,prices));
        }
        else
        {
            profit=Math.max(prices[i]+helper1(i+1,1,t+1,k,prices),helper1(i+1,0,t,k,prices));
        
        }
        return dp[i][buy][t]=profit;

    }
    public int maxProfit(int k, int[] prices) {
        dp=new Integer[prices.length][2][k+1];
        return helper1(0,1,0,k,prices);
    }
}