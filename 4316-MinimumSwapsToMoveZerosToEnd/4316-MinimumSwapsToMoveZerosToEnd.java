// Last updated: 15/08/2026, 19:46:32
class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int z=0;

        for(int x:nums)
            {
                if(x==0)
                    z++;
            }
        int c=0;
        for(int i=n-z;i<n;i++)
            {
                if(nums[i]!=0)
                    c++;
            }
        return c;
    }
}