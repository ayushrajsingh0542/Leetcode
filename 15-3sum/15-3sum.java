// Last updated: 15/08/2026, 20:10:57
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> mainL=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                   j++;
                }
                else if(sum>0)
                {
                   k--;
                }
                else
                {
                  
                  list.add(nums[i]);
                  list.add(nums[j]);
                  list.add(nums[k]);
                  mainL.add(list);
                  j++;
                  k--;
                  while(j<k && nums[j]==nums[j-1])
                  j++;
                  while(j<k && nums[k]==nums[k+1])
                  k--;
                }
                list=new ArrayList<>();

            }
        }
        return mainL;
    }
}