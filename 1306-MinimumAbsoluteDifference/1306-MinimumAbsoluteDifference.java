// Last updated: 15/08/2026, 19:56:11
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int mini=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            mini=Math.min(mini,arr[i]-arr[i-1]);
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1]==mini)
            {
                List<Integer>list=new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }
        return ans;

    }
}