// Last updated: 15/08/2026, 19:57:57
class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int n=nums.length;
        if(n==1)
        {
            if(nums[0]%k==0)
            return 1;
            else
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int freq=0;
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            int mod=sum%k;
            if(mod<0)
            mod+=k;//very important line do remember this
            if(map.containsKey(mod))
            {
               freq+=map.get(mod);
                map.put(mod,map.get(mod)+1);
            }
            else
            {
                map.put(mod,1);
            }
        }
        return freq;
        
    }
}