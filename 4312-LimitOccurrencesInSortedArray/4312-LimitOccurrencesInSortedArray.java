// Last updated: 15/08/2026, 19:46:37
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer>a=new ArrayList<>();

        int c=1;
        a.add(nums[0]);

        for(int i=1;i<nums.length;i++)
            {
                if(nums[i]==nums[i-1])
                {
                    c++;
                }
                else
                {
                    c=1;
                }
                if(c<=k)
                {
                    a.add(nums[i]);
                }
            }

        int ans[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
            {
                ans[i]=a.get(i);
            }

        return ans;
    }
}