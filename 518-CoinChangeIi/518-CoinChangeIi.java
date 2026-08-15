// Last updated: 15/08/2026, 20:01:43
class Solution {
    Integer dp[][];
    public int helper1(int idx,int tar,int coins[])
    {
        if(tar==0)
        {
            return 1;
        }
        if(idx==coins.length-1)
        {
            if(tar%coins[idx]==0)
            return 1;
            return 0;
        }
        if(dp[idx][tar]!=null)
        return dp[idx][tar];
        int take=0;
        if(coins[idx]<=tar)
        take=helper1(idx,tar-coins[idx],coins);
        int nottake=helper1(idx+1,tar,coins);
        return dp[idx][tar]=take+nottake;
    }
    public int change(int amount, int[] coins) {
        dp=new Integer[coins.length+1][amount+1];
        return helper1(0,amount,coins);
    }
}