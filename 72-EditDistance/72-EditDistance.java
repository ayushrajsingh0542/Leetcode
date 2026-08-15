// Last updated: 15/08/2026, 20:08:45
class Solution {
    Integer dp[][];
    public int helper1(int i,int j,String w1,String w2)
    {
        if(i<0)
        {
            return j+1;
        }
        if(j<0)
        {
            return i+1;
        }
        if(dp[i][j]!=null)
        return dp[i][j];
        if(w1.charAt(i)==w2.charAt(j))
        {
            return dp[i][j]=helper1(i-1,j-1,w1,w2);
        }
        int add=1+helper1(i-1,j,w1,w2);
        int del=1+helper1(i,j-1,w1,w2);
        int rep=1+helper1(i-1,j-1,w1,w2);
        return dp[i][j]=Math.min(rep,Math.min(add,del));
    }
    public int minDistance(String word1, String word2) {
        dp=new Integer[word1.length()][word2.length()];
        return helper1(word1.length()-1,word2.length()-1,word1,word2);
    }
}