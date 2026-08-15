// Last updated: 15/08/2026, 19:52:09
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int m[]=new int[l];
        int pos=0;
        int neg=1;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>=0)
            {
                m[pos]=nums[i];
                pos+=2;
            }
            if(nums[i]<0)
            {
                m[neg]=nums[i];
                neg+=2;
            }
        }
        
        return m;
    }
}