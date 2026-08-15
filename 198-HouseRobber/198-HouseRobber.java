// Last updated: 15/08/2026, 20:04:46
class Solution {
    Integer dp[];
    public int helper1(int idx,int nums[])
    {
        if(idx==nums.length-1)
        return nums[idx];
        if(idx>nums.length-1)
        return 0;
        if(dp[idx]!=null)
        return dp[idx];
        int take=nums[idx]+helper1(idx+2,nums);
        int nottake=helper1(idx+1,nums);
        return dp[idx]=Math.max(take,nottake);
    }
    public int rob(int[] nums) {
        dp=new Integer[nums.length+1];
        return helper1(0,nums);
    }
}