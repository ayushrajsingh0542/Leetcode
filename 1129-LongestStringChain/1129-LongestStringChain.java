// Last updated: 15/08/2026, 19:57:13
class Solution {
    public int compare(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        int diff=0;
        
        if(n2-n1!=1)
        return -1;

        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                diff++;
                j++;
            }
        }

        diff+=n2-j;
        return diff;
        
    }
    public int longestStrChain(String[] words) {
        int n=words.length;
        int max[]=new int[n];
        Arrays.fill(max,1);
       Arrays.sort(words,(a,b)->{
        return a.length()-b.length();
       });
        for(int i=0;i<n;i++)
        {
            for(int prev=0;prev<i;prev++)
            {
                if((compare(words[prev],words[i])==1) &&(1+max[prev]>max[i]))
                {
                    max[i]=1+max[prev];
                }
            }
        }

        int maxi=1;

        for(int i=0;i<n;i++)
        {
            maxi=Math.max(maxi,max[i]);
        }

        return maxi;
    }
}