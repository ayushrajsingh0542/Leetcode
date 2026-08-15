// Last updated: 15/08/2026, 19:50:00
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long preSum[]=new long[n];
        preSum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            preSum[i]=nums[i]+preSum[i-1];
        }

        long ans=Long.MIN_VALUE;
        for(int start=0;start<k;start++)
        {
            int i=start;
            long currSum=0;
            while(i<n && i+k-1<n)
            {
                int j=i+k-1;
                long subSum=0;
                if(i>0)
                subSum=preSum[j]-preSum[i-1];//this calc the block of k ka sum...basically like saying nums[i] in kadanes but for entire block k
                else 
                subSum=preSum[j];
                currSum=Math.max(subSum,currSum+subSum);
                ans=Math.max(ans,currSum);
                i=i+k;
            }
        }

        return ans;
    }
}