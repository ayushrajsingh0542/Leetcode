// Last updated: 15/08/2026, 19:52:22
class Solution {
    public long subArrayRanges(int[] nums) {
 
        
        long ans=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
           
            for(int j=i;j<nums.length;j++)
            {
                max=Math.max(max,Math.max(x,nums[j]));
                min=Math.min(min,Math.min(x,nums[j]));
                ans+=max-min;
            }
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
        }
        return ans;
        
        
    }
}