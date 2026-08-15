// Last updated: 15/08/2026, 19:46:18
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxL=nums[0];
        int ans=0;

        for(int j=k;j<nums.length;j++)
            {
            maxL=Math.max(maxL,nums[j-k]);
            ans=Math.max(ans,maxL+nums[j]);
            }

        return ans;
    }
}