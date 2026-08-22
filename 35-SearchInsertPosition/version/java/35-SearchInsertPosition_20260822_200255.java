// Last updated: 22/08/2026, 20:02:55
1class Solution {
2    public int searchInsert(int[] nums, int tar) {
3       int si=0,ei=nums.length-1;
4       while(si<=ei)
5       {
6        int mid=si+(ei-si)/2;
7        if(nums[mid]==tar)
8        {
9            return mid;
10        }
11        else if(nums[mid]>tar)
12        {
13            ei=mid-1;
14        }
15        else
16        {
17            si=mid+1;
18        }
19
20       }
21       return si; 
22    }
23}