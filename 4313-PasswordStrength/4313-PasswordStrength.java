// Last updated: 15/08/2026, 19:46:35
class Solution {
    public int passwordStrength(String pass) {
        HashSet<Character>s=new HashSet<>();

        int ans=0;

        for(char c:pass.toCharArray())
            {
                if(s.contains(c))
                {
                    continue;
                }
                s.add(c);
                if(c>='a' && c<='z')
                {
                    ans+=1;
                }
                else if(c>='A' && c<='Z')
                {
                    ans+=2;
                }
                else if(c>='0' && c<='9')
                {
                    ans+=3;
                }
                else if(c=='!' || c=='@' || c=='#' || c=='$')
                {
                    ans+=5;
                }
            }

        return ans;
    }
}