// Last updated: 15/08/2026, 19:46:02
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxR=-1;
        int sum=0;

        for(int num:nums)
            {
                int x=num;
                int mn=9,mx=0;

                while(x>0)
                    {
                        int d=x%10;
                        mn=Math.min(mn,d);
                        mx=Math.max(mx,d);
                        x/=10;
                    }

                int range=mx-mn;
                if(range>maxR)
                {
                    maxR=range;
                    sum=num;
                }
                else if(range==maxR)
                {
                    sum+=num;
                }
            }

        return sum;
    }
}