// Last updated: 15/08/2026, 19:55:41
class Solution {
    public static int sumD(int nums[],int mid)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.ceil((double)(nums[i])/(double)(mid));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
       
        Arrays.sort(nums);
        int low=1,high=nums[nums.length-1];
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(sumD(nums,mid)<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
        
    }
}