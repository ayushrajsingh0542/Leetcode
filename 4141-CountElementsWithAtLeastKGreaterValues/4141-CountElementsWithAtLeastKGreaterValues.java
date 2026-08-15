// Last updated: 15/08/2026, 19:47:56
class Solution {
    public int countElements(int[] a, int k) {
        int n=a.length;
        int b[]=a.clone();
        Arrays.sort(b);
        if (k==0)
            return n;
        int x=b[n-k];
        int c=0;
        for(int v:a)
            if(v<x)
                c++;
        return c;
    }
}