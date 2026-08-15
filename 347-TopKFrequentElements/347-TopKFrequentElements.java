// Last updated: 15/08/2026, 20:02:53
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans[][]=new int[map.size()][2];
        int i=0;
        for(int key:map.keySet())
        {
            ans[i][0]=key;
            ans[i][1]=map.get(key);
            i++;
        }
        Arrays.sort(ans,Comparator.comparingDouble(o->o[1]));
        int finalans[]=new int[k];
        int j=ans.length-1;
        while(k!=0)
        {
            finalans[k-1]=ans[j][0];
            k--;
            j--;
        }
        return finalans;
        
    }
}