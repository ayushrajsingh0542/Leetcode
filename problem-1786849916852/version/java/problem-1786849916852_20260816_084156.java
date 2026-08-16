// Last updated: 16/08/2026, 08:41:56
1class Solution {
2    public int maximumGap(String skill, String station) {
3        int n=skill.length();
4        int m=station.length();
5
6        int left[]=new int[n];
7        int right[]=new int[n];
8
9        int j=0;
10
11        for(int i=0;i<n;i++)
12            {
13                while(station.charAt(j)!=skill.charAt(i))
14                    {
15                        j++;
16                    }
17                left[i]=j;
18                j++;
19            }
20        j=m-1;
21        for(int i=n-1;i>=0;i--)
22            {
23                while(station.charAt(j)!=skill.charAt(i))
24                    {
25                        j--;
26                    }
27                right[i]=j;
28                j--;
29            }
30        int ans = 0;
31
32        for (int i = 0; i < n - 1; i++) {
33            ans = Math.max(ans, right[i + 1] - left[i]);
34        }
35
36        return ans;
37    }
38}