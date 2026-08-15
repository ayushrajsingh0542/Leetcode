// Last updated: 15/08/2026, 19:46:40
class Solution {
    public boolean consecutiveSetBits(int n) {
        int c=0;
        int prev=0;
        while(n!=0)
            {
                int bit=n&1;
                if(prev==1 && bit==1)
                {
                    c++;
                }
                prev=bit;
                n=n>>1;
            }
        return c==1;
    }
}