// Last updated: 15/08/2026, 19:49:25
class Solution {
    public int maxProduct(int n) {
        int max=Integer.MIN_VALUE;
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++)
            {
                for(int j=1;j<s.length();j++)
                    {
                        if(i!=j)

                        {
                            int d1=s.charAt(i)-'0';
                        int d2=s.charAt(j)-'0';
                        int prod=d1*d2;
                        max=Math.max(prod,max);
                    }
                    }
            }

        return max;
        
    }
}