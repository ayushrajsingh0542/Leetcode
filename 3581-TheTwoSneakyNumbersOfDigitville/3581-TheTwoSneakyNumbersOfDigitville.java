// Last updated: 15/08/2026, 19:50:14
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int ans[]=new int[2];
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(set.isEmpty()||!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            {
              ans[x]=nums[i];
              x++;
            }
        }
        return ans;
    }
}