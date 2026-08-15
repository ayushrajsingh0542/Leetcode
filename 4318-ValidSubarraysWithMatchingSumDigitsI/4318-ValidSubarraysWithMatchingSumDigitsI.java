// Last updated: 15/08/2026, 19:46:29
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        int ans=0;

        for(int i=0;i<n;i++)
        {
            long sum=0;

            for(int j=i;j<n;j++)
            {
                sum+=nums[j];

                long temp=sum;
                int last=(int)(temp%10);

                while(temp>=10)
                {
                    temp/=10;
                }

                int first=(int)temp;
                if(first==x && last==x)
                {
                    ans++;
                }
            }
        }

        return ans;
    }
}