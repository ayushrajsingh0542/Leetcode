// Last updated: 15/08/2026, 19:57:15
class Solution {
    public String removeDuplicates(String s) {
      Stack<Character>st =new Stack<>();
      String ans="";
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(!st.isEmpty() && st.peek()==ch)
        {
        while(!st.isEmpty() && st.peek()==ch)
        {
            st.pop();
        }
        }
        else
        {
            st.push(ch);
        }

      }

      while(!st.isEmpty())
      {
        ans=st.pop()+ans;
      }
      return ans;
    }
}