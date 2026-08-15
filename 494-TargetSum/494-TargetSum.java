// Last updated: 15/08/2026, 20:01:59
class Solution {
    public int helper1(int idx,int tar,int nums[])
    {
        if(idx==nums.length)
        {
          if(tar==0)
          return 1;
          return 0;
        }
        int plus=helper1(idx+1,tar-nums[idx],nums);
        int minus=helper1(idx+1,tar+nums[idx],nums);

        return plus+minus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper1(0,target,nums);
    }
}