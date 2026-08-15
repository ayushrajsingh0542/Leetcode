// Last updated: 15/08/2026, 19:47:28
class Solution {
    public int countMonobit(int n) {
        int c=1;
        int x=1;
        while(x<=n)
            {
                c++;
                x=(x<<1)|1;
            }
        return c;
    }
}