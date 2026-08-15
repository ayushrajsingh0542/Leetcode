// Last updated: 15/08/2026, 19:47:06
class Solution {
    public int minOperations(int[] a) {
        int n=a.length,c=0;
        int m=200000;
        boolean p[]=sv(m);

        for(int i=0;i<n;i++)
            {
                int x=a[i];
                if(i%2==0)
                {
                    while(!p[x])
                        {
                            x++;
                            c++;
                        }
                }
                else
                {
                    while(p[x])
                        {
                            x++;
                            c++;
                        }
                }
            }
        return c;
    }
    boolean[] sv(int n)
    {
        boolean p[]=new boolean[n+1];
        for(int i=2;i<=n;i++)
            p[i]=true;
        for(int i=2;i*i<=n;i++)
            {
                if(p[i])
                {
                    for(int j=i*i;j<=n;j+=i)
                        {
                            p[j]=false;
                        }
                }
            }
return p;
    }
}