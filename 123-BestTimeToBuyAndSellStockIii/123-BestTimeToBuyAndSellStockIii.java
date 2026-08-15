// Last updated: 15/08/2026, 20:06:53
class Solution {
    Integer dp[][][];
    public int helper1(int b,int i,int t,int p[])
    {
       if(t==2 || i==p.length)
       {
        return 0;
       }
       if(dp[i][b][t]!=null)
       return dp[i][b][t];
       int profit=0;
       if(b==1)
       {
         profit=Math.max(-p[i]+helper1(0,i+1,t,p),helper1(1,i+1,t,p));
       }
       else
       {
         profit=Math.max(p[i]+helper1(1,i+1,t+1,p),helper1(0,i+1,t,p));
       }

       return dp[i][b][t]=profit;
    }
    public int maxProfit(int[] prices) {
        dp=new Integer[prices.length][2][3];
        return helper1(1,0,0,prices);
    }
}