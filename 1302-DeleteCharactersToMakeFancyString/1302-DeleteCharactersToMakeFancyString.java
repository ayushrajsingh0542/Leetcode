// Last updated: 15/08/2026, 19:56:18
class Solution {
    public String makeFancyString(String s) {

        int n=s.length();
        StringBuilder ans=new StringBuilder();
        int count=0;
        char ch=s.charAt(0);
        for(int i=0;i<n;i++)
        {
            
            char c=s.charAt(i);
            if(c==ch)
            {
                count++;
            }
            if(c!=ch)
            {
                ch=c;
                count=1;
            }
            if(count<3)
            {
                ans=ans.append(c);
            }
            

        }
        return ans.toString();
        
    }
}