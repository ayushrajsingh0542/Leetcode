// Last updated: 15/08/2026, 19:50:38
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        int maxcount=0;
        for(int k:map.keySet())
        {
          int count=map.get(k);
          if(count>max)
          {
            max=count;
            maxcount=max;
          }
         else if(count==max)
         {
            maxcount+=count;
            max=count;
         }
        }
        return maxcount;
    }
}