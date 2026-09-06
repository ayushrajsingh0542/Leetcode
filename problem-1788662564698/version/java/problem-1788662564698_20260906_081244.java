// Last updated: 06/09/2026, 08:12:44
1class Solution {
2    public int countGoodRotations(int[] nums) {
3        int n=nums.length;
4        int half=n/2;
5
6        long total=0;
7        for(int x:nums)
8            {
9                total+=x;
10            }
11        long wsum=0;
12        for(int i=0;i<half;i++)
13        {
14            wsum+=nums[i];
15        }
16        int ans=0;
17        for (int i = 0; i < n; i++) {
18            if (2 * wsum > total) {
19                ans++;
20            }
21
22            wsum-=nums[i];
23            wsum+=nums[(i+half)%n];
24    }
25        return ans;
26}}