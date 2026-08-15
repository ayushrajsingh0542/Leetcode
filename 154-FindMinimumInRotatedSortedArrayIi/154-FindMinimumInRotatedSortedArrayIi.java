// Last updated: 15/08/2026, 20:05:50
class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}