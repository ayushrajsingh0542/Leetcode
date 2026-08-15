// Last updated: 15/08/2026, 20:09:43
class Solution {
    public static void rec(int nums[],List<Integer> list,List<List<Integer>> mainL)
    {
        if(list.size()==nums.length)
        {
            mainL.add(new ArrayList<>(list));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
            {
                continue;
            }
            list.add(nums[i]);
            rec(nums,list,mainL);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> mainL=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        rec(nums,list,mainL);
        return mainL;
        
    }
}