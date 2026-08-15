// Last updated: 15/08/2026, 19:52:42
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder ans=new StringBuilder();
        int idx=0;
        for(String s:nums)
        {
            char ch=s.charAt(idx);
            if(ch=='0')
            ans.append("1");
            else
            ans.append("0");
            idx++;
        }
        return ans.toString();
    }
}