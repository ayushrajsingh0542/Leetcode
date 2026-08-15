// Last updated: 15/08/2026, 20:08:32
class Solution {
    public String minWindow(String s, String t) {
        int hash[]=new int[256];
        int l=0,r=0,count=0;
        int sI=-1;
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++)
        hash[t.charAt(i)]++;
        while(r<s.length())
        {
           if(hash[s.charAt(r)]>0)
           {
            count++;
           }
           hash[s.charAt(r)]--;
           while(count==t.length())
           {
            if((r-l+1)<minLen)
            {
                minLen=r-l+1;
                sI=l;
            }
            hash[s.charAt(l)]++;
            if(hash[s.charAt(l)]>0)
            count--;
            l++;
           }
           r++;
        }
        if(sI==-1)
        return "";
        String ans=s.substring(sI,sI+minLen);
        return ans;
    }
}