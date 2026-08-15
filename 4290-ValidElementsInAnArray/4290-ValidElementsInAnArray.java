// Last updated: 15/08/2026, 19:46:53
class Solution {
    public List<Integer> findValidElements(int[] a) {
        int n=a.length;
        List<Integer>ans=new ArrayList<>();
        if(n==1)
        {
            ans.add(a[0]);
            return ans;
        }
        int l[]=new int[n];
        int r[]=new int[n];

        l[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
            {
                l[i]=Math.max(l[i-1],a[i-1]);
            }
        r[n-1]=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--)
            {
                r[i]=Math.max(r[i+1],a[i+1]);
            }
        for(int i=0;i<n;i++)
            {
                if(i==0 || i==n-1||a[i]>l[i]||a[i]>r[i])
                {
                    ans.add(a[i]);
                }
            }

        return  ans;
    }
}