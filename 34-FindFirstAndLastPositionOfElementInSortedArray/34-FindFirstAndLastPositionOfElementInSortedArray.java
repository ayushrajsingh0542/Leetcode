// Last updated: 15/08/2026, 20:10:10
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=nums.length;
        int m[]=new int[2];
        m[0]=-1;
        m[1]=-1;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==target)
            {
               m[0]=i;
                break;
            }
        }
        for(int i=l-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
               m[1]=i;
                break;
            }
        }
       return m;
    }
}