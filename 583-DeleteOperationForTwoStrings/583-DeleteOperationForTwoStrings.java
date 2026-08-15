// Last updated: 15/08/2026, 20:01:08
class Solution {
    static class LCS
    {
        Integer dp[][];
        private int helper1(int i1,int i2,String s1,String s2)
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

        public int calc_LCS(String s1,String s2)
        {
            
            int n=s1.length();
            int m=s2.length();
            dp=new Integer[n][m];
            return helper1(0,0,s1,s2);
        }
    }
    public int minDistance(String word1, String word2) {
        LCS lcs=new LCS();
        int maxlen=Math.max(word1.length(),word2.length());
        int minlen=Math.min(word1.length(),word2.length());
        int lcs_len=lcs.calc_LCS(word1,word2);
        /*if(minlen==lcs_len)
        {
            return maxlen-lcs_len;
        }*/
        return (maxlen-lcs_len)+(minlen-lcs_len);
    }
}