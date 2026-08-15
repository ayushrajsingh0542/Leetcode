// Last updated: 15/08/2026, 19:49:54
class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=nums[0];
        int count=0;
        for(int i=1;i<n;i++)
        {
            left[i]=nums[i]+left[i-1];
        }
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=nums[i]+right[i+1];
        }
        for(int i=0;i<n-1;i++)
        {
           int diff=left[i]-right[i+1];
           if(diff%2==0)
           count++;
        }
        return count;
    }
}