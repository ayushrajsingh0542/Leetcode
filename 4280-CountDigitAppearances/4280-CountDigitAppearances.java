// Last updated: 15/08/2026, 19:47:03
class Solution {
    public int countDigitOccurrences(int[] a, int d) {
        int c=0;
        char ch=(char)(d+'0');

        for(int x:a)
            {
                String s=String.valueOf(x);
                for(char y:s.toCharArray())
                    {
                        if(y==ch)
                            c++;
                    }
            }
        return c;
    }
}