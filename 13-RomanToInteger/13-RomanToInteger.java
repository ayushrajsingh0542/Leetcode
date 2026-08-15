// Last updated: 15/08/2026, 20:11:01
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        if(s.length()==1)
        {
            return map.get(s.charAt(0));
        }
        int ans=0;
        int i=0;
        while(i<s.length())
        {
            if(i!=s.length()-1)
            {
            if(map.get(s.charAt(i+1))<=map.get(s.charAt(i)))
            {
                ans+=map.get(s.charAt(i));
                i++;
                continue;
            }
            if(map.get(s.charAt(i+1))>map.get(s.charAt(i)))
            {
                int nums=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                ans+=nums;
                i+=2;
                continue;
            }
            }
           if(i==s.length()-1)
            {
                if(map.get(s.charAt(i))<=map.get(s.charAt(i-1)))
                {
                    ans+=map.get(s.charAt(i));
                    i++;
                }
            }
        }
        return ans;
    }

}