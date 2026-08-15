// Last updated: 15/08/2026, 20:09:30
class Solution {

    static List<String> list=new ArrayList<>();
    public static void nqueens(String board[][],int row,List<List<String>> mainL)
    {
        if(row==board.length)
        {
            String s="";
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board.length;j++)
                {
                   s+=board[i][j];
                }
            list.add(s);
            
            s="";
            }
            mainL.add(list);
            list=new ArrayList<>();
            return;
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
              board[row][j]="Q";
              nqueens(board,row+1,mainL);
              board[row][j]=".";
            }
        }
    }
    public static boolean isSafe(String board[][],int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=="Q")
            {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=="Q")
            {
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=="Q")
            {
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {

        String board[][]=new String[n][n];
        List<List<String>> mainL=new ArrayList<>();
        // if(n==1)
        // {
        //     list.add("Q");
        //     mainL.add(list);
        //     return mainL;
        // }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=".";
            }
        }
        nqueens(board,0,mainL);
        return mainL;
        
    }
}