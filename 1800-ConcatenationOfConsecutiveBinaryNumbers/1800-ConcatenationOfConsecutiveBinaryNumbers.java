// Last updated: 15/08/2026, 19:53:47
class Solution {
    
    public int concatenatedBinary(int n) {
        int mod = (int)(1e9 + 7);
        long ans = 0;
        
        for(int i = 1; i <= n; i++) {
            int num = i;
            int bits = 0;
            int temp = num;
            
            while(temp != 0) {
                bits++;
                temp >>= 1;
            }
            
            ans = (ans << bits) % mod;
            ans = (ans + num) % mod;
        }

        return (int)ans;
    }
}