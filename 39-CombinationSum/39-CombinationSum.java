// Last updated: 15/08/2026, 20:10:02
class Solution {
    public static void comb(int n,int idx,int target,int arr[],List<List<Integer>> mainL,List<Integer> list)
    {
         if(target==0)
            {
                mainL.add(new ArrayList<>(list));
                return;
            }
        if(n==idx || target<0)
        {
           
            return;
        }
        if(arr[idx]<=target)
        {
            list.add(arr[idx]);
            comb(n,idx,target-arr[idx],arr,mainL,list);
            list.remove(list.size()-1);
        }
        comb(n,idx+1,target,arr,mainL,list);
        
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> mainL=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        comb(arr.length,0,target,arr,mainL,list);
        return mainL;
    }
}