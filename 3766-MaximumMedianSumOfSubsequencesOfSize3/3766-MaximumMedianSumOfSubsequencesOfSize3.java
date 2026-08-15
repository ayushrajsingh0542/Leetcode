// Last updated: 15/08/2026, 19:49:48
import java.util.*;
class Solution {
    public long maximumMedianSum(int[] nums) {

        Arrays.sort(nums);
        int st=0,end=nums.length-1;
        long ans=0;
        while(st<end)
            {
                end--;
                ans+=(long)nums[end];
                st++;
                end--;
                
            }
        return ans;
        
    }
}