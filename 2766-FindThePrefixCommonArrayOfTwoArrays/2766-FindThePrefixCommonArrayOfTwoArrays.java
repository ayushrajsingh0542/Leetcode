// Last updated: 15/08/2026, 19:51:07
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count=0;
        int n=A.length;
        int freq[]=new int[n+1];
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a1=A[i];
            int b1=B[i];
            freq[a1]++;
            if(freq[a1]==2)
            count++;
            freq[b1]++;
            if(freq[b1]==2)
            count++;
            ans[i]=count;
        }
        return ans;
    }
}