// Last updated: 15/08/2026, 20:02:45
class Solution {
    public int firstUniqChar(String s) {
       int alpha[]=new int[26];
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        alpha[ch-'a']++;
       }
      
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        if(alpha[ch-'a']==1)
        {
            return i;
        }
       }
       return -1;
    }
}