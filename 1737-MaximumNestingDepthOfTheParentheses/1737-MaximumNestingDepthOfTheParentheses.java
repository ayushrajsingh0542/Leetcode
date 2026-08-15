// Last updated: 15/08/2026, 19:53:59
class Solution {
    public int maxDepth(String s) {

        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                count++;
            }
            if(c==')')
            {
                max=Math.max(count,max);
                count--;
            }
        }
        return max;
    }
}