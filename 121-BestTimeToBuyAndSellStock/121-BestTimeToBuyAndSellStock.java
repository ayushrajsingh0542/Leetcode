// Last updated: 15/08/2026, 20:06:58
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=prices[0];
        for(int i=1;i<n-1;i++)
        {
          left[i]=Math.min(prices[i],left[i-1]);
        }
        right[n-1]=prices[n-1];
        for(int i=n-2;i>=1;i--)
        {
           right[i]=Math.max(prices[i],right[i+1]); 
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            int diff=right[i+1]-left[i];
            ans=Math.max(ans,diff);
            
        }
        if(ans<=0)
        return 0;
        return ans;
    }
}