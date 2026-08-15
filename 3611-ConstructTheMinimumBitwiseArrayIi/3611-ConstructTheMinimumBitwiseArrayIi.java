// Last updated: 15/08/2026, 19:50:03
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int prev=-1;
            int mask=1;
            int num=nums.get(i);
            while(mask!=0)
            {
                if((num&mask)==0)
                break;
                prev=num &(~(mask));
                mask=mask<<1;
            }
            ans[i]=prev;
        }
        return ans;
    }
}