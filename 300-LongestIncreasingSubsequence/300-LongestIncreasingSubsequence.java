// Last updated: 15/08/2026, 20:03:13
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int max=1;
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++)
        {
            
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]>nums[i] && dp[j]<1+dp[i])
                {
                    dp[j]=1+dp[i];
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}