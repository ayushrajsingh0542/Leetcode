// Last updated: 15/08/2026, 20:08:25
class Solution {
    public static int directions[][]={{0,1},{0,-1},{1,0},{-1,0}};
    public static boolean find(char board[][],int i,int j,int idx,String word)
    {
        if(idx==word.length())
        {
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='$' || board[i][j]!=word.charAt(idx))
        {
            return false;
        }
        
        char temp=board[i][j];
        board[i][j]='$';
        for(int [] dir:directions)
        {
            int i_new=i+dir[0];
            int j_new=j+dir[1];
            if(find(board,i_new,j_new,idx+1,word))
            {
                return true;
            }
        }
        board[i][j]=temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {

        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]==word.charAt(0) && find(board,i,j,0,word))
                {
                    return true;
                }
            }
        }
        return false;
        
    }
}