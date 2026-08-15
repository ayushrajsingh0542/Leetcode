// Last updated: 15/08/2026, 19:46:05
class Solution {
    public long maxPairStrength(int[] nums) {

        int n=nums.length;
        long maxs=0;

        for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                    {
                        long gcd=gcd(nums[i],nums[j]);
                        long st=(1L*nums[i]*nums[j])/(gcd*gcd);
                        maxs=Math.max(maxs,st);
                    }
            }
        return maxs;
        
    }
    public long gcd(long a,long b)
    {
        while(b!=0)
            {
                long temp=a%b;
                a=b;
                b=temp;
            }
        return a;
    }
}