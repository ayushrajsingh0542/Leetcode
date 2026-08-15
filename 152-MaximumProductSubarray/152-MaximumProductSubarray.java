// Last updated: 15/08/2026, 20:05:55
class Solution {
    public int maxProduct(int[] nums) {
        int pre=1,suff=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            pre*=nums[i];
            max=Math.max(pre,max);
            if(pre==0)
            pre=1;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            suff*=nums[i];
            max=Math.max(suff,max);
            if(suff==0)
            suff=1;
        }

        return max;
    }
}