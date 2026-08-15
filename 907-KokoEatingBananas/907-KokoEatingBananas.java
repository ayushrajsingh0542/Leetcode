// Last updated: 15/08/2026, 19:58:42
class Solution {
    public static int sumD(int piles[],int mid)
    {
        int ans=0;
        for(int i=0;i<piles.length;i++)
        {
            ans+=Math.ceil((double)(piles[i])/(double)(mid));
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1,high=piles[piles.length-1];
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(sumD(piles,mid)<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}