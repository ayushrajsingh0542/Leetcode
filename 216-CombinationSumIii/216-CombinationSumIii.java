// Last updated: 15/08/2026, 20:04:16
class Solution {
    public static void comb(int n,int idx,int target,int arr[],List<Integer> list,List<List<Integer>>mainL)
    {
        if(idx==n)
        {
            if(target==0)
            {
                 
                mainL.add(new ArrayList<>(list));
            }
          
            return;
        }
        if(arr[idx]<=target)
        {
            list.add(arr[idx]);
            comb(n,idx+1,target-arr[idx],arr,list,mainL);
            list.remove(list.size()-1);
        }
        
        comb(n,idx+1,target,arr,list,mainL);
        
        
        
    }
    public List<List<Integer>> combinationSum3(int k, int target) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> mainL=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        comb(9,0,target,arr,list,mainL);
         for(int i=mainL.size()-1;i>=0;i--)
         {
             List<Integer>temp=mainL.get(i);
           if(temp.size()!=k)
            {
               mainL.remove(temp);
            }
         }
        return mainL;
        
    }
}