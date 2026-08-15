// Last updated: 15/08/2026, 20:03:42
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int right[]=new int[n];
        int left[]=new int[n];
        int ans[]=new int[n];
        int mull=nums[0];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
          right[i]=right[i+1]*nums[i];   
        }
        ans[0]=right[1];
        for(int i=1;i<n-1;i++)
        {
            ans[i]=right[i+1]*mull;
            mull*=nums[i];
        }
        ans[n-1]=mull;
        return ans;
    }
}