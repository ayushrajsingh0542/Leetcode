// Last updated: 15/08/2026, 20:11:14
class Solution {
    public static boolean isPal(int start,int end,String s)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxLen=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(isPal(i,j,s))
                {
                    int len=j-i+1;
                    if(len>maxLen)
                    {
                        maxLen=len;
                         ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}