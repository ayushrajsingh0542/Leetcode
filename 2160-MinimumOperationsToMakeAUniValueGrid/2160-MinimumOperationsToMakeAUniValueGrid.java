// Last updated: 15/08/2026, 19:52:32
class Solution {
    public int minOperations(int[][] grid, int x) {
        //mik
        int n=grid.length;
        int m=grid[0].length;
        int sz=n*m;
        int arr[]=new int[sz];
        int idx=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[idx++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int mid=(int)(Math.floor(sz/2));
        int tar=arr[mid];
        int op=0;
        for(int num:arr)
        {
            if((Math.abs(tar-num))%x!=0)
            return -1;
            op=op+((Math.abs(tar-num))/x);
        }
        return op;
    }
}