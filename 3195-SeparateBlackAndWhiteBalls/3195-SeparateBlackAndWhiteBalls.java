// Last updated: 15/08/2026, 19:50:50
class Solution {
    public long minimumSteps(String s) {

        int freq1=0;
        long score=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                score+=freq1;
            }
            if(s.charAt(i)=='1')
            {
                freq1++;
            }
        }
        return score;
    }
}