// Last updated: 15/08/2026, 20:03:05
class Solution {
    Integer dp[][];
    public int helper1(int idx,int amount,int coins[])
    {
        if(idx==coins.length-1)
        {
            if(amount%coins[idx]==0)
            return amount/coins[idx];
            else
            return (int)(1e9);
        }
        if(dp[idx][amount]!=null)
        {
            return dp[idx][amount];
        }
        int take=(int)(1e9);
        if(amount>=coins[idx])
        {
            take=1+helper1(idx,amount-coins[idx],coins);
        }
        int nottake=helper1(idx+1,amount,coins);
        return dp[idx][amount]=Math.min(take,nottake);


    }
    public int coinChange(int[] coins, int amount) {
        dp=new Integer[coins.length][amount+1];
        if(helper1(0,amount,coins)==(int)(1e9))
        {
            return -1;
        }
        return helper1(0,amount,coins);
    }
}