// Last updated: 15/08/2026, 19:58:07
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
           if(map.get(nums[i])==n/2)
           {
            ans=nums[i];
            break;
           }
        }
        return ans;
        
    }
}