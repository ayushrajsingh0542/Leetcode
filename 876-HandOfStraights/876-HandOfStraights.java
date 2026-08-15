// Last updated: 15/08/2026, 19:58:56
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
        return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<hand.length;i++)
        {
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        int temp=0;
        for(int i=0;i<hand.length;i++)
        {
            temp=0;
            if(!map.containsKey(hand[i]))
            {
                continue;
            }
            int x=hand[i];
            while(temp!=groupSize)
            {
                if(map.containsKey(x))
                {
                    if(map.get(x)==1)
                    {
                        map.remove(x);
                    }
                    else
                    {
                        map.put(x,map.get(x)-1);
                    }
                    x++;
                    temp++;
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