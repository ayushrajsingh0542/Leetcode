// Last updated: 15/08/2026, 20:03:20
class Solution {
    public void moveZeroes(int[] nums) {
        int end=nums.length-1;
        int start=0;
        int m[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
            m[end]=nums[i];
            end--;
            }
            if(nums[i]!=0)
            {
            m[start]=nums[i];
            start++;
            }

        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=m[i];
        }
        
    }
}