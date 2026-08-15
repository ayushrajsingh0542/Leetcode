// Last updated: 15/08/2026, 19:51:02
class Solution {
    public int minLength(String str) {

        Stack<Character> s=new Stack<>();
        int n=str.length();
        if(n==1 || n==0)
        return n;
        s.push('Z');
        for(int i=0;i<n;i++)
        {
            char c=str.charAt(i);
            if(c!='B' && c!='D')
            {
                s.push(c);
            }
            if((c=='B' && s.peek()!='A') || (c=='D' && s.peek()!='C'))
            {
                s.push(c);
            }
            if((c=='B' && s.peek()=='A') || (c=='D' && s.peek()=='C'))
            {
                s.pop();
            }
             
        }

        return s.size()-1;
        
    }
}