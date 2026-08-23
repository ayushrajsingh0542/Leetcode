// Last updated: 23/08/2026, 15:29:22
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m=matrix[0].length;
4        int n=matrix.length;
5        int low=0;
6        int high=m*n-1;
7        while(low<=high)
8        {
9            int mid=low+(high-low)/2;
10            int row=mid/m;
11            int col=mid%m;
12            if(matrix[row][col]==target)
13            {
14                return true;
15            }
16            else if(matrix[row][col]>target)
17            {
18                high=mid-1;
19            }
20            else
21            {
22                low=mid+1;
23            }
24        }
25        return false;
26    }
27}