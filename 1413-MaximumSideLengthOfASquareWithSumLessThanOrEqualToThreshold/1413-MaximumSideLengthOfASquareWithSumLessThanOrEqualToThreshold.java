// Last updated: 15/08/2026, 19:55:40
class Solution {
    public int maxSideLength(int[][] mat, int t) {
        int n=mat.length, m=mat[0].length;
        int row[][]=new int[n][m];
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<m;j++){
                s+=mat[i][j];
                row[i][j]=s;
            }
        }
        int ans=0;
        int lim=Math.min(n,m);
        for(int k=1;k<=lim;k++){
            boolean ok=false;
            for(int i=0;i+k-1<n;i++){
                for(int j=0;j+k-1<m;j++){
                    int sum=0;
                    for(int x=i;x<i+k;x++){
                        sum+=row[x][j+k-1]-(j>0?row[x][j-1]:0);
                        if(sum>t) 
                        break;
                    }
                    if(sum<=t){
                        ok=true;
                        break;
                    }
                }
                if(ok)
                 break;
            }
            if(ok) 
            ans=k;
        }
        return ans;
    }
}
