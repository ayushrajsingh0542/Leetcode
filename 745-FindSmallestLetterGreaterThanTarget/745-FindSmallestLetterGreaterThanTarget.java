// Last updated: 15/08/2026, 19:59:37
class Solution {
    public char nextGreatestLetter(char[] a, char t) {
        int l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]>t)
             r=m-1;
            else 
            l=m+1;
        }
        return a[l%a.length];
    }
}
