// Last updated: 15/08/2026, 20:08:51
class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        return x;
        int low=1,high=x/2;
        while(low<=high)
        {
            int mid=low+(-low+high)/2;
            if((long)mid*mid==x)
            return mid;
            else if((long)mid*mid<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return high;
    }
}