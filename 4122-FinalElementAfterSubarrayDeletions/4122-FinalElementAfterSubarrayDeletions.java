// Last updated: 15/08/2026, 19:48:05
class Solution {
    public int finalElement(int[] nums) {
        return Math.max(nums[0],nums[nums.length-1]);
    }
}