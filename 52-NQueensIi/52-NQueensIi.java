// Last updated: 15/08/2026, 20:09:27
class Solution {
    
    public static void nqueens(char board[][],int row)
    {
        if(row==board.length)
        {
            count++;
            return;
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                nqueens(board,row+1);
                board[row][j]='.';
            }
        }
    }
    public static boolean isSafe(char board[][],int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    static int count=0;
    public int totalNQueens(int n) {

        char board[][]=new char[n][n];
       
        
        nqueens(board,0);
         int count2=count;
         count=0;
        return count2;
        
    }
}