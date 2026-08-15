// Last updated: 15/08/2026, 20:11:17
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double median;
        int both=m+n;
        ArrayList <Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<=nums2[j])
            {
                list.add(nums1[i]);
                i++;
            }
            else
            {
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length)
        {
            list.add(nums1[i]);
            i++;
        }
        while(j<nums2.length)
        {
            list.add(nums2[j]);
            j++;
        }
        if((m+n)%2==0)
        {
            double a=list.get((both/2)-1);
            double b=list.get(both/2);
            median=(a+b)/2;
        }
        else{
            median=list.get(((both+1)/2)-1);
        }
        return median;
    }
}