// Last updated: 15/08/2026, 19:46:20
class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int ex=0;

        for(char ch:moves.toCharArray())
        {
            if(ch=='U')
            {
                y++;
            }
            else if(ch=='D')
            {
                y--;
            }
            else if(ch=='R')
            {
                x++;
            }
            else if(ch=='L')
            {
                x--;
            }
            else
            {
                ex++;
            }
        }

        return Math.abs(x)+Math.abs(y)+ex;
    }
}