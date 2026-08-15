// Last updated: 15/08/2026, 20:06:56
class Solution {
    Integer dp[][];
    //0->cannot buy until sell
    //1->can buy
    public int helper1(int idx,int buy,int prices[])
    {
        if(idx==prices.length)
        return 0;
        if(dp[idx][buy]!=null)
        return dp[idx][buy];
    
    int profit=0;
    if(buy==1)
    {
       profit=Math.max(-prices[idx]+helper1(idx+1,0,prices),helper1(idx+1,1,prices));
    }
    else
    {
        profit=Math.max(prices[idx]+helper1(idx+1,1,prices),helper1(idx+1,0,prices));
    }

    return dp[idx][buy]=profit;
}
    public int maxProfit(int[] prices) {
        dp=new Integer[prices.length][2];
        return helper1(0,1,prices);
    }
}