// Last updated: 15/08/2026, 20:03:23
class Solution {
    Integer dp[][];
    public int rec(int idx,int sum,List<Integer>list)
    {
        if(sum==0)
        return 0;
        if(idx==list.size()||sum<0)
        return Integer.MAX_VALUE;
        if(dp[idx][sum]!=null)
        return dp[idx][sum];
        int take=Integer.MAX_VALUE,nottake;
        if(list.get(idx)<=sum)
        {
            int val=rec(idx,sum-list.get(idx),list);
            if(val!=Integer.MAX_VALUE)
            take=1+val;
        }
        nottake= rec(idx+1,sum,list);
        return dp[idx][sum]=Math.min(take,nottake);
    }
    public int numSquares(int n) {
        List<Integer>list=new ArrayList<>();
        
        for(int i=1;i<=n;i++)
        {
            int num=i*i;
            if(num<=n)
            list.add(num);
        }
         dp=new Integer[list.size()][n+1];
        return rec(0,n,list);

    }
}