// Last updated: 16/08/2026, 23:08:54
1class Solution {
2    public class Info implements Comparable<Info>
3    {
4        int x,y,sum;
5        Info(int x,int y,int s)
6        {
7            this.x=x;
8            this.y=y;
9            this.sum=s;
10        }
11        @Override
12        public int compareTo(Info i2)
13        {
14            return this.sum-i2.sum;
15        }
16    }
17
18    public class Pair
19    {
20        int x, y;
21        Pair(int x,int y)
22        {
23            this.x=x;
24            this.y=y;
25        }
26    }
27
28    //set is to handle duplicates and stores index in terms of string
29
30    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
31        PriorityQueue<Info> pq=new PriorityQueue<>();
32        pq.add(new Info(0,0,nums1[0]+nums2[0]));
33
34        List<List<Integer>> ans=new ArrayList<>();
35        int n=nums1.length;
36        int m=nums2.length;
37
38        HashSet<String> set=new HashSet<>();
39        set.add("0,0");
40
41        while(k>0 && !pq.isEmpty())
42        {
43            Info curr=pq.remove();
44
45            List<Integer> list=new ArrayList<>();
46            list.add(nums1[curr.x]);
47            list.add(nums2[curr.y]);
48
49            ans.add(list);
50            k--;
51
52            if(curr.x+1<n)//i+1,j
53            {
54                String key=(curr.x+1)+","+curr.y;
55                if(!set.contains(key))
56                {
57                    pq.add(new Info(curr.x+1,curr.y,
58                        nums1[curr.x+1]+nums2[curr.y]));
59                    set.add(key);
60                }
61            }
62
63            if(curr.y+1<m)//i,j+1
64            {
65                String key=curr.x+","+(curr.y+1);
66                if(!set.contains(key))
67                {
68                    pq.add(new Info(curr.x,curr.y+1,
69                        nums1[curr.x]+nums2[curr.y+1]));
70                    set.add(key);
71                }
72
73                //min sum is handled by min heap info
74            }
75        }
76
77        return ans;
78    }
79}