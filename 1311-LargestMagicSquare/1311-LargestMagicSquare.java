// Last updated: 15/08/2026, 19:56:09
class Solution {
    public int largestMagicSquare(int[][] g) {
        int n=g.length, m=g[0].length;
        int ans=1;
        for(int st=2; st<=Math.min(n,m); st++){
            for(int i=0;i+st<=n;i++){
                for(int j=0;j+st<=m;j++){
                    int sum = 0;
                    
                    
                    for(int k=0;k<st;k++) 
                    sum += g[i][j+k];
                    
                   
                    int bot = 0;
                    for(int k=0;k<st;k++) 
                    bot += g[i+st-1][j+k];
                    if(bot!=sum) 
                    continue;
                    
                 
                    int left = 0;
                    for(int k=0;k<st;k++) 
                    left += g[i+k][j];
                    if(left!=sum) 
                    continue;
                    
                   
                    int right = 0;
                    for(int k=0;k<st;k++) 
                    right += g[i+k][j+st-1];
                    if(right!=sum) 
                    continue;
                    
                    
                    int diag=0;
                    for(int k=0;k<st;k++) 
                    diag+=g[i+k][j+k];
                    if(diag!=sum) 
                    continue;
                    
                    
                    int adiag=0;
                    for(int k=0;k<st;k++)
                     adiag+=g[i+k][j+st-1-k];
                    if(adiag!=sum)
                    continue;
                    
                    
                    
                    boolean ok=true;
                    for(int r=i;r<i+st && ok;r++){
                        int x=0;
                        for(int c=j;c<j+st;c++)
                         x+=g[r][c];
                        if(x!=sum) 
                        ok=false;
                    }
                    for(int c=j;c<j+st && ok;c++){
                        int x=0;
                        for(int r=i;r<i+st;r++)
                         x+=g[r][c];
                        if(x!=sum)
                         ok=false;
                    }
                    
                    if(ok) 
                    ans=Math.max(ans,st);
                }
            }
        }
        return ans;
    }
}
