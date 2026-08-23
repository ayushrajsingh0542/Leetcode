// Last updated: 23/08/2026, 15:52:58
1class Solution {
2    public int findPeakElement(int[] nums) {
3        if(nums.length==1)
4        return 0;
5        int n=nums.length;
6        if(nums.length==2)
7        {
8            if(nums[0]>nums[1])
9            return 0;
10            return 1;
11        }
12       for(int i=1;i<n-1;i++)
13       {
14          if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
15          {
16            return i;
17          }
18       }
19       if(nums[0]>nums[n-1])
20       return 0;
21       return n-1;
22    }
23}