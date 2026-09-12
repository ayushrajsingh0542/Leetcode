// Last updated: 06/09/2026, 16:48:03
1class Solution {
2    public int minDays(int n) {
3        int[] dp = new int[n + 1];
4        Arrays.fill(dp, Integer.MAX_VALUE);
5        dp[0] = 0;
6
7        for (int i = 0; i <= n; i++) {
8            if (dp[i] == Integer.MAX_VALUE) 
9            continue;
10
11            int sum = 0;
12
13            for (int j = 1; i + sum + j <= n; j++) {
14                sum += j;
15
16                dp[i + sum] = Math.min(
17                    dp[i + sum],
18                    dp[i] + j + (i == 0 ? 0 : 1)
19                );
20            }
21        }
22
23        return dp[n];
24    }
25}