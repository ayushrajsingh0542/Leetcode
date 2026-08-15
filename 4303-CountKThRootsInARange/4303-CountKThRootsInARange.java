// Last updated: 15/08/2026, 19:46:48
class Solution {
    public int countKthRoots(int l, int r, int k) {

        if(k == 1)
            return r - l + 1;

        int c = 0;

        for(long x = 0; ; x++)
        {
            long v = 1;

            if(x == 0)
            {
                v = 0;
            }
            else
            {
                for(int i = 0; i < k; i++)
                {
                    if(v > r / x)
                    {
                        v = r + 1;
                        break;
                    }

                    v *= x;
                }
            }

            if(v > r)
                break;

            if(v >= l)
                c++;
        }

        return c;
    }
}