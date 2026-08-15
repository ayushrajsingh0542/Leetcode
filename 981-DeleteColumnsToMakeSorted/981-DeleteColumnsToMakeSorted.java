// Last updated: 15/08/2026, 19:58:15
class Solution {
    boolean isSorted(int i, String[] strs, int m)
    {
       int prev = -1; 
       int j = 0; 
       while(j<m)
       {
         int cur = strs[j].charAt(i) - 'a';
         if(cur<prev)
         return false; 
         prev = cur;
         j++;
       } 
       return true;
    }

    public int minDeletionSize(String[] strs) {
    int m= strs.length;
    int n = strs[0].length();
    int count = 0; 
    for(int i =0; i<n; i++)
    {
      if(isSorted(i, strs, m))
      count++;   
    } 
       return n - count;     
    }
}