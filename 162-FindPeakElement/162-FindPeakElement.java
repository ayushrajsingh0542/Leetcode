// Last updated: 15/08/2026, 20:05:39
class Solution {
    public int findPeakElement(int[] nums) {
        
    int ans[][]=new int[nums.length][2];
    for(int i=0;i<nums.length;i++)
    {
        ans[i][0]=i;
        ans[i][1]=nums[i];
    }
    Arrays.sort(ans,Comparator.comparingDouble(o->o[1]));
    return ans[nums.length-1][0];
    }
}