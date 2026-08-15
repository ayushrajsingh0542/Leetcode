// Last updated: 15/08/2026, 19:58:53
class Solution {
    public boolean lemonadeChange(int[] bills) {

       int five=0;
       int ten=0;
       for(int i=0;i<bills.length;i++)
       {
        if(bills[i]==5)
        {
            five+=1;
        }
        if(bills[i]==10)
        {
            if(five>=1)
            {
                five-=1;
                ten+=1;
            }
            else
            {
                return false;
            }
        }
        if(bills[i]==20)
        {
           if(five>=1 && ten>=1)
           {
            five-=1;
            ten-=1;
            continue;
           }
           if(five>=3)
           {
            five-=3;
            continue;
           }
           else
           {
            return false;
           }
        }
       }

       return true;
    }
}