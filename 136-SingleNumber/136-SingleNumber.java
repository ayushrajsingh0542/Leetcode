// Last updated: 15/08/2026, 20:06:31
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int n:nums)
        {
            ans^=n;
        }
        return ans;
    }
}