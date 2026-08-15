// Last updated: 15/08/2026, 20:02:02
class Solution {
    public static int mergeSort(int si,int ei,int nums[])
    {
        int count=0;
        if(si>=ei)
        {
            return count;
        }
        int mid=(si+ei)/2;
        count+=mergeSort(si,mid,nums);
        count+=mergeSort(mid+1,ei,nums);
        count+=pairs(si,mid,ei,nums);
        merge(si,mid,ei,nums);
        return count;
    }
    public static int pairs(int si,int mid,int ei,int nums[])
    {
        int count=0,j=mid+1;;
        for(int i=si;i<=mid;i++)
        {
            while(j <= ei && (long)nums[i] > 2L * nums[j])

            j++;
            count+=(j-(mid+1));
        }
        return count;
    }
    public static void merge(int si,int mid,int ei,int nums[])
    {
        int i=si,j=mid+1,k=0;
        int temp[]=new int[ei-si+1];
        while(i<=mid && j<=ei)
        {
            if(nums[i]<=nums[j])
            {
                temp[k]=nums[i];
                i++;
                k++;
            }
            else
            {
               temp[k]=nums[j];
                j++;
                k++; 
            }
        }
        while(i<=mid)
        {
            temp[k]=nums[i];
            i++;
            k++;
        }
        while(j<=ei)
        {
            temp[k]=nums[j];
            j++;
            k++;
        }
        for( i=si,k=0;k<temp.length;i++,k++)
        {
            nums[i]=temp[k];
        }
    }
    public int reversePairs(int[] nums) {
        return mergeSort(0,nums.length-1,nums);
    }
}