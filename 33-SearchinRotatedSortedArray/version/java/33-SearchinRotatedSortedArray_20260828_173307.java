// Last updated: 28/08/2026, 17:33:07
1class Solution {
2    public int findMin(int nums[])
3    {
4        int n=nums.length;
5        int l=0,r=n-1;
6        while(l<r)
7        {
8            int mid=l+(r-l)/2;
9            if(nums[mid]>nums[r])
10            {
11                l=mid+1;
12            }
13            else
14            {
15                r=mid;
16            }
17        }
18        return r;
19    }
20    public int bs(int si,int ei,int nums[],int tar)
21    {
22        int n=nums.length;
23        int l=si,r=ei;
24        while(l<=r)
25        {
26            int mid=l+(r-l)/2;
27            if(nums[mid]==tar)
28            {
29                return mid;
30            }
31            else if(nums[mid]>tar)
32            {
33                r=mid-1;
34            }
35            else
36            {
37                l=mid+1;
38            }
39        }
40        return -1;
41    }
42    public int search(int[] nums, int target) {
43        int pivI=findMin(nums);
44        int ans1=bs(0,pivI-1,nums,target);
45        if(ans1!=-1)
46        return ans1;
47        else 
48        return bs(pivI,nums.length-1,nums,target);
49    }
50}