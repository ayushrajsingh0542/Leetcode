// Last updated: 15/08/2026, 19:47:19
class Solution {
    public String mapWordWeights(String[] w, int[] wt) {
        StringBuilder sb=new StringBuilder();

        for(String s:w)
            {
                int sum=0;

                for(char c:s.toCharArray())
                    {
                        sum+=wt[c-'a'];
                    }

                int v=sum%26;
                sb.append((char)('z'-v));
            }

        return sb.toString();

        
    }
}