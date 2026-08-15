// Last updated: 15/08/2026, 20:08:05
class Solution {
    public Set<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
  int n=nums.length;
        List<List<Integer>> mainL=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
       
        for(int i=0;i<(1<<n);i++)
        {
            list=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    list.add(nums[j]);
                }
            }
            Collections.sort(list);
            if(!mainL.contains(list))
            mainL.add(new ArrayList<>(list));
        }
       
        return mainL;
        
    }
}