// Last updated: 15/08/2026, 20:05:35
class Solution {
    public int majorityElement(int[] nums) {
        // int num=0;
        // int temp=0;
        // int max=0;
        // int max2=-1;
        // for(int i=0;i<nums.length;i++){
        //     temp=nums[i];
        //     for(int j=0;j<nums.length;j++){
        //         if(temp==nums[j])
        //         max++;
        //     }
        //     if(max>=max2){
        //         max2=max;
        //         max=0;
        //         num=temp;
        //     }
        //     if(max<max2){
        //         max=0;
                
        //     }

        //     }
        //     return num;
        if(nums.length==1)
        return nums[0];
        else{
        
        Arrays.sort(nums);
        int l=nums.length;
        int value=0;
        int vmax=0;
        int tempmax=0;
        int maxcomp=0;
        int comp=nums[0];
        
        for(int i=1;i<l;i++){
            if(nums[i]==nums[i-1])
            {
                value=nums[i];
                tempmax++;
            }
            if((comp!=nums[i])||(i==l-1)){
                
                if(tempmax>=maxcomp)
                {
                    vmax=value;
                    maxcomp=tempmax;
                    
                    
                }
                tempmax=0;
                value=0;
                comp=nums[i];
                
                
            }
            
            
            
        }
        return vmax;
        }
        
    }
}