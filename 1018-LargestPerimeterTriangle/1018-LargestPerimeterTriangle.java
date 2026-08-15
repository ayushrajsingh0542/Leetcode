// Last updated: 15/08/2026, 19:57:53
class Solution {
    public int largestPerimeter(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--)
        {
            if(nums[i]<nums[i-1]+nums[i-2])
            {
                int sum=nums[i]+nums[i-1]+nums[i-2];
                ans=Math.max(ans,sum);
                break;
            }
        }
        return ans;
            }
}