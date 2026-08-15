// Last updated: 15/08/2026, 20:04:13
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            return true;
            set.add(nums[i]);
        }
        return false;
        
    }
}