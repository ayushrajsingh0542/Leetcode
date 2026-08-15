// Last updated: 15/08/2026, 19:47:10
class Solution {
    public long minOperations(int[] nums) {
        long ans=0;
         for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                ans += nums[i] - nums[i+1];
            }
        }

        return ans;
    }
}