// Last updated: 15/08/2026, 20:07:58
class Solution {
    Boolean dp[][];
    public boolean helper1(int i,int j,String s1,String s2,String s3)
    {
        if(i==s1.length() && j==s2.length() && i+j==s3.length())
        {
            return true;
        }
        if(i+j>=s3.length())
        {
            return false;
        }
        if(dp[i][j]!=null)
        return dp[i][j];
        int k=i+j;
        boolean res1=false,res2=false;
        if(i<s1.length())
        if(s1.charAt(i)==s3.charAt(k))
        {
            res1=helper1(i+1,j,s1,s2,s3);
        }
        if(j<s2.length())
        if(s2.charAt(j)==s3.charAt(k))
        {
            res2=helper1(i,j+1,s1,s2,s3);
        }

        return dp[i][j]=res1 || res2;
        
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
        return false;
        dp=new Boolean[s3.length()][s3.length()];
        return helper1(0,0,s1,s2,s3);
    }
}