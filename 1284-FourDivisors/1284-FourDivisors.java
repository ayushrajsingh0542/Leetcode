// Last updated: 15/08/2026, 19:56:25
class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0,sum=0;
            for(int j=1;j<=nums[i];j++)
            {
                if(nums[i]%j==0)
                {
                    count++;
                    if(count>4)
                    break;
                    sum+=j;
                    
                }
            }
            if(count!=4)
            sum=0;
            ans+=sum;
        }

        return ans;
    }
}