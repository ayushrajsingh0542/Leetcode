// Last updated: 15/08/2026, 20:02:56
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n%4!=0 || n<=0)
        return false;
        
        for(long i=4;i<=n;i*=4)
        {
           if(i==n)
           return true;
        }
        return false;
    }
}