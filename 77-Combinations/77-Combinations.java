// Last updated: 15/08/2026, 20:08:30
class Solution {
    public static void rec(int idx,int k,int nums[],List<Integer> list,List<List<Integer>> ans)
    {
        if(list.size()==k)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<nums.length;i++)
        {
            list.add(nums[i]);
            rec(i+1,k,nums,list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=i+1;
        }
        List<List<Integer>> ans=new ArrayList<>();
        rec(0,k,nums,new ArrayList<>(),ans);
        return ans;
    }
}