// Last updated: 15/08/2026, 19:51:37
class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int n1=queries.length;
        int m1=queries[0].length;
        int ans[]=new int[n1];
        int mod=(int)(1e9+7);
        List<Long>list=new ArrayList<>();
        long count=1;
        for (int bit = 0; bit < 32; bit++) {
    if ((n & (1 << bit)) != 0) {
        list.add(1L << bit);
    }
}

        for(int i=0;i<n1;i++)
        {
            int l=queries[i][0];
            int r=queries[i][1];
            if(l==r)
            {
                long nums=list.get(l);
                int num=(int)(nums%mod);
                ans[i]=num;
    
            }
            else
            {
                int num=1;
                for(int j=l;j<=r;j++)
                {
                    num = (int)(( (long) num * list.get(j) ) % mod);

                }
                ans[i]=num;
            }
        }
        return ans;
    }
}