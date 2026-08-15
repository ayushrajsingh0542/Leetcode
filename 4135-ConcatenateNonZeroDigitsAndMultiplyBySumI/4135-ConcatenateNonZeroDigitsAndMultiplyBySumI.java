// Last updated: 15/08/2026, 19:48:03
class Solution {
    public long sumAndMultiply(int n) {
      
        long sum=0;
        long mul=1;
        long conc=0;
        while(n!=0)
        {
            int last=n%10;
            sum+=last;
            if(last!=0)
            {
                conc=conc+last*mul;
                mul*=10;
            }
            n/=10;
        }

        return conc*sum;
    }
}