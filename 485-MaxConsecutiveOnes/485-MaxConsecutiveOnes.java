// Last updated: 15/08/2026, 20:02:07
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int temp=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==1){
                temp++;
            }
            if((nums[i]!=1)||(i==(l-1))){
                max=Math.max(max,temp);
                temp=0;

            }
        }
        return max;
        
    }
}