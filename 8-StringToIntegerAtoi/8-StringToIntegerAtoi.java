// Last updated: 15/08/2026, 20:11:10
class Solution {
    public int myAtoi(String s) {
         s=s.trim();
        if(s.length()==0 || s==null)
        return 0;
       
        int sign=1;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        char check=s.charAt(0);
        long ans=0;
        if(check=='-')
        sign=-1;
        for(int i=0;i<s.length();i++)
        {
            if(i==0 && ((s.charAt(i)=='-')||(s.charAt(i)=='+')))
            continue;
            if(!Character.isDigit(s.charAt(i)))
            {
                break;
            }
            ans=ans*10+(s.charAt(i)-'0');
            if(sign==-1 && sign*ans<min)
            return min;
            if(sign==1 && sign*ans>max)
            return max;
        }
        return (int)(sign*ans);
        
    }
}