// Last updated: 15/08/2026, 20:06:46
class Solution {
    class Info
    {
        String first;
        int second;
        Info(String f,int s)
        {
            this.first=f;
            this.second=s;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Queue<Info> q=new LinkedList<>();
            q.add(new Info(beginWord,1));
            HashSet<String> st=new HashSet<>();
            for(int i=0;i<wordList.size();i++)
            {
                st.add(wordList.get(i));
            }
            while(!q.isEmpty())
            {
                Info curr=q.remove();
                String word=curr.first;
                int steps=curr.second;
                if(word.equals(endWord))
                {
                    return steps;
                }
                for(int i=0;i<word.length();i++)
                {
                    for(char ch='a';ch<='z';ch++)
                    {
                        char charArray[]=word.toCharArray();
                        charArray[i]=ch;
                        String newWord=new String(charArray);
                        if(st.contains(newWord))
                        {
                            st.remove(newWord);
                            q.add(new Info(newWord,steps+1));
                        }
                    }
                }
            }
            return 0;
    }
}