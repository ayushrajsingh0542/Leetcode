// Last updated: 15/08/2026, 19:50:16
class Solution {
    public static int isValid(ArrayList<Integer> list,int k)
    {
        for(int i=1;i<k;i++)
        {
            if(list.get(i)<list.get(i-1))
            {
                return -1;
            }
            if(list.get(i-1)+1!=list.get(i))
            {
                return -1;
            }
        }
        return list.get(k-1);
    }
    public int[] resultsArray(int[] nums, int k) {

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int temp=k;
        for(int i=k-1;i<n;i++)
        {
            int temp2=1;
            while(temp!=0)
            {

            
            list.add(nums[i-k+temp2]);
            temp--;
            temp2++;
            }
            temp=k;
            ans.add(isValid(list,k));
            list=new ArrayList<>();
        }

        int finalans[]=new int [ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            finalans[i]=ans.get(i);
        }
        return finalans;
        
    }
}