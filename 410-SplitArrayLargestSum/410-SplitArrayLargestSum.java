// Last updated: 15/08/2026, 20:02:34
class Solution {
    public int countArrays(int allowed,int nums[])
    {
        int count=1;
        int last=0;
        for(int i=0;i<nums.length;i++)
        {
            if(last+nums[i]<=allowed)
            last+=nums[i];
            else
            {
                count++;
                last=nums[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int i=0;i<nums.length;i++)
        {
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int arrays=countArrays(mid,nums);
            if(arrays<=k)
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
}