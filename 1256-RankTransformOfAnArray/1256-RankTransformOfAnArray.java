// Last updated: 15/08/2026, 19:56:38
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0)
        {
            return arr;
        }

        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2);
        int rank=1;
        int initial=arr2[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr2[0],rank);
        for(int i=1;i<arr.length;i++)
        {
            if(arr2[i]==initial)
            {
                map.put(arr2[i],rank);
            }
            else
            {
                rank++;
                initial=arr2[i];
                map.put(arr2[i],rank);
            }
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int m=map.get(arr[i]);
            ans[i]=m;
        }
        return ans;
    }
}