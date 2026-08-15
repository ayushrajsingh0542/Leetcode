// Last updated: 15/08/2026, 19:52:00
class Solution {
    public int minBitFlips(int start, int goal) {

        int ans=start^goal;
        int c=0;
        while(ans!=0)
        {
            if((ans&1)!=0)
            c++;
            ans=ans>>1;
        }
        return c;
        
    }
}