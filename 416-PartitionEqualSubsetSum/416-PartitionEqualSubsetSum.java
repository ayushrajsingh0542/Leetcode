// Last updated: 15/08/2026, 20:02:32
class Solution {
    Boolean dp[][];
    public boolean helper1(int idx,int tar,int nums[])
    {
        if(tar==0)
        return true;
        if(idx==nums.length-1)
        {
            return nums[idx]==tar;
        }
        if(tar<0)
        return false;
        if(dp[idx][tar]!=null)
        return dp[idx][tar];
        boolean take=helper1(idx+1,tar-nums[idx],nums);
        boolean nottake=helper1(idx+1,tar,nums);
        return dp[idx][tar]=take||nottake;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
        sum+=i;
        if(sum%2!=0)
        return false;
        dp=new Boolean[nums.length+1][sum/2+1];
        return helper1(0,sum/2,nums);
    }
}