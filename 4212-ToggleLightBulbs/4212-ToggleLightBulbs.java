// Last updated: 15/08/2026, 19:47:22
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean a[]=new boolean[101];

        for(int b:bulbs)
            {
                a[b]=!a[b];
            }

        List<Integer>res=new ArrayList<>();
        for(int i=1;i<=100;i++)
            {
                if(a[i])
                    res.add(i);
            }
        return res;
    }
}