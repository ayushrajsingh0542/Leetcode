// Last updated: 15/08/2026, 19:55:30
class Solution {
    static class LPS
    {
        Integer dp[][];
        private int calc_LCS(int i1,int i2,String s1,String s2)
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
                take=1+calc_LCS(i1+1,i2+1,s1,s2);
            }
            int nottake=Math.max(calc_LCS(i1+1,i2,s1,s2),calc_LCS(i1,i2+1,s1,s2));
            return dp[i1][i2]=Math.max(take,nottake);
        }
        private String reverse(String s)
{
    return new StringBuilder(s).reverse().toString();
}
        public int calc_LPS(String s)
        {
           dp=new Integer[s.length()][s.length()];
           String s2=reverse(s);
           return calc_LCS(0,0,s,s2);
        }
    }
    public int minInsertions(String s) {
        LPS lps=new LPS();
        int n=s.length();
        return n-lps.calc_LPS(s);
    }
}