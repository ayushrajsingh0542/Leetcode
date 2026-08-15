// Last updated: 15/08/2026, 19:54:50
class Solution {
    public int numOfWays(int n) {

        if(n==1)
        return 12;

        int mod=(int)(1e9+7);
        long three=6,two=6;
       
        n--;
       while(n>0)
       {
       long temp=((three*2)+(two*3))%mod;
        three=((three*2)+(two*2))%mod;
        two=temp;
        n--;
       }

       return (int)(two+three)%mod;

        
    }
}