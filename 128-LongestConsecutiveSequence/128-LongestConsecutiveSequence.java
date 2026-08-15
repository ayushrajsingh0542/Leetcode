// Last updated: 15/08/2026, 20:06:42
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        Arrays.sort(nums);
         int value=1;
        int temp=1;
        int max=0;
        int comp=nums[0];
        
         for(int i=1;i<nums.length;i++){
            if(comp==nums[i])
           value++;
         }
        if(value==nums.length)
         return 1;
        for(int i=1;i<nums.length;i++){
            if((comp+1==nums[i])||(comp==nums[i])){
                
                    
                    if(comp==nums[i]){
                    // comp=nums[i];
                    if(i!=nums.length-1)
                    continue;
                }
                if(comp+1==nums[i])
                    
                    temp++;
                    
                
                comp=nums[i];
                if(i!=nums.length-1)
                continue;
                
            }
            if(i==nums.length-1){
                max=Math.max(max,temp);
                break;
            }
            if((comp+1!=nums[i])&&(comp!=nums[i])){
                max=Math.max(max,temp);
                temp=1;
                comp=nums[i];
                continue;
            }
        }
        return max;
        
    }
}