// Last updated: 15/08/2026, 20:02:25
class Solution {
    public int characterReplacement(String s, int k) {
        //your code goes here
        int hash[]=new int[26];
        int l=0,r=0,maxLen=0,maxF=0;
        while(r<s.length())
        {
            hash[s.charAt(r)-'A']++;
            maxF=Math.max(maxF,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxF>k)
            {
                hash[s.charAt(l)-'A']--;
                maxF=0;
                for(int i=0;i<26;i++)
                maxF=Math.max(maxF,hash[i]);
                l++;
            }
            maxLen=Math.max(maxLen,(r-l+1));
            r++;
        }
        return maxLen;
    }
}