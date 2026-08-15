// Last updated: 15/08/2026, 19:49:21
class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<10)
                {
                if(i==nums[i])
                {
                    return i;
                    // min=Math.min(min,i);
                    // continue;
                }
                }
                else
                {
                int x=nums[i];
                int sum=0;
                while(x>0)
                    {
                        sum+=x%10;
                        x=x/10;
                    }
                    if(sum==i)
                        return sum;
                // min=Math.min(min,sum);
            }
            }
        return -1;
        
    }
}