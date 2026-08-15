// Last updated: 15/08/2026, 19:55:11
class Solution {
    static class Rows implements Comparable<Rows>
    {
        int sd;
        int idx;
        Rows(int sd,int idx)
        {
            this.sd=sd;
            this.idx=idx;

        }
        @Override
        public int compareTo(Rows r2)
        {
            if(this.sd==r2.sd)
            return this.idx-r2.idx;
            else
            return this.sd-r2.sd;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<Rows>pq=new PriorityQueue<>();
        int m=mat.length;
        int n=mat[0].length;
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                c++;
            }
            pq.add(new Rows(c,i));
            c=0;
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.remove().idx;
        }
        return ans;
    }
}