// Last updated: 15/08/2026, 20:05:00
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
       }
     int l=nums.length;
        int m[]=new int[l+k];
        for(int i=k;i<l+k;i++)
        {
            m[i]=nums[i-k];
            
        }
        int temp=0;
        int st=k-1;
        int en=l+k-1;
        
        for(int i=1;i<=k;i++)
        {
            m[st]=m[en];
            st--;
            en--;
        }
        for(int i=0;i<l;i++)
        {
            nums[i]=m[i];
        }
    }
}