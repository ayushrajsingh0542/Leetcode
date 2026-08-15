// Last updated: 15/08/2026, 20:04:32
class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(map.containsKey(c))
            {
                if(d!=map.get(c))
                {
                    return false;
                }
            }
            else
            {
                map.put(c,d);
            }
        }
        map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(map.containsKey(d))
            {
                if(c!=map.get(d))
                {
                    return false;
                }
            }
            else
            {
                map.put(d,c);
            }
        }
        return true;
        
    }
}