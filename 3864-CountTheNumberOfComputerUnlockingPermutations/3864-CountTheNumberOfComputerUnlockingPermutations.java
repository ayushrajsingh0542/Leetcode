// Last updated: 15/08/2026, 19:49:22
class Solution {
    public int countPermutations(int[] comp) {
        int st=comp[0];
        int c=0;
        int mod=(int)(1e9+7);
        for(int i=1;i<comp.length;i++)
        {
           if(comp[i]<=st)
           return 0;
           c=(c+1)%mod;
        }
        long ans=1;
        for(int i=1;i<=c;i++)
        {
            ans=(ans*i)%mod;
        }
        return (int)ans;
    }
}