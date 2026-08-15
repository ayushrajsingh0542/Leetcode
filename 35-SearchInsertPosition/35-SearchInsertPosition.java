// Last updated: 15/08/2026, 20:10:06
class Solution {
    public int searchInsert(int[] nums, int target) {
        int lb=0,ub=nums.length-1,k=0,p=0;
        while(lb<=ub)
        {
            p=lb + (ub-lb)/2;
            if(nums[p]>target)
            ub=p-1;
            if(nums[p]<target)
            lb=p+1;
            if(nums[p]==target)
            {
                return p;
            }
        }
        
        return lb;
        
    }
}