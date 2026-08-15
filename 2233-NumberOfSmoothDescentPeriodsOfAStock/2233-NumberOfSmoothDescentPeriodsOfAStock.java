// Last updated: 15/08/2026, 19:52:18
class Solution {
    public long getDescentPeriods(int[] prices) {
        
        long ans=0;
        long mul=1;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i-1]-prices[i]==1)
            {
                ans+=mul;
                mul++;
            }
            else
            {
                mul=1;
            }
        }
        return ans+prices.length;
    }
}