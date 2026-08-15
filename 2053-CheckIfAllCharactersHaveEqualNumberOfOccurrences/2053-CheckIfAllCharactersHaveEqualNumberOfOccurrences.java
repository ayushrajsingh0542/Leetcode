// Last updated: 15/08/2026, 19:53:00
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n= s.length();
        int count =0;
        
      HashMap<Character,Integer> map = new HashMap<>(); 
      for(int i=0; i<n; i++) {   
        char c=s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
      }
            
        count = map.get(s.charAt(0)); 
        for(int i=0;i<n;i++)
        {
            if(map.get(s.charAt(i))!=count)
            return false;
        }
    
      return true;
    }
}