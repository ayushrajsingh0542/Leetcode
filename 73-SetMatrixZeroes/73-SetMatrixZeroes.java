// Last updated: 15/08/2026, 20:08:44
class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
       int m[][]=new int[row][col];
       for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                m[i][j]=matrix[i][j];

            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    //rows0
                    for(int a=0;a<col;a++)
                    m[i][a]=0;
                    //col0
                    for(int b=0;b<row;b++)
                    m[b][j]=0;
                    
                }
                
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                matrix[i][j]=m[i][j];

            }
        }
        
    }
}