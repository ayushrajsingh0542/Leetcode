// Last updated: 15/08/2026, 19:51:28
class Solution {
    public boolean isCircularSentence(String str) {

        int n=str.length();
        char a=str.charAt(0);
        char b=str.charAt(n-1);
        if(a!=b)
        {
            return false;
        }
        else
        {
        for(int i=0;i<n;i++)
        {
            char c=str.charAt(i);
            if(c==' ')
            {
                if(str.charAt(i-1)!=str.charAt(i+1))
                {
                    return false;
                }
            }
        }
        return true;
    }
    }
}