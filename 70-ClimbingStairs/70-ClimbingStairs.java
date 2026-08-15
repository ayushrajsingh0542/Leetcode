// Last updated: 15/08/2026, 20:08:48
class Solution {
    Integer dp[];
    public int helper1(int n)
    {
        if(n==1 || n==2)
        return n;
        if(n<=0)
        {
            return 0;
        }
        if(dp[n]!=null)
        {
            return dp[n];
        }
        return dp[n]=helper1(n-1)+helper1(n-2);
    }
    public int climbStairs(int n) {
        dp=new Integer[n+1];
        return helper1(n);
    }
}