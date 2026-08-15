// Last updated: 15/08/2026, 20:01:49
class Solution {
    Integer dp[][];
    public int helper1(int i1,int i2,String s1,String s2)
    {
        if(i1>=s1.length() || i2>=s2.length())
        {
            return 0;
        }
        if(dp[i1][i2]!=null)
        {
            return dp[i1][i2];
        }
        int take=0;
        if(s1.charAt(i1)==s2.charAt(i2))
        {
            take=1+helper1(i1+1,i2+1,s1,s2);
        }
        int nottake=Math.max(helper1(i1+1,i2,s1,s2),helper1(i1,i2+1,s1,s2));
        return dp[i1][i2]=Math.max(take,nottake);
    }
    public String reverse(String s)
    {
        String s2="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s2+=s.charAt(i);
        }
        return s2;
    }
    public int longestPalindromeSubseq(String s) {
        String s2=reverse(s);
        dp=new Integer[s.length()][s.length()];
        return helper1(0,0,s,s2);

    }
}