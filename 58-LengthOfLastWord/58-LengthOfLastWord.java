// Last updated: 15/08/2026, 20:09:11
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s=" "+s;
        int l=s.length();
        int count=0;
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            count++;
            if(s.charAt(i)==' ')
            return count;

        }
        return count;
        
    }
}