// Last updated: 15/08/2026, 20:00:03
class Solution {
    public boolean hasAlternatingBits(int n) {
        int last=n&1;
        while(n!=0)
        {
            if(last!=(n&1))
            return false;
            if(last==1)
            last=0;
            else if(last==0)
            last=1;
            n=n>>1;
        }
        return true;
    }
}