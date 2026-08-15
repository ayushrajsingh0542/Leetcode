// Last updated: 15/08/2026, 19:48:45
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%2==0)
                {
                    ans=nums[i];
                    j=i;
                    break;
                }
            }
        if(ans==0)
            return ans;
        for(int i=j+1;i<nums.length;i++)
            {
                if(nums[i]%2==0)
                    ans=ans|nums[i];
            }
        return ans;
    }
}