// Last updated: 15/08/2026, 20:09:54
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int ans=1;
        for(int i=1;i<=nums.length+1;i++)
        {
            if(!set.contains(i))
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}