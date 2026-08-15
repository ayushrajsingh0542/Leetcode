// Last updated: 15/08/2026, 20:02:15
class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        int i=1;
        while(n>=i)
        {
           
                n-=i;
                ans++;
                i++;
            
        }
        return ans;
    }
}