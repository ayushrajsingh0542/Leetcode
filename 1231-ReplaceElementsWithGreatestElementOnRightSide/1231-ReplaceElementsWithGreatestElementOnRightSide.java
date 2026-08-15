// Last updated: 15/08/2026, 19:56:46
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            int temp=arr[i];
            arr[i]=max;
            max=Math.max(temp,max);
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}