// Last updated: 15/08/2026, 19:46:27
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {

        int n=nums.length;
        int ans=0;

        for(int i=0;i<n;i++)
            {
                int e=0;
                int od=0;

                for(int j=i;j<n;j++)
                    {
                        if (nums[j] % 2 == 0) {
                    e++;
                } else {
                    od++;
                }

                        if(od>0 && 1L*e*b<=1L*od*a)
                        {
                            ans++;
                        }
                    }
            }
        return ans;
    }
}