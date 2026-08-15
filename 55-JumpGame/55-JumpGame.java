// Last updated: 15/08/2026, 20:09:21
class Solution {
    public boolean canJump(int[] nums) {

        int maxIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxIndex)
            return false;
            maxIndex=Math.max(maxIndex,i+nums[i]);
            
        }
        return true;
        
    }
}