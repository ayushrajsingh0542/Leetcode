// Last updated: 15/08/2026, 19:52:38
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1)
        return 0;
        Arrays.sort(nums);
        int i=0,j=k-1;
        int ans=Integer.MAX_VALUE;
        while(j<nums.length)
        {
            ans=Math.min(ans,nums[j]-nums[i]);
            i++;
            j++;
        }
        return ans;

    }
}