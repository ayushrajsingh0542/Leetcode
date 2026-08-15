// Last updated: 15/08/2026, 19:58:04
class Solution {
    public int maxWidthRamp(int[] nums) {

        int ans[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        {
            ans[i][0]=i;
            ans[i][1]=nums[i];
        }
        Arrays.sort(ans,Comparator.comparingDouble(o->o[1]));
       
        int index;
        int minIndex=Integer.MAX_VALUE;
        int width=0;
        for(int i=0;i<nums.length;i++)
        {
            index=ans[i][0];
            width=Math.max(width,index-minIndex);
            minIndex=Math.min(minIndex,index);
            
        }
        return width;
        
    }
}