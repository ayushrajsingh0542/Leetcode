// Last updated: 15/08/2026, 19:49:05
class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:x)
            {
                
                
                    set.add(i);
            }
        if(set.size()<3)
            return -1;
        int arr[][]=new int[x.length][2];
        for(int i=0;i<x.length;i++)
            {
                arr[i][0]=y[i];
                arr[i][1]=x[i];
            }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));


        int row0=0;
        int row1=1;
        int row2=2;
        int idx1=arr[0][1];
        int idx2=arr[1][1];
        int idx3=arr[2][1];
        int sum0=arr[0][0];
        int sum1=arr[1][0];
        int sum2=arr[2][0];
        while(idx1==idx2)
            {
                row1++;
                idx2=arr[row1][1];
                sum1=arr[row1][0];
            }
        while(idx2==idx3 || idx3==idx1)
            {
                row2++;
                idx3=arr[row2][1];
                sum2=arr[row2][0];
            }
        int sum=sum0+sum2+sum1;
        return sum;
            

        
    }
}