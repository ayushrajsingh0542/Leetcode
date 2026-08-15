// Last updated: 15/08/2026, 20:00:07
class Solution {
    double ep=1e-6;
    public boolean rec(List<Double>list)
    {
        if(list.size()==1)
        {
            return Math.abs(list.get(0)-24.0)<=ep;
        }
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.size();j++)
            {
                if(i==j)
                continue;

                List<Double>temp=new ArrayList<>();
                for(int k=0;k<list.size();k++)
                {
                    if(k!=i && k!=j)
                    {
                        temp.add(list.get(k));
                    }
                }
                List<Double>list2=new ArrayList<>();
                double a=list.get(i);
                double b=list.get(j);
                list2.add(a+b);
                list2.add(a-b);
                list2.add(b-a);
                list2.add(a*b);
                if(Math.abs(a)>0)
                list2.add(b/a);
                if(Math.abs(b)>0)
                list2.add(a/b);
                for(double val:list2)
                {
                    temp.add(val);
                    if(rec(temp))
                    {
                        return true;
                    }
                    temp.remove(temp.size()-1);
                }
            }
        }
        return false;
    }
    public boolean judgePoint24(int[] cards) {
        List<Double> list=new ArrayList<>();
        for(int i=0;i<cards.length;i++)
        list.add((double)cards[i]);
        return rec(list);
    }
}