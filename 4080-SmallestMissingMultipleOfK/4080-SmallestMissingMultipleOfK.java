// Last updated: 15/08/2026, 19:48:16
class Solution {
    public int missingMultiple(int[] nums, int k) {
       HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
            {
                set.add(i);
            }
        int mul=1;
        int ans=0;
        int c=1;
        while(true)
            {
                c=k*mul;
                if(!set.contains(c))
                {
                    ans=c;
                    break;
                }
                
                mul++;
            }
        return ans;
    }
}