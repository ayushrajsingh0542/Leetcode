// Last updated: 15/08/2026, 20:08:28
class Solution {
    public static void rec(int idx,int nums[],List<Integer>list,List<List<Integer>> ans)
    {
          ans.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++)
        {
            list.add(nums[i]);
            rec(i+1,nums,list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        rec(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}