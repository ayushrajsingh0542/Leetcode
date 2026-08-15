// Last updated: 15/08/2026, 19:57:00
class Solution {
    public int[][] helper2(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();

        int dp[][]=new int[n+1][m+1];
        for(int i1=n-1;i1>=0;i1--)
        {
            for(int i2=m-1;i2>=0;i2--)
            {
                int take=0;
                if(s1.charAt(i1)==s2.charAt(i2))
                {
                    take=1+dp[i1+1][i2+1];
                }
                
                
                    int nottake=Math.max(dp[i1][i2+1],dp[i1+1][i2]);
                    dp[i1][i2]=Math.max(take,nottake);
                
            }
        }

        return dp;
    }
    public String shortestCommonSupersequence(String s1, String s2) {

        int n=s1.length();
        int m=s2.length();

        int dp[][]=new int[n+1][m+1];
        dp=helper2(s1,s2);
        String ans="";
         int i=0,j=0;
         while(i<n && j<m)
         {
            if(s1.charAt(i)==s2.charAt(j))
            {
               ans+=s1.charAt(i); //or s2.charAt(j)
               i++;
               j++;
            }
            else if(dp[i+1][j]>dp[i][j+1])
            {
                ans+=s1.charAt(i);
                i++;
            }
            else
            {
                ans+=s2.charAt(j);
                j++;
            }
         }

         while(i<n)
         {
ans+=s1.charAt(i);
                i++;
         }

         while(j<m)
         {

            ans+=s2.charAt(j);
                j++;
         }

         return ans;



        
    }
}