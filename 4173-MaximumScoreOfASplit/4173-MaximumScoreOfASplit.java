// Last updated: 15/08/2026, 19:47:50
class Solution {
    public long maximumScore(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            sum+=nums[i];
        }
        long min=nums[n-1];
        long ans=sum-min;
        for(int i=n-2;i>=0;i--)
        {
            min=Math.min(min,nums[i+1]);
            long temp=sum-min;
            ans=Math.max(ans,temp);
            sum-=nums[i];
        }
        return ans;
    }
}