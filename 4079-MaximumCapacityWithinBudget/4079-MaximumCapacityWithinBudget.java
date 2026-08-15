// Last updated: 15/08/2026, 19:48:19
class Solution {
    public int maxCapacity(int[] costs, int[] cap, int budget) {
        int n=costs.length;
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=costs[i];
            a[i][1]=cap[i];
        }
        java.util.Arrays.sort(a,(x,y)->x[0]-y[0]);
        int[] best=new int[n];
        best[0]=a[0][1];
        for(int i=1;i<n;i++) best[i]=Math.max(best[i-1],a[i][1]);
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i][0]<budget && a[i][1]>ans) ans=a[i][1];
        }
        for(int i=1;i<n;i++){
            int need=budget-a[i][0];
            int l=0,r=i-1,p=-1;
            while(l<=r){
                int m=(l+r)>>1;
                if(a[m][0]<need){p=m;l=m+1;}
                else r=m-1;
            }
            if(p!=-1){
                int v=a[i][1]+best[p];
                if(v>ans) ans=v;
            }
        }
        return ans;
    }
}
