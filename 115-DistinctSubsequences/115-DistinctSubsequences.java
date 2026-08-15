// Last updated: 15/08/2026, 20:07:09
class Solution {
    Integer dp[][];
    public int helper1(int i,int j,String s,String t)
    {
        if(j==t.length())
        {
            return 1;
        }
        if(i==s.length())
        {
            return 0;
        }
        if(dp[i][j]!=null)
        {
            return dp[i][j];
        }
        int take=0;
        if(s.charAt(i)==t.charAt(j))
        {
            take=helper1(i+1,j+1,s,t);
        }
        int nottake=helper1(i+1,j,s,t);
        return dp[i][j]=take+nottake;
    }
    public int numDistinct(String s, String t) {
        dp=new Integer[s.length()][t.length()];
        return helper1(0,0,s,t);
    }
}