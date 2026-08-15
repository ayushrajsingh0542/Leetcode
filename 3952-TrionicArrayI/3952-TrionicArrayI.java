// Last updated: 15/08/2026, 19:48:52
class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int p=0;
        for(int i=1;i<n;i++)
        {
           if(nums[i]<=nums[i-1])
           {
            p=i-1;
            break;
           }
        }
        if(p==0)
        return false;
        int q=p;
        for(int i=q+1;i<n;i++)
        {
            if(nums[i]>=nums[i-1])
            {
                q=i-1;
                break;
            }
        }
        if(q==p)
        return false;
        int l=q;
        for(int i=l+1;i<n;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                return false;
            }
        }
       
        return true;
    }
}