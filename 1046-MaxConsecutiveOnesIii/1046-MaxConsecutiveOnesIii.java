// Last updated: 15/08/2026, 19:57:40
class Solution {
    public int longestOnes(int[] nums, int k) {

        int max=0,l=0,r=0,z=0;
        while(r<nums.length)
        {
            if(nums[r]==0)
            {
                z++;
            }
            while(z>k)
            {
                if(nums[l]==0)
                {
                    z--;
                }
                l++;
            }
            
                max=Math.max((r-l+1),max);
            
            r++;
        }
        return max;
    }
}