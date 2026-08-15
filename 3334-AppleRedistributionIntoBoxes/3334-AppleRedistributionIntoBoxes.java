// Last updated: 15/08/2026, 19:50:26
class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        int total=0;
        for(int i:apple)
        total+=i;
        Arrays.sort(cap);
        int count=0;
        int tot2=0;
        for(int i=cap.length-1;i>=0;i--)
        {
           tot2+=cap[i];
           count++;
           if(tot2>=total)
           {
            
            break;
           }
        }
        return count;
    }
}