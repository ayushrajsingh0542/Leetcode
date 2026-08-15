// Last updated: 15/08/2026, 20:06:27
class Solution {
    public int singleNumber(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        int value=1;
        int once=0;
        for(int i=0;i<l;i++)
        {
            if(i==l-1)
            {
                if(value==1)
                {
                    once=nums[i];
                }
                break;
            }
            if(nums[i]==nums[i+1])
            {
                value++;
            }
            if(nums[i]!=nums[i+1])
            {
                if(value==1)
                {
                    once=nums[i];
                    break;
                }
                value=1;

            }
        }
        return once;
        
    }
}