// Last updated: 15/08/2026, 19:47:55
class Solution {
    public long minimumCost(int c1, int c2, int cb, int n1, int n2) {
        if(n1==n2)
        {
            long cfb=1L*cb*n1;
            long cfn1=1L*c1*n1;
            long cfn2=1L*c2*n2;

            return Math.min(cfb,cfn1+cfn2);
        }
        else if (n1>n2)
        {
            long extra=n1-n2;
            long cfb=1L*cb*n2;
            long rem=1L*c1*(extra);
            long cbt=cfb+rem;

            long cfn1=1L*c1*n1;
            long cfn2=1L*c2*n2;

            return Math.min(cbt,Math.min(cfn1+cfn2,1L*cb*n1));
        }
        else
        {
            long extra=n2-n1;
            long cfb=1L*cb*n1;
            long rem=1L*c2*(extra);
            long cbt=cfb+rem;

            long cfn1=1L*c1*n1;
            long cfn2=1L*c2*n2;

            return Math.min(cbt,Math.min(cfn1+cfn2,1L*cb*n2));
        }

    }
}