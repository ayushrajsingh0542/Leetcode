// Last updated: 15/08/2026, 20:08:41
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int st=0;
        int end=matrix.length*matrix[0].length-1;
        int m=matrix[0].length;
        int mid;
        
        while(st<=end)
        {
            mid=st+(end-st)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target)
            {
                return true;
            }
            if(matrix[row][col]>target)
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }

        }
        return false;
        
    }
}