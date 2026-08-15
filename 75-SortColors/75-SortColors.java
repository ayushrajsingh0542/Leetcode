// Last updated: 15/08/2026, 20:08:35
class Solution {
    public void sortColors(int[] nums) {
        int t;
        int l=nums.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<(l-1-i);j++){
                if(nums[j]>nums[j+1]){
                    t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }

        }
    
        
    }
}