// Last updated: 15/08/2026, 20:22:48
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4
5        int cost[][]=new int[26][26];
6        for(int i=0;i<26;i++)
7            {
8                for(int j=0;j<26;j++)
9                    {
10                        int x=Math.abs(i-j);
11                        cost[i][j]=Math.min(x,26-x);
12                    }
13            }
14
15        int ans=Integer.MAX_VALUE;
16
17        for(int rot=0;rot<n;rot++)
18            {
19                int op=rot;
20                int left=0;
21                int rt=n-1;
22                while(left<rt)
23                    {
24                        int ft=s.charAt((left+rot)%n)-'a';
25                        int sec=s.charAt((rt+rot)%n)-'a';
26                        op+=cost[ft][sec];
27
28                        left++;
29                        rt--;
30                    }
31                ans=Math.min(ans,op);
32            }
33        return ans;
34    }
35}