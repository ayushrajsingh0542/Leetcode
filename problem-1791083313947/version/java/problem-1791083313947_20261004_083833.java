// Last updated: 04/10/2026, 08:38:33
1class Solution {
2    public int minRotations(int n, String s) {
3        int org=0;
4        int cur=0;
5
6        for(char c:s.toCharArray())
7            {
8                int next=c-'0';
9                int diff=Math.abs(cur-next);
10                org+=Math.min(diff,10-diff);
11                cur=next;
12            }
13
14        int ans=org;
15        int last=s.charAt(n-1)-'0';
16        int first=s.charAt(0)-'0';
17        int diff=Math.abs(last-0);
18        int newC=org-Math.min(Math.abs(first-0),10-Math.abs(first-0))+Math.min(diff,10-diff);
19
20        ans=Math.min(ans,newC);
21
22        for(int k=1;k<n;k++)
23        {
24            int bef=s.charAt(k-1)-'0';
25            int curdig=s.charAt(k)-'0';
26
27            int old=Math.abs(bef-curdig);
28            old=Math.min(old,10-old);
29
30            int newE=Math.abs(bef-last);
31            newE=Math.min(newE,10-newE);
32
33            int cost=org-old+newE;
34            ans=Math.min(ans,cost);
35        }
36        return ans;
37    }
38}