// Last updated: 15/08/2026, 19:50:31
class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int k:map.keySet())
        {
            if(map.get(k)>2)
            return false;
        }
        return true;
        
    }
}