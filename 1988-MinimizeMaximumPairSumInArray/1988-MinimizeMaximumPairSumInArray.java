// Last updated: 15/08/2026, 19:53:04
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int ans=0;
        while(i<j)
        {
          int sum=nums[i]+nums[j];
          ans=Math.max(sum,ans);
          i++;
          j--;
        }
        return ans;
    }
}