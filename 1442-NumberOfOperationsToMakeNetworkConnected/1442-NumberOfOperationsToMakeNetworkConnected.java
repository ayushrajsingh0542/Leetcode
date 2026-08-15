// Last updated: 15/08/2026, 19:55:27
class DSU
{
    int par[];
    int size[];
    public DSU(int n)
    {
      par=new int[n];
      size=new int[n];
      
      for(int i=0;i<n;i++)
      {
        par[i]=i;
        size[i]=1;
      }
    }

    public int findUPar(int x)
    {
        if(x==par[x])
        return x;
        return par[x]=findUPar(par[x]);
    }

    public boolean find(int u,int v)
    {
        return findUPar(u)==findUPar(v);
    }

    public void union(int u,int v)
    {
        int pu=findUPar(u);
        int pv=findUPar(v);
        if(pu==pv)
        return;
        if(size[pu]<size[pv])
        {
            par[pu]=pv;
            size[pv]+=size[pu];
        }
        else
        {
            par[pv]=pu;
            size[pu]+=size[pv];
        }
    }
}


class Solution {
    public int makeConnected(int n, int[][] arr) {
        DSU dsu=new DSU(n);
        int extra=0;
        for(int i=0;i<arr.length;i++)
        {
            int u=arr[i][0];
            int v=arr[i][1];
            if(dsu.findUPar(u)==dsu.findUPar(v))
            extra++;
            else
            {
                dsu.union(u,v);
            }
        }

        int count=0;
        for(int i=0;i<n;i++)
        {
            if(dsu.par[i]==i)
            count++;
        }
        int ans=count-1;
        if(extra>=ans)
        return ans;
        return -1;
    }
}