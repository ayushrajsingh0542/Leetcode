// Last updated: 15/08/2026, 19:50:39
class Solution {
    public long minimumCost(String source, String target, char[] og, char[] cd, int[] cost) {
        int INF = (int)1e9;
        int[][] d = new int[26][26];

        for (int i = 0; i < 26; i++) {
            Arrays.fill(d[i], INF);
            d[i][i] = 0;
        }

        for (int i = 0; i < og.length; i++) {
            int u = og[i] - 'a';
            int v = cd[i] - 'a';
            d[u][v] = Math.min(d[u][v], cost[i]);
        }

        for (int via = 0; via < 26; via++)
            for (int i = 0; i < 26; i++)
                for (int j = 0; j < 26; j++)
                    if (d[i][via] + d[via][j] < d[i][j])
                        d[i][j] = d[i][via] + d[via][j];

        long ans = 0;
        for (int i = 0; i < source.length(); i++) {
            int s = source.charAt(i) - 'a';
            int t = target.charAt(i) - 'a';
            if (d[s][t] == INF)
             return -1;
            ans += d[s][t];
        }
        return ans;
    }
}
