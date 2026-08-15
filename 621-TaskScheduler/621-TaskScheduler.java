// Last updated: 15/08/2026, 20:00:39
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int alpha[]=new int[26];
        for(char ch:tasks)
        {
            alpha[ch-'A']++;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<alpha.length;i++)
        {
            if(alpha[i]>0)
            pq.add(alpha[i]);
        }
        int totalT=0;
        while(!pq.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            int total=n+1;
            while(!pq.isEmpty() && total>0)
            {
                int curr=pq.remove();
                if(curr>1)
                list.add(curr-1);
                totalT++;
                total--;

            } 
            pq.addAll(list);
            if(!pq.isEmpty())
            totalT+=total;
        }
        return totalT;
    }
}