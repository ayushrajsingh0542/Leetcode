// Last updated: 15/08/2026, 20:02:22
class Solution {
    static class Info
    {
        String word;
        int steps;
        Info(String w,int s)
        {
            this.word=w;
            this.steps=s;
        }
    }
    public int minMutation(String startGene, String endGene, String[] bank) {
        Queue<Info>q=new LinkedList<>();
        HashSet<String>st=new HashSet<>();
        for(int i=0;i<bank.length;i++)
        {
            st.add(bank[i]);
        }
        q.add(new Info(startGene,0));
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            String word=curr.word;
            int steps=curr.steps;
            if(word.equals(endGene))
            {
                return steps;
            }
            for(int i=0;i<word.length();i++)
            {
                for(char ch='A';ch<='Z';ch++)
                {
                    char wordArray[]=word.toCharArray();
                    wordArray[i]=ch;
                    String newWord=new String(wordArray);
                    if(st.contains(newWord))
                    {
                        st.remove(newWord);
                        q.add(new Info(newWord,steps+1));
                    }
                }
            }
        }
        return -1;
    }
}