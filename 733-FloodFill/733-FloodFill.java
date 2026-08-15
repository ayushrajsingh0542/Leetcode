// Last updated: 15/08/2026, 19:59:49
class Solution {
    public static void helper(int image[][],int sr,int sc,int color,int orgColor)
    {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=orgColor || image[sr][sc]==color)
        {
            return;
        }
        image[sr][sc]=color;
        //left
        helper(image, sr, sc-1, color, orgColor);
        //right
        helper(image, sr, sc+1, color, orgColor);
        //up
        helper(image, sr-1, sc, color, orgColor);
        //down
        helper(image, sr+1, sc, color, orgColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        
        helper(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}