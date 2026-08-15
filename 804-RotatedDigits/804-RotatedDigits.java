// Last updated: 15/08/2026, 19:59:14
class Solution {
    static int func(int digit)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(8,8);
        map.put(2,5);
        map.put(5,2);
        map.put(6,9);
        map.put(9,6);

        return map.get(digit);
    }
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            int mul=1;
            int check=0;
            while(num>0)
            {
                int d=num%10;
                if(d==3||d==4||d==7)
                {
                check=-1;
                break;
                }
                check=func(d)*mul+check;
                mul*=10;
                num/=10;


            }
            if(check!=-1 && check!=i)
            count++;
        }

        return count;
    }
}