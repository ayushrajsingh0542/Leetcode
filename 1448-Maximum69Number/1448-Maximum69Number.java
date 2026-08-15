// Last updated: 15/08/2026, 19:55:26
class Solution {
    public int maximum69Number (int num) {
        if(num<10)
        {
            if(num==6)
            return 9;
            return num;
        }
        String ans="";
        int flag=0;
        String str=Integer.toString(num);
        for(int i=0;i<str.length();i++)
        {
            String ch=str.charAt(i)+"";
            int numch=Integer.valueOf(ch);
            if(numch==6 && flag==0)
            {
                ans+="9";
                flag=1;
            }
            else
            ans+=ch;
        }
        return Integer.valueOf(ans);
    }
}