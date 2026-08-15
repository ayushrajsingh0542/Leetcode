// Last updated: 15/08/2026, 19:47:32
class Solution {
    public int minOperations(int[] nums, int[] target) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=target[i])
                    list.add(nums[i]);
            }
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<list.size();i++)
            {
                set.add(list.get(i));
            }
        return set.size();
    }
}