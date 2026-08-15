// Last updated: 15/08/2026, 19:47:16
class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n:nums)
            {
                freq.put(n,freq.getOrDefault(n,0)+1);
            }

        HashMap<Integer,Integer> cfreq=new HashMap<>();

        for(int f:freq.values())
            {
                cfreq.put(f,cfreq.getOrDefault(f,0)+1);
            }

        for(int n:nums)
            {
                if(cfreq.get(freq.get(n))==1)
                {
                    return n;
                }
            }
        return -1;
    }
}