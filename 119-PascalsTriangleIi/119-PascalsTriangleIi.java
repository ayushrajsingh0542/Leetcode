// Last updated: 15/08/2026, 20:07:05
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>ans=new ArrayList<>();
        
        ans.add(1);
        if(rowIndex==0)
        return ans;
        ans.add(1);
         if(rowIndex==1)
        return ans;
        int k=2;
        while(k<=rowIndex)
        {
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<=k;i++)
            {
                if(i==0)
                list.add(ans.get(i));
                else if(i==k)
                list.add(ans.get(i-1));
                else 
                {
                    int n1=ans.get(i-1);
                    int n2=ans.get(i);  
                    list.add(n1+n2);
                }
            }
            ans=new ArrayList<>();
            for(int i=0;i<list.size();i++)
            ans.add(list.get(i));
            k++;
        }
        return ans;
    }
}