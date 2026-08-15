// Last updated: 15/08/2026, 19:46:03
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0)
        {
            return 0;
        }
        if(s>9*n)
        {
            return -1;
        }

        StringBuilder num=new StringBuilder();
        int rem=s;

        for(int i=0;i<n;i++)
            {
                int dig=Math.min(9,rem);
                num.append(dig);
                rem-=dig;
            }

        int ind=0;
        while(ind<num.length() && num.charAt(ind)=='0')
            {
                ind++;
            }
        return Integer.parseInt(num.substring(ind));
        
    }
}