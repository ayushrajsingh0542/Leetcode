// Last updated: 15/08/2026, 19:56:42
class Solution {
    Integer dp[][];
    public int helper1(int idx1,int idx2,String str1,String str2)
    {
        if(idx1<0||idx2<0)
        {
            return 0;
        }
        if(dp[idx1][idx2]!=null)
        return dp[idx1][idx2];
        if(str1.charAt(idx1)==str2.charAt(idx2))
        return dp[idx1][idx2]=1+helper1(idx1-1,idx2-1,str1,str2);
        else
        return dp[idx1][idx2]=Math.max(helper1(idx1-1,idx2,str1,str2),helper1(idx1,idx2-1,str1,str2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        dp=new Integer[n][m];
        return helper1(n-1,m-1,text1,text2);
    }
}