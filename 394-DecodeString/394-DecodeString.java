// Last updated: 15/08/2026, 20:02:39
import java.util.*;
class Solution {
    public String decodeString(String str) {

        Stack<String> s=new Stack<>();
        Stack<Integer> numS=new Stack<>();
        String ans="";
        String ans2="";
        int j=1;
        int flag=0;
        int num=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                num= num * 10 + (ch - '0');;
                flag=0;
            }
            if(!Character.isDigit(ch) && ch!=']')
            {
                if(flag==0)
                {
                    numS.push(num);
                    num=0;
                    flag=1;
                }
                s.push(Character.toString(ch));
            }
            if(ch==']')
            {
                j=numS.pop();
                while(!s.peek().equals("["))
                {
                    ans=s.pop()+ans;
                }
                s.pop();
                ans2=ans;
                while(j!=1)
                {
                    ans=ans+ans2;
                    j--;
                }
                ans2="";
                s.push(ans);
                ans="";
               
                
            }
        }
        String finalans="";
        while(!s.isEmpty())
        {
            finalans=s.pop()+finalans;
        }
        return finalans;
    }
}