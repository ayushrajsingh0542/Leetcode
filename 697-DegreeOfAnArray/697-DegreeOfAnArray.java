// Last updated: 15/08/2026, 20:00:00
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxFreq=0;
        for(int i:map.keySet())
        {
            int freq=map.get(i);
            maxFreq=Math.max(freq,maxFreq);
        }
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==maxFreq && !hm.containsKey(nums[i]))
            {
                hm.put(nums[i],i);
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(hm.containsKey(nums[i]))
            {
                int len=i-hm.get(nums[i])+1;
                min=Math.min(min,len);
                hm.remove(nums[i]);
            }
        }
        return min;
    }
}