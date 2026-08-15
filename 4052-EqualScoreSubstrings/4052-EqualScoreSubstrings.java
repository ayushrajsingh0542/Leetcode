// Last updated: 15/08/2026, 19:48:35
class Solution {
    
    public boolean scoreBalance(String s) {
        char arr[]=s.toCharArray();
        int nums[]=new int[s.length()];
        int target=0;
        for(int i=0;i<arr.length;i++)
            {
                int num=(arr[i]-'a')+1;
                target+=num;
                nums[i]=num;
            }
        boolean ans=false;
        int target2=0;
        for(int i=nums.length-1;i>0;i--)
            {
                int num=(arr[i]-'a')+1;
                target2+=num;
                target-=num;
                if(target==target2)
                    return true;
            }
        return false;
    }
}