// Last updated: 15/08/2026, 19:47:25
class Solution {
    public String reverseByType(String s) {
        List<Character>l=new ArrayList<>();
        List<Character>sp=new ArrayList<>();

        for(char c:s.toCharArray())
            {
                if(c>='a' && c<='z')
                    l.add(c);
                else
                    sp.add(c);
            }
        Collections.reverse(l);
        Collections.reverse(sp);

        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        for(char c:s.toCharArray())
            {
                if(c>='a' && c<='z')
                    sb.append(l.get(i++));
                else
                    sb.append(sp.get(j++));
            }
        return sb.toString();
    }
}