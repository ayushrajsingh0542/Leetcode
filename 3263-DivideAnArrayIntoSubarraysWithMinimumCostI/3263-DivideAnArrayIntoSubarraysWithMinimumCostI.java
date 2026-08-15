// Last updated: 15/08/2026, 19:50:36
class Solution {
    public int minimumCost(int[] nums) {
        int a=nums[0];
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=m1)
            {
                m2=m1;
                m1=nums[i];
            }
            else if(nums[i]>m1 && nums[i]<m2)
            {
                m2=nums[i];
            }
        }
        return a+m1+m2;
    }
}