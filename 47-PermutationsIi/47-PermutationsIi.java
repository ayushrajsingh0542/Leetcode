// Last updated: 15/08/2026, 20:09:41
class Solution {
    public static void rec(int nums[],List<Integer> list, HashSet<Integer>set,HashSet<List<Integer>>set2,List<List<Integer>> mainL)
    {
        if(list.size()==nums.length)
        {
            if(!set2.contains(list))
            {
            mainL.add(new ArrayList<>(list));
            set2.add(new ArrayList<>(list));
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(i))
            {
                continue;
            }
            list.add(nums[i]);
            set.add(i);
            rec(nums,list,set,set2,mainL);
            list.remove(list.size()-1);
            set.remove(i);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> mainL=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        HashSet<List<Integer>>set2=new HashSet<>();
        rec(nums,list,set,set2,mainL);
        return mainL;
        
    }
}