// Last updated: 15/08/2026, 19:49:35
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      
      int len=0;
      for(int i=0;i<fruits.length;i++)
      {
        for(int j=0;j<baskets.length;j++)
        {
            if(fruits[i]<=baskets[j] && baskets[j]!=-1)
            {
                baskets[j]=-1;
                len++;
                break;
            }

        }
      }
      return fruits.length-len;
    }
}