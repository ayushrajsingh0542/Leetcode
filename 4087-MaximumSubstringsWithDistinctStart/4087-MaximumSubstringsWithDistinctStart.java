// Last updated: 15/08/2026, 19:48:13
class Solution {
    public int maxDistinct(String s) {
        boolean b[]=new boolean[26];
        int c=0;
        for(char d:s.toCharArray())
            {
                int e=d-'a';
                if(!b[e])
                {
                    b[e]=true;
                    c++;
                }
            }
        return c;
    }
}