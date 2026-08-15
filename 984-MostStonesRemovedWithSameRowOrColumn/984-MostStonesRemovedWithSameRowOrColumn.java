// Last updated: 15/08/2026, 19:58:14
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
    public int removeStones(int[][] stones) {
        int maxRow=0;
        int maxCol=0;
        int total=stones.length;
        for(int stone[]:stones)
        {
            maxRow=Math.max(maxRow,stone[0]);
            maxCol=Math.max(maxCol,stone[1]);
        }
        DSU dsu=new DSU(maxRow+maxCol+2);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int stone[]:stones)
        {
            int row=stone[0];
            int col=stone[1]+maxRow+1;
             dsu.union(row,col);
             map.put(row,1);
             map.put(col,1);
        }

        int count=0;
        for(int k:map.keySet())
        {
            if(dsu.findUPar(k)==k)
            count++;
        }
        return total-count;
    }
}