// Last updated: 15/08/2026, 19:48:32
class Solution {
    public int longestBalanced(String s) {
        
        
        int n=s.length();
        
        int maxlen=1;
        for(int i=0;i<n;i++)
        {
            HashMap<Character,Integer>map=new HashMap<>();
           
            int max=1;
            for(int j=i;j<n;j++)
            {
               char ch=s.charAt(j);
               map.put(ch,map.getOrDefault(ch,0)+1);
               max=Math.max(max,map.get(ch));
               if((j-i+1)==max*map.size())
               {
                maxlen=Math.max(maxlen,(j-i+1));
               }
                
               
            }
        }

        return maxlen;
    }
}