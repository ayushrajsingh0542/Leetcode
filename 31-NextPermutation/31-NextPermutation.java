// Last updated: 15/08/2026, 20:10:17
class Solution {
    public void nextPermutation(int[] nums) {

        int ind=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        {
            int l=nums.length-1;
            for(int i=0;i<nums.length;i++)
            {
                if(l-i>=i)
                {
                    int temp=nums[i];
                    nums[i]=nums[l-i];
                    nums[l-i]=temp;
                }
            }
            return;
        }
        int swInd=-1;
        for(int i=nums.length-1;i>ind;i--)
        {
            if(nums[i]>nums[ind])
            {
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }

        int l=nums.length-1;
        int j=0;
        for(int i=ind+1;i<nums.length;i++)
        {
            if(l-j>i)
            {
                int temp=nums[i];
                nums[i]=nums[l-j];
                nums[l-j]=temp;
                j++;
            }
        }
        
    }
}