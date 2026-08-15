// Last updated: 15/08/2026, 19:48:38
class Solution {
    public int[] decimalRepresentation(int n) {
        int mul=1;
        List<Integer>list=new ArrayList<>();
        while(n>0)
            {
                int x=n%10;
                int x2=x*mul;
                if(x!=0)
                    list.add(x2);
                n/=10;
                mul*=10;
            }
        int ans[]=new int[list.size()];
        int j=list.size()-1;
        for(int i=0;i<list.size();i++)
            {
                ans[i]=list.get(j);
                j--;
            }
        return ans;
    }
}