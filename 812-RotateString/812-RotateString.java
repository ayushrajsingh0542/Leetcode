// Last updated: 15/08/2026, 19:59:12
class Solution {
    public boolean rotateString(String s, String goal) {
        int l=s.length();
        String temp="";
       
        int flag=0;
        for(int i=0;i<l;i++)
        {
           char c=s.charAt(0);
            temp=s.substring(1)+c;
            if(temp.equals(goal))
            {
                flag=1;
                break;
            }
            else
            {
                s=temp;
                temp="";
            }
        }
        if(flag==1)
        return true;
        else
        return false;

        
    }
}