// Last updated: 15/08/2026, 20:08:09
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=nums1.length;
        int k=0;
        for(int i=m;i<l;i++){
            nums1[i]=nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        
    }
}