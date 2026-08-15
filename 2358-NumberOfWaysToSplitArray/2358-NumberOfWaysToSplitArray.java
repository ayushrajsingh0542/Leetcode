// Last updated: 15/08/2026, 19:51:53
class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftPre[]=new long[nums.length];
        long rightPre[]=new long[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
           sum+=nums[i];
           leftPre[i]=sum;
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--)
        {
           sum+=nums[i];
           rightPre[i]=sum;
        }
        long count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(leftPre[i-1]>=rightPre[i])
            count++;
        }
        return (int)count;
    }
}