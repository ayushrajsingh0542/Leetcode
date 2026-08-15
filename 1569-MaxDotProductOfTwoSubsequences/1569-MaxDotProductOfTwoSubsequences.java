// Last updated: 15/08/2026, 19:54:40
class Solution {
    Integer dp[][];
    public int helper1(int i,int j,int nums1[],int nums2[])
    {
        if(i>=nums1.length||j>=nums2.length)
        return Integer.MIN_VALUE;
        if(dp[i][j]!=null)
        return dp[i][j];
        int prod=nums1[i]*nums2[j];
        int inc=prod+Math.max(0,helper1(i+1,j+1,nums1,nums2));
        int ex1=helper1(i+1,j,nums1,nums2);
        int ex2=helper1(i,j+1,nums1,nums2);
        return dp[i][j]=Math.max(inc,Math.max(ex1,ex2));
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        
        int n=nums1.length;
        int m=nums2.length;
        dp=new Integer[n][m];
        return helper1(0,0,nums1,nums2);
    }
}