// Last updated: 15/08/2026, 20:03:35
class Solution {
    public static boolean bs(int row,int high,int x,int mat[][])
    {
        int low=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mat[row][mid]==x)
            {
                return true;
            }
            else if(mat[row][mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            if(target>=matrix[i][0] && target<=matrix[i][m-1])
            {
                if(bs(i,m-1,target,matrix))
                {
                    return true;
                }
            }
        }
        return false;
    }
}