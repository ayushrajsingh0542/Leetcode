// Last updated: 15/08/2026, 20:01:39
class Solution {
    public int singleNonDuplicate(int[] nums) {
      int n=nums.length;
      if(n==1)
      return nums[0];
      if(nums[0]!=nums[1])//edge case kyuki 0th index ka no left half for bs
      return nums[0];
      if(nums[n-1]!=nums[n-2])//edge case kyuki last index ka no right half fo bs
      {
        return nums[n-1];
      }
      int low=1,high=n-2;
      while(low<=high)
      {
        int mid=(low+high)/2;
        if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])//neither = left or right
        {
            return nums[mid];
        }
         if((mid%2==0 && nums[mid+1]==nums[mid])||(mid%2!=0 && nums[mid-1]==nums[mid]))//i am in left half ki conditions ie hm even hai(ofc next wala odd) and next wala equal ya phir hm odd(ofc prev is even) and prev wala is equal..eleminate left half as answer in right half
        {
            low=mid+1;
        }
        else//i am in right half ki conditions ie hm odd hai(ofc next wala even) and next wala equal ya phir hm even(ofc prev is odd) and prev wala is equal..eleminate right half as answer in left half
        {
            high=mid-1;
        }
      }
      return -1;
    }
}