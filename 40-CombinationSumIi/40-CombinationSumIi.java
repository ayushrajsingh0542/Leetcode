// Last updated: 15/08/2026, 20:09:57
class Solution {
    public static void rec(int idx,int sum,int arr[],List<Integer> list,List<List<Integer>> ans)
    {
        if(sum==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx==arr.length||sum<0)
        {
            return;
        }
        list.add(arr[idx]);
        rec(idx+1,sum-arr[idx],arr,list,ans);
        list.remove(list.size()-1);
        for(int j=idx+1;j<arr.length;j++)
        {
            if(arr[j]!=arr[idx])
            {
                rec(j,sum,arr,list,ans);
                break;
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //your code goes here
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        rec(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
}