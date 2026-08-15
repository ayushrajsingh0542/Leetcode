// Last updated: 15/08/2026, 19:46:06
class Solution {
    public int countValidPrefixes(String s) {
        int zc=0;
        int oc=0;
        int vp=0;

        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='0')
                {
                    zc++;
                }
                else
                {
                    oc++;
                }
                if (Math.abs(zc - oc) <= 1) {
                vp++;
            }
    }
        return vp;
}}