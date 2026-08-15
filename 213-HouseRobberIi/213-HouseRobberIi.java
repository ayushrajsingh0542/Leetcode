// Last updated: 15/08/2026, 20:04:22
class Solution {
    Integer dp[];
    public  int helper1(int nums[],int idx,int end)
    {
        if(idx==end)
        return nums[end];
        if(idx>end)
        return 0;
        if(dp[idx]!=null)
        return dp[idx];
        int take=nums[idx]+helper1(nums,idx+2,end);
        int nottake=helper1(nums,idx+1,end);
        return dp[idx]=Math.max(take,nottake);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        dp=new Integer[n+1];
        int first=helper1(nums,0,n-2);
        dp=new Integer[n+1];
        int sec=helper1(nums,1,n-1);
        return Math.max(first,sec);
    }
}