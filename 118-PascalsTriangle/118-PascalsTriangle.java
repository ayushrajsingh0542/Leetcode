// Last updated: 15/08/2026, 20:07:07
class Solution {
    public static List<Integer> gen(int rows)
    {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        int ans=1;
        for(int i=1;i<rows;i++)
        {
            ans=ans*(rows-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> mainL=new ArrayList<>();
       
        int ans=1;
        for(int i=1;i<=n;i++)
        {
           List<Integer> list=gen(i);
            mainL.add(list);
        }
        return mainL;
    }
}