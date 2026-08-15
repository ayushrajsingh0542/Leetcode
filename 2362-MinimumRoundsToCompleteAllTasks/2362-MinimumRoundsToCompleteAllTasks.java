// Last updated: 15/08/2026, 19:51:51
class Solution {
    public int minimumRounds(int[] tasks) {
        int n=tasks.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num=tasks[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int k:map.keySet())
        {
            if(map.get(k)==1)
            return -1;
        }
        int count=0;
        for(int k:map.keySet())
        {
            int freq=map.get(k);
            count=count+(int)(Math.ceil(freq/3.0));
        }
        return count;
    }
}