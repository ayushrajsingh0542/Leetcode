// Last updated: 15/08/2026, 19:50:58
class Solution {
    int mod=(int)(1e9+7);
    Integer dp[][];
    public int rec(int idx,int sum,List<Integer>list)
    {
        if(sum==0)
        return 1;
        if(idx==list.size()||sum<0)
        return 0;
        if(dp[idx][sum]!=null)
        return dp[idx][sum];
        int take=0,nottake=0;
        if(list.get(idx)<=sum)
        {
            take= rec(idx+1,sum-list.get(idx),list);
        }
        nottake= rec(idx+1,sum,list);
        return dp[idx][sum]=(take+nottake)%mod;
    }
    public int numberOfWays(int n, int x) {
        List<Integer>list=new ArrayList<>();
        
        for(int i=1;i<=n;i++)
        {
            int num=((int)Math.pow(i,x)%mod);
            if(num<=n)
            list.add(num);
        }
         dp=new Integer[list.size()][n+1];
        return rec(0,n,list);

    }
}