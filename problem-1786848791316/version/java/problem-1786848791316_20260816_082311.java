// Last updated: 16/08/2026, 08:23:11
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3
4        int maxl=0;
5        for(int l:lights)
6            {
7                maxl=Math.max(maxl,l);
8            }
9
10        int ans=0;
11
12        for(int t:arrivalTime)
13            {
14                int r=t%period;
15
16                int wt=r<maxl?0:period-r;
17                ans=Math.max(ans,wt);
18            }
19        return ans;
20    }
21}