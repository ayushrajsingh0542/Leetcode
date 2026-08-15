// Last updated: 15/08/2026, 20:05:57
class Solution {
    public String reverseWords(String s) {
        s.trim();
        s=" "+s;
        String temp="";
        String perm="";
        int l=s.length();
        int flag=0;
        for(int i=l-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                temp=c+temp;
                flag=0;
            }
            if((c==' ')&&(flag==0))
            {
                perm=perm+" "+temp;
                temp="";
                flag=1;
            }
        }
        perm=perm.trim();
        return perm;
        
    }
}