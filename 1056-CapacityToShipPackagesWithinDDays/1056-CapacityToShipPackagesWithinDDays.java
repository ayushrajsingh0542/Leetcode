// Last updated: 15/08/2026, 19:57:32
class Solution {
    public static int daysHelper(int weights[],int d)
    {
        int noDays=1,load=0;
        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>d)
            {
                noDays++;
                load=weights[i];
            }
            else
            {
                load+=weights[i];
            }
        }
        return noDays;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++)
        {
            high+=weights[i];
            low=Math.max(low,weights[i]);
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int noDays=daysHelper(weights,mid);
            if(noDays<=days)
            {
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